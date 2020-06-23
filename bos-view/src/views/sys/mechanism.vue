<template>
  <div class="app-container">
    <div class="filter-container">
      部门名：<el-input v-model="listQuery.mechanismName" placeholder="部门名" style="width: 200px;" class="filter-item"/>
      负责人：<el-select v-model="listQuery.sid" placeholder="请选择负责人" style="width: 200px;" class="filter-item">
        <el-option
          v-for="item in staffList"
          :key="temp.sid"
          :label="item.name"
          :value="item.sid">
        </el-option>
      <el-option
        :label="null"
        :value="null">
      </el-option>
      </el-select>
      状态：<el-input v-model="listQuery.staus" placeholder="状态" style="width: 200px;" class="filter-item"/>
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
          <span>{{ scope.row.mid }}</span>
        </template>
      </el-table-column>

      <el-table-column label="部门名" min-width="150px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.mechanismName }}</span>
        </template>
      </el-table-column>
      <!--<el-table-column label="负责人" min-width="150px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.sysStaff.name }}</span>
        </template>
      </el-table-column>-->
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
        <el-form-item label="部门名" prop="mechanismName">
          <el-input placeholder="请输入用户名" v-model="temp.mechanismName" />
        </el-form-item>
        <el-form-item label="负责人" prop="branch">
          <el-select v-model="temp.sid" placeholder="请选择">
            <el-option
              v-for="item in staffList"
              :key="temp.sid"
              :label="item.name"
              :value="item.sid">
            </el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="上级部门" prop="branch">
          <el-select v-model="temp.branch" placeholder="请选择">
            <el-option
              v-for="item in options"
              :key="temp.mid"
              :label="item.label"
              :value="item.value">
            </el-option>
            <el-option
              v-for="items in list"
              :key="items.mid"
              :label="items.mechanismName"
              :value="items.mid">
            </el-option>
          </el-select>
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
import Pagination from "@/components/Pagination/index";
import waves from "@/directive/waves";
import {listMechanism, updateMechanism, deleteMechanism, addMechanism} from "@/api/sys/mechanism";
import {staffid, groupstaff} from "@/api/sys/user";

export default {
  name: "Mechanism",
  components: { Pagination },
  directives: { waves },
  data() {
    return {
      options: [{
        value: '0',
        label: '无上级'
      }],
      tableKey: 0,
      list: null, // 后台返回，给数据表格展示的数据
      total: 0, // 总记录数
      listLoading: true, // 是否使用动画
      listQuery: {
        page: 1, // 分页需要的当前页
        limit: 10, // 分页需要的每页显示多少条
        sex: 1,
        // name: ''
      },
      staffId: '',
      staffList: null, // 后台查询出来，分好组的部门信息
      temp: { // 添加、修改时绑定的表单数据
        mid: undefined,
        mechanismName: '',
        sid: '',
        branch: '',
        createId: ''
      },
      title: '添加', // 对话框显示的提示 根据dialogStatus create
      dialogFormVisible: false, // 是否显示对话框
      dialogStatus: '', // 表示表单是添加还是修改的
      rules: {
        // 校验规则
        mechanismName: [{ required: true, message: '用户名必填', trigger: 'blur' }],
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
    // 获得分好组的部门信息
    getGroupStaff () {
      groupstaff().then((response) => {
        this.staffList = response.data.staffList
      })
    },
    getStaffId () {
      staffid().then((response) => {
        this.staffId = response.data.createId
      })
    },
    // 去后台取数据的
    getList() {
      // 开始转圈圈
      this.listLoading = true
      // debugger // 调试
      listMechanism(this.listQuery).then(response => {
        this.list = response.data.items
        this.total = response.data.total
        // 转圈圈结束
        this.listLoading = false
      })
    },
    // 重置表单数据
    resetTemp() {
      this.temp = {
        mid: undefined,
        mechanismName: '',
        sid: '',
        branch: '',
        createId: ''
      }
    },
    // 显示添加的对话框
    handleCreate () {
      // 重置表单数据
      this.resetTemp()
      // 点击确定时，是执行添加操作
      this.dialogStatus = 'create'
      this.title="添加部门"
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
          this.temp.createId=this.staffId
          addMechanism(this.temp).then((response) => {

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
      this.title = '修改部门'
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
          //this.temp.sysStaff=null
          const tempData = Object.assign({}, this.temp)
          // 进行ajax提交
          updateMechanism(tempData).then((response) => {
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
      this.$confirm('确认删除【'+row.mechanismName+'】的信息吗?', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        // 调用ajax去后台删除
        deleteMechanism(row.mid).then((response) => {
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
        });
      });

    }
  }
}
</script>

<style scoped>

</style>
