import Vue from 'vue'
import app from './App'

Vue.config.productionTip=false;

new Vue({
    render:h=>h(app),
    beforeCreate() {
        Vue.prototype.$bus=this
    }
}).$mount("#app")