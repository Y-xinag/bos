<template>
  <div class="app-container">
    <div class="filter-container">
      <el-input v-model="listQuery.title" placeholder="岗位名" style="width: 200px;" class="filter-item"/>
      <el-button v-waves class="filter-item" type="primary" icon="el-icon-search" @click="getList">
        查询
      </el-button>
      <el-button class="filter-item" style="margin-left: 10px;" type="primary" icon="el-icon-edit" @click="handleCreate()">
        添加
      </el-button>
    </div>
    <!--  数据表格-->
    <el-table
      :key="tableKey"
      v-loading="listLoading"
      :data="list"
      border
      fit
      highlight-current-row
      style="width: 100%;"
    >
      <el-table-column label="ID" prop="id" sortable="custom" align="center" width="80">
        <template slot-scope="scope">
          <span>{{ scope.row.id }}</span>
        </template>
      </el-table-column>

      <el-table-column label="标题" min-width="150px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.title }}</span>
        </template>
      </el-table-column>
      <el-table-column label="咨询来源" min-width="150px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.source }}</span>
        </template>
      </el-table-column>
      <el-table-column label="资讯类型" min-width="150px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.type }}</span>
        </template>
      </el-table-column>
      <el-table-column label="资讯内容" min-width="150px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.content }}</span>
        </template>
      </el-table-column>
      <el-table-column label="资讯发布时间" min-width="150px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.time }}</span>
        </template>
      </el-table-column>
      <el-table-column label="创建时间" width="150px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.createTime | parseTime('{y}-{m}-{d} {h}:{i}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="状态" min-width="150px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.staus }}</span>
        </template>
      </el-table-column>

      <!--     自定义列-->
      <el-table-column label="操作" align="center" width="230" class-name="small-padding fixed-width">
        <template slot-scope="{row}">
          <el-button type="primary" size="mini" @click="handleUpdate(row)">
            修改
          </el-button>
          <el-button size="mini" type="danger" @click="handleDelete(row)">
            删除
          </el-button>
        </template>
      </el-table-column>
    </el-table>
    <!-- 分页工具条  page当前页 total总记录数 limit每页显示多少条 pagination触发自定义事件，查询数据-->
    <pagination v-show="total>0" :total="total" :page.sync="listQuery.page" :limit.sync="listQuery.limit" @pagination="getList" />
    <el-dialog :title="title" :visible.sync="dialogFormVisible" style="width: 80%">
      <!--
          rules:校验规则
          model:数据绑定
      -->
      <el-form ref="dataForm" :rules="rules" :model="temp" label-position="left" label-width="70px" style="width: 80%; margin-left:50px;">
        <!--        数据校验要求prop值和temp.属性名一致-->
        <el-form-item label="标题" prop="title">
          <el-input placeholder="请输入标题" v-model="temp.title" />
        </el-form-item>
        <el-form-item label="来源" prop="source">
          <el-input placeholder="请输入来源" v-model="temp.source" />
        </el-form-item>
        <el-form-item label="咨询类型" prop="type">
          <el-select v-model="temp.type" placeholder="选择咨询类型">
            <el-option label="领导讲话" value="领导讲话" />
            <el-option label="廉政要闻" value="廉政要闻" />
            <el-option label="文件制度" value="文件制度" />
            <el-option label="警钟长鸣" value="警钟长鸣" />
          </el-select>
        </el-form-item>
        <el-form-item label="咨询内容">
          <el-card style="height: 610px;">
            <quill-editor v-model="temp.content" ref="myQuillEditor" style="height: 500px;" :options="editorOption">
            </quill-editor>
          </el-card>
        </el-form-item>
        <el-form-item label="咨询发布时间" prop="time">
          <el-date-picker
            v-model="temp.time"
            type="datetime"
            placeholder="选择日期">
          </el-date-picker>
        </el-form-item>

      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">
          取消
        </el-button>
        <!--
          dialogStatus==='create'?createData():updateData()
          dialogStatus需要我们根据情况去改变
        -->
        <el-button type="primary" @click="dialogStatus==='create'?createData():updateData()">
          确认
        </el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import Pagination from '@/components/Pagination/index'
import waves from '@/directive/waves'
import { staffid, groupstaff } from '@/api/sys/user'
import { educationPoliticslist, educationPoliticsAdd, educationPoliticsDelete, educationPoliticsUpdate } from '@/api/sys/educationPolitics'
import { quillEditor } from 'vue-quill-editor'
import 'quill/dist/quill.core.css'
import 'quill/dist/quill.snow.css'
import 'quill/dist/quill.bubble.css'

export default {
  name: "educationPolitics",
  components: { Pagination, quillEditor },
  directives: { waves },
  data() {
    return {
      tableKey: 0,
      list: null, // 后台返回，给数据表格展示的数据
      total: 0, // 总记录数
      listLoading: true, // 是否使用动画
      listQuery: {
        page: 1, // 分页需要的当前页
        limit: 10, // 分页需要的每页显示多少条
        sex: 1,
        name: ''
      },
      staffId: '',
      staffList: null,
      mechanismList: [], // 后台查询出来，分好组的部门信息
      temp: { // 添加、修改时绑定的表单数据
        id: undefined,
        title: '',
        source: '',
        type: '',
        content: '',
        time: '',
        createTime: '',
        createId: '',
        staus: ''
      },
      title: '添加', // 对话框显示的提示 根据dialogStatus create
      dialogFormVisible: false, // 是否显示对话框
      dialogStatus: '', // 表示表单是添加还是修改的
      rules: {
        // 校验规则
        pname: [{ required: true, message: '用户名必填', trigger: 'blur' }]
        // password: [{required: true, message: '密码大于六位', trigger: 'blur'}]
      }
    }
  },
  // 创建实例时的钩子函数
  created() {
    this.getList()
    // 在创建时初始化获得部门信息
    this.getGroupStaff()
    this.getStaffId()
  },
  methods: {
    getGroupStaff() {
      groupstaff().then((response) => {
        this.staffList = response.data.staffList
      })
    },
    getStaffId() {
      staffid().then((response) => {
        this.staffId = response.data.createId
      })
    },
    // 去后台取数据的
    getList() {
      // 开始转圈圈
      this.listLoading = true
      // debugger // 调试
      educationPoliticslist(this.listQuery).then(response => {
        this.list = response.data.items
        this.total = response.data.total
        // 转圈圈结束
        this.listLoading = false
      })
    },
    // 重置表单数据
    resetTemp() {
      this.temp = {
        id: undefined,
        title: '',
        source: '',
        type: '',
        content: '',
        time: '',
        createTime: '',
        createId: '',
        staus: ''
      }
    },
    // 显示添加的对话框
    handleCreate() {
      // 重置表单数据
      this.resetTemp()
      // 点击确定时，是执行添加操作
      this.dialogStatus = 'create'
      this.title = '添加岗位'
      // 显示对话框
      this.dialogFormVisible = true
      this.$nextTick(() => {
        // 表单清除验证
        this.$refs['dataForm'].clearValidate()
      })
    },
    // 添加对话框里，点击确定，执行添加操作
    createData() {
      // 表单校验
      this.$refs['dataForm'].validate((valid) => {
        // 所有的校验都通过
        if (valid) {
          // 调用api里的sys里的user.js的ajax方法
          this.temp.createId = this.staffId
          educationPoliticsAdd(this.temp).then((response) => {
            // 关闭对话框
            this.dialogFormVisible = false
            // 刷新数据表格里的数据
            this.getList()
            // 显示一个通知
            this.$notify({
              title: '成功',
              message: response.data.message,
              type: 'success',
              duration: 2000
            })
          })
        }
      })
    },
    // 显示修改对话框
    handleUpdate(row) {
      // 将row里面与temp里属性相同的值，进行copy
      this.temp = Object.assign({}, row) // copy obj
      // 将对话框里的确定点击时，改为执行修改操作
      this.dialogStatus = 'update'
      // 修改标题
      this.title = '修改岗位'
      // 显示修改对话框
      this.dialogFormVisible = true
      this.$nextTick(() => {
        // 清除校验
        this.$refs['dataForm'].clearValidate()
      })
    },
    // 执行修改操作
    updateData() {
      this.$refs['dataForm'].validate((valid) => {
        // 表单校验通过
        if (valid) {
          // 将temp拷贝到tempData
          const tempData = Object.assign({}, this.temp)
          // 进行ajax提交
          educationPoliticsUpdate(tempData).then((response) => {
            // 提交完毕，关闭对话框
            this.dialogFormVisible = false
            // 刷新数据表格
            this.getList()
            // 显示通知
            this.$notify({
              title: '成功',
              message: response.data.message,
              type: 'success',
              duration: 2000
            })
          })
        }
      })
    },
    handleDelete(row) {
      // 先弹确认取消框
      this.$confirm('确认删除【' + row.title + '】的信息吗?', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        // 调用ajax去后台删除
        educationPoliticsDelete(row.id).then((response) => {
          // 刷新数据表格
          this.getList()
          // ajax去后台删除
          this.$notify({
            title: '成功',
            message: response.data.message,
            type: 'success',
            duration: 2000
          })
        })
      }).catch(() => {
        this.$message({
          type: 'info',
          message: '已取消删除'
        })
      })
    }
  }
}
</script>

<style scoped>

</style>
