<template>
  <div class="app-container">
    <div class="filter-container">
      <!--      <el-input v-model="listQuery.search" placeholder="用户名" style="width: 200px;" class="filter-item"/>-->
      <el-select v-model="listQuery.search" placeholder="请输入谈话类型" style="width: 200px;" class="filter-item">
        <el-option label="任前廉政谈话" value="任前廉政谈话" />
        <el-option label="提醒谈话" value="提醒谈话" />
        <el-option label="廉政谈话" value="廉政谈话" />
      </el-select>
      <el-button v-waves class="filter-item" type="primary" icon="el-icon-search" @click="onSerch()">
        查询
      </el-button>
      <el-button class="filter-item" style="margin-left: 10px;" type="primary" icon="el-icon-edit" @click="handleCreate">
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
      @selection-change="changeFun"
    >
      <el-table-column type="selection" />
      <el-table-column label="编号" prop="id" sortable="custom" align="center" width="80">
        <template slot-scope="scope">
          <span>{{ scope.row.id }}</span>
        </template>
      </el-table-column>

      <el-table-column label="谈话类型" min-width="200px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.talktype }}</span>
        </template>
      </el-table-column>

      <el-table-column label="谈话时间" width="150px" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.talktime | parseTime('{y}-{m}-{d} {h}:{i}') }}</span>
        </template>
      </el-table-column>

      <el-table-column label="谈话地点" min-width="200px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.talkplace }}</span>
        </template>
      </el-table-column>

      <el-table-column label="审核状态" min-width="200px">
        <template slot-scope="{row}">
          <span class="link-type">{{ row.staus }}</span>
        </template>
      </el-table-column>

      <!--      <el-table-column label="用户名" min-width="150px">-->
      <!--        <template slot-scope="{row}">-->
      <!--          <span class="link-type">{{ row.sysStaff.username }}</span>-->
      <!--        </template>-->
      <!--      </el-table-column>-->
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

    <!--  绑定了title，是一个数组里取的，表示是修改的标题还是添加的标题
      visible.sync 对话框是否显示
    -->
    <el-dialog :title="title" :visible.sync="dialogFormVisible" style="width: 100%">
      <!--
          rules:校验规则
          model:数据绑定
      -->
      <el-form ref="dataForm" :rules="rules" :model="temp" label-position="left" label-width="70px" style="width: 80%; margin-left:50px;">
        <!--        数据校验要求prop值和temp.属性名一致-->
        <!--        <el-form-item label="用户名" prop="username">-->
        <!--          <el-select v-model="temp.createId" placeholder="请选择">-->
        <!--            <el-option-->
        <!--              v-for="staff in stafflist"-->
        <!--              :key="staff.createId"-->
        <!--              :label="staff.username"-->
        <!--              :value="staff.createId">-->
        <!--            </el-option>-->
        <!--          </el-select>-->
        <!--        </el-form-item>-->
        <el-form-item label="谈话单位" prop="mid">
          <el-select v-model="temp.mid" placeholder="请选择单位">
            <el-option
              v-for="(item, index) in deptlist"
              :key="index"
              :value="item.value"
              :label="item.label"
            />
            <!--            <el-option  label="纪检部" value="1"></el-option>-->
            <!--            <el-option  label="组织部" value="2"></el-option>-->
            <!--            <el-option  label="宣传部" value="3"></el-option>-->
          </el-select>

        </el-form-item>

        <el-form-item label="记录人" prop="createId">
          <el-select v-model="temp.createId" placeholder="请选择记录人">
            <el-option
              v-for="(item, index) in people"
              :key="index"
              :value="item.value"
              :label="item.label"
            />
            <!--            <el-option label="admin" value="1"></el-option>-->
            <!--            <el-option label="sasha" value="2"></el-option>-->
            <!--            <el-option label="aliss" value="3"></el-option>-->
          </el-select>

        </el-form-item>

        <el-form-item label="谈话姓名" prop="pid">
          <el-select v-model="temp.pid" placeholder="请输入姓名">
            <!--            <el-option label="管理员" value="1"></el-option>-->
            <!--            <el-option label="超级管理员" value="2"></el-option>-->
            <!--            <el-option label="普通用户" value="3"></el-option>-->
            <el-option
              v-for="(item, index) in person"
              :key="index"
              :value="item.value"
              :label="item.label"
            />
          </el-select>

        </el-form-item>

        <el-form-item label="政治面貌" prop="politicaloutlook">
          <el-select v-model="temp.politicaloutlook" placeholder="请输入面貌">
            <el-option label="群众" value="群众" />
            <el-option label="团员" value="团员" />
            <el-option label="预备党员" value="预备党员" />
          </el-select>

        </el-form-item>

        <el-form-item label="谈话时间" prop="talktime">
          <el-input v-model="temp.talktime " />
        </el-form-item>

        <el-form-item label="谈话类型" prop="talktype">
          <el-select v-model="temp.talktype" placeholder="请输入类型">
            <el-option label="任前廉政谈话" value="任前廉政谈话" />
            <el-option label="提醒谈话" value="提醒谈话" />
            <el-option label="廉政谈话" value="廉政谈话" />
          </el-select>

        </el-form-item>

        <el-form-item label="谈话职务" prop="post">
          <el-input v-model="temp.post" placeholder="请输入职务" />
        </el-form-item>

        <el-form-item label="谈话地点" prop="talkplace">
          <el-input v-model="temp.talkplace" placeholder="请输入谈话地点" />
        </el-form-item>

        <el-form-item label="谈话提纲">
          <el-input
            v-model="temp.talktitle"
            type="textarea"
            :rows="4"
            placeholder="请输入内容"
          />
        </el-form-item>

        <el-form-item label="谈话内容">
          <el-input
            v-model="temp.talkcontent"
            type="textarea"
            :rows="4"
            placeholder="请输入内容"
          />
        </el-form-item>

        <el-form-item label="创建人" prop="createName">
          <el-input v-model="temp.createName" placeholder="请输入创建人" />
        </el-form-item>

        <el-form-item label="创建时间" prop="createTime">
          <el-input v-model="temp.createTime " />
        </el-form-item>

        <el-form-item label="审核状态" prop="staus">
          <el-select v-model="temp.staus" placeholder="请输入类型">
            <el-option label="未审核" value="未审核" />
            <el-option label="审核中" value="审核中" />
            <el-option label="已审核" value="已审核" />
          </el-select>
        </el-form-item>

        <!--        <el-form-item label="状态" prop="status">-->
        <!--          <el-input v-model="temp.staus" />-->
        <!--        </el-form-item>-->
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
import { add, update, list, deleteUser, queryBytitle } from '@/api/sys/RdHonestConversation'
import waves from '@/directive/waves' // waves directive
import { parseTime } from '@/utils'
import Pagination from '@/components/Pagination'
import { groupStaff } from '@/api/sys/SysStaff' // 分页组件
export default {
  name: 'UserTable',
  components: { Pagination },
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
        username: '',
        search: ''
      },
      checkBoxData: [],
      stafflist: [], // 后台查询出来，分好组的部门信息
      deptlist: [
        {
          value: 1,
          label: '纪检部'
        },
        {
          value: 2,
          label: '组织部'
        }, {
          value: 3,
          label: '宣传部'
        }
      ],
      people: [
        {
          value: 1,
          label: 'admin'
        },
        {
          value: 2,
          label: 'sasha'
        }, {
          value: 3,
          label: 'aliss'
        }
      ],
      person: [
        {
          value: 1,
          label: '管理员'
        },
        {
          value: 2,
          label: '超级管理员'
        }, {
          value: 3,
          label: '普通用户'
        }
      ],
      temp: { // 添加、修改时绑定的表单数据
        id: undefined,
        pid: '',
        mid: '',
        politicaloutlook: '',
        post: '',
        talktype: '',
        talktime: new Date(),
        talkplace: '',
        createId: '',
        talktitle: '',
        talkcontent: '',
        createName: '',
        createTime: new Date(),
        staus: ''
      },
      title: '添加', // 对话框显示的提示 根据dialogStatus create
      dialogFormVisible: false, // 是否显示对话框
      dialogStatus: '' // 表示表单是添加还是修改的
      // rules: {
      //   // 校验规则
      //   username: [{ required: true, message: '用户名必填', trigger: 'blur' }]
      // }
    }
  },
  // 创建实例时的钩子函数
  created() {
    this.getList()
    // 在创建时初始化获得用户信息
    // this.getStaff()
  },
  methods: {
    // 获得分好组的部门信息
    // getStaff() {
    //   groupStaff().then((response) => {
    //     this.stafflist = response.data.list
    //     console.log("出来吧",response)
    //   })
    // },
    // 去后台取数据的
    getList() {
      // 开始转圈圈
      this.listLoading = true
      // debugger // 调试
      list(this.listQuery).then(response => {
        this.list = response.data.items
        this.total = response.data.total
        // 转圈圈结束
        this.listLoading = false
      })
    },
    // 按标题查询
    onSerch() {
      if (this.listQuery.search === '') {
        this.getList()
        return
      }

      queryBytitle(this.listQuery).then((response) => {
        this.list = response.data.items
        this.total = response.data.total
        this.listLoading = false
      })
      this.listQuery.search = ''
    },
    // 重置表单数据
    resetTemp() {
      this.temp = {
        id: undefined,
        pid: '',
        mid: '',
        politicaloutlook: '',
        post: '',
        talktype: '',
        talktime: new Date(),
        talkplace: '',
        createId: '',
        talktitle: '',
        talkcontent: '',
        createName: '',
        createTime: new Date(),
        staus: ''
      }
    },
    // 显示添加的对话框
    handleCreate() {
      // 重置表单数据
      this.resetTemp()
      // 点击确定时，是执行添加操作
      this.dialogStatus = 'create'
      this.title = '添加用户'
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
          add(this.temp).then((response) => {
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
      this.title = '修改用户'
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
          update(tempData).then((response) => {
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
    changeFun(val) {
      this.checkBoxData = val
    },
    handleDelete(row) {
      var ids = this.checkBoxData.map(item => { return { id: item.id } })
      var ids1 = ''
      for (var i = 0; i < ids.length; i++) {
        ids1 += ids[i].id + ','
      }
      if (ids1 == '') {
        this.$message({
          type: 'warning',
          message: '请选择要删除的数据'
        })
      } else {
        // 先弹确认取消框
        this.$confirm('确认删除这个标题以及内容的信息吗?', '提示', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'warning'
        }).then(() => {
          // 调用ajax去后台删除
          deleteUser(ids1).then((response) => {
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
}
</script>

