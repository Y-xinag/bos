<template>
  <el-form :model="loginForm" :rules="fieldRules" ref="loginForm" label-position="left" label-width="0px" class="demo-ruleForm login-container">
    <h3 class="title">系统登录</h3>
    <el-form-item prop="account">
      <el-input type="text" v-model="loginForm.name" auto-complete="off" placeholder="账号"></el-input>
    </el-form-item>
    <el-form-item prop="password">
      <el-input type="password" v-model="loginForm.wapp" auto-complete="off" placeholder="密码"></el-input>
    </el-form-item>
    <!-- <el-checkbox v-model="checked" checked class="remember">记住密码</el-checkbox> -->
    <el-form-item style="width:100%;">
      <el-button type="primary" style="width:48%;" @click.native.prevent="reset">重 置</el-button><el-button type="primary" style="width:48%;" @click.native.prevent="login" :loading="logining">登 录</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
  import Cookies from 'js-cookie'
  export default {
    name: 'Login',
    data() {
      return{
        logining: false,
        loginForm: {
          name: 'aaa',
          wapp: '123456'
        },
        fieldRules: {
          name: [
            { required: true, message: '请输入账号', trigger: 'blur'},
          ],
          wapp: [
            { required: true, message: '请输入账号', trigger: 'blur' },
          ]
        },
        checked: true
      };
    },
    methods: {
      login () {
        let userInfo = {name: this.loginForm.name,wapp: this.loginForm.wapp}
        console.debug(userInfo);
        alert(JSON.stringify(userInfo))
        this.$api.login(userInfo).then((res) => {
          console.debug(res);
          console.debug(res.token)
          Cookies.set('token', res.token)
          sessionStorage.setItem('user', res.loginUser)
          this.$router.push('/')
        }).catch(function (res) {
          alert(res)
        })
      },
      reset() {
        this.$refs.loginForm.resetFields();
      }
    }
  }
</script>

<style lang="scss" scoped>
  .login-container {
    -webkit-border-radius: 5px;
    border-radius: 5px;
    -moz-border-radius: 5px;
    background-clip: padding-box;
    margin: 100px auto;
    width: 350px;
    padding: 35px 35px 15px 35px;
    background: #fff;
    border: 1px solid #eaeaea;
    box-shadow: 0 0 25px #cac6c6;
  .title {
    margin: 0px auto 30px auto;
    text-align: center;
    color: #505458;
  }
  .remember {
    margin: 0px 0px 35px 0px;
  }
  }
</style>
