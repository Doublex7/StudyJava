// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue';
import router from './router';
import Element from 'element-ui';
import App from './App';
import axios from 'axios';
import 'element-ui/lib/theme-chalk/index.css';
// eslint-disable-next-line no-unused-vars
import mock from './mock/mock.js';

Vue.prototype.$http = axios;
Vue.config.productionTip = false;

Vue.use(Element);

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
});
