import Vue from 'vue';
import Router from 'vue-router';
import HelloWorld from '@/views/HelloWorld';
import Test from '@/views/Test';
import Login from '@/views/Login';
import NotFound from '@/views/404';
import Home from '@/views/Home';

Vue.use(Router);

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path: '/test',
      name: 'Test',
      component: Test
    },
    {
      path: '/login',
      name: 'Login',
      component: Login
    },
    {
      path: '/404',
      name: 'NotFound',
      component: NotFound
    },
    {
      path: '/home',
      name: 'Home',
      component: Home
    }
  ]
});
