//引入Vue核心库
import Vue from "vue";
//引入Vuex
import Vuex from 'vuex'
//应用Vuex插件
Vue.use(Vuex)

//准备actions对象——响应组件中用户的动作 有逻辑的写在actions里
const actions={
    jiaOdd(context,value) {//context小的store：上下文对象 便于取store里面的数据
        if (context.state.sum % 2) {
            context.commit('JIA',value)//调用commit方法执行mutations对象的JIA函数
        }
    },
    jiaWait(context,value) {

        setTimeout(()=>{
                context.commit('JIA',value)
            }
            ,1000)
    },
}
//准备mutations对象——修改state中的对象 不需要逻辑性的代码
const mutations={
    JIA(state,value){
        state.sum+=value
    },
    JIAN(state,value){
        state.sum-=value
    },
}
//准备state对象——保存具体的数据
const state={
    sum: 0,//初始化的值
}

//创建并暴露store
export default new Vuex.Store({
    actions,
    mutations,
    state

})