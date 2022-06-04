export default {
    install(Vue){
        // 字符过滤器
        Vue.filter('mySlice',function (value){
            return value.slice(0,4)
        })

        // 定义全局指定
        // 自定义指令
        Vue.directive('fbind', {
            // 指令与元素成功绑定时
            bind(element, binding) {
                element.value = binding.value;
            },
            // 指令所在元素被插入页面时
            // eslint-disable-next-line no-unused-vars
            inserted(element, binding) {

                element.focus()//设施焦点元素
            },
            // 指令所在的模板被重新解析
            update(element, binding) {
                element.value = binding.value
                element.focus()//设施焦点元素
            }});
    }
}