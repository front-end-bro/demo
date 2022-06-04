import Vue from 'vue'

import app from "@/App";


Vue.config.productionTip=false;

// 引入插件
import plugins from "./plugins";
// 使用插件
Vue.use(plugins)

new Vue({
    render:h=>h(app)
}).$mount("#app")