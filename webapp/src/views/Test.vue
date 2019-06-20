<template>
  <div class="login-box">
    <el-input class="username-label" v-model="username" placeholder="Please enter your username"></el-input>
    <el-input class="password-label" v-model="password" placeholder="Please enter your password" type="password"></el-input>
    <el-button @click="login">{{ loginButtonText }}</el-button>
    <el-button>{{ signUpButtonText }}</el-button>
  </div>
</template>

<script>
export default {
  name: 'Test',
  data () {
    return {
      username: '',
      password: '',
      loginButtonText: 'Sign in',
      signUpButtonText: 'Sign up'
    };
  },
  methods: {
    login: function () {
      if (this.username === '' || this.password === '') {
        this.$message.error('用户名和密码不能为空');
        return;
      }
      let url = 'server/user/login/' + this.username + '/' + this.password;
      this.$http({
        url: url,
        method: 'post',
        data: {
          username: this.username,
          password: this.password
        }
      }).then((res) => {
        let message;
        let type;
        switch (Number(res.data.code)) {
          case 1:
            message = '用户名不存在';
            type = 'warning';
            break;
          case 2:
            message = '密码错误';
            type = 'error';
            break;
          case 0:
            message = '登录成功';
            type = 'success';
            break;
          default:
            break;
        }
        this.$message({
          message: message,
          type: type
        });
      }).catch(err => {
        console.log(err);
      });
    }
  }
};
</script>

<style scoped>
  .login-box {
    margin: 0 auto;
  }
  .username-label {
    width: 300px;
  }
  .password-label {
    width: 300px;
  }
</style>
