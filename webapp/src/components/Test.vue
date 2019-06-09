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
    }
  },
  methods: {
    login: function () {
      console.log(this.username)
      console.log(this.password)
    }
  }
}
</script>

<style scoped>
  .login-box {
    margin: 0 auto
  }
  .username-label {
    width: 300px;
  }
  .password-label {
    width: 300px
  }
</style>
