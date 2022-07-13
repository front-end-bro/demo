// 引入 Vue
import Vue from "vue";
// 引入 App 组件 是所有组件的父组件
import App  from './App'

//完整引入
//引入ElementUI组件库
// import ElementUI from 'element-ui';

//引入ElementUI全部样式
// import 'element-ui/lib/theme-chalk/index.css';

//按需引入
import { Tabs, Carousel,TabPane,CarouselItem} from 'element-ui';

// 关闭 Vue 的生产提示
Vue.config.productionTip=false;

//全部应用ElementUI
// Vue.use(ElementUI)

//按需应用ElementUI
Vue.component('el-tabs',Tabs)
Vue.component('el-carousel',Carousel)
Vue.component('el-tab-pane',TabPane)
Vue.component('el-carousel-item',CarouselItem)

// 创建 Vue 实例对象
new Vue({
    // 将 App 组件放入容器中
    render:h=>h(App),
}).$mount("#app")