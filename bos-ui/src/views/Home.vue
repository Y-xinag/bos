<template>
  <div>
    <h1>Home</h1>
    <el-button type="primary" @click="testAxios">测试</el-button>
  </div>
</template>

<script>
  import axios from 'axios'
  import mock from '../mock/mock'
  export default {
    name: 'Home',
    methods: {
      testAxios () {
        axios.get('http://localhost:8080/user').then(function (res) {
          alert(JSON.stringify(res.data))
        }).catch(function (res) {
          alert(res)
        })
      }
    }
  }
</script>

<style scoped>

</style>
