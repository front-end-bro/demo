// 引入 Vue
import Vue from "vue";
// 引入 App 组件 是所有组件的父组件
import App  from './App'
// 引入 VueRouter 组件
import VueRouter from "vue-router";
//引入路由器
import router from "@/router";
// 关闭 Vue 的生产提示
Vue.config.productionTip=false;
//使用 VueRouter 组件
Vue.use(VueRouter)

// 创建 Vue 实例对象
new Vue({
    // 将 App 组件放入容器中
    render:h=>h(App),
    router:router
}).$mount("#app")