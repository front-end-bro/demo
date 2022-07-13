// 引入Vue
import Vue from "vue";
// 引入App组件 是所有组件的父组件
import App  from './App'
// 关闭Vue的生产提示
Vue.config.productionTip=false;

import store from './store'

// 创建Vue实例对象
new Vue({
    // 将App组件放入容器中
    render:h=>h(App),
    beforeCreate() {
        Vue.prototype.$bus=this
    },
    store
}).$mount("#app")