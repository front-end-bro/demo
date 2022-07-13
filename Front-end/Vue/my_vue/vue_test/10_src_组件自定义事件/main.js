import Vue from "vue";
import app from "./App";

Vue.config.productionTip=false;

new Vue({
    render:h=>h(app)
}).$mount('#app')