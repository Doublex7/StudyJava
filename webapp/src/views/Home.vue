<template>
  <div class="page">
    <h2>Home Page</h2>
    <el-button type="primary" @click="testAxios()">测试Axios调用</el-button>
    <el-button type="primary" @click="getUser()">获取用户信息</el-button>
  </div>
</template>

<script>
export default {
  name: 'Home',
  methods: {
    testAxios () {
      let url = 'server/user/list';
      this.$http({
        url: url
      }).then((res) => {
        alert(res.data[0].id);
      }).catch((err) => {
        console.log(err);
      });
    },
    getUser () {
      let url = 'http://localhost:8080/user';
      this.$http({
        url: url
      }).then((res) => {
        alert(JSON.stringify(res));
      }).catch((err) => {
        console.log(err);
      });
    }
  }
};
</script>

<style scoped>

</style>
