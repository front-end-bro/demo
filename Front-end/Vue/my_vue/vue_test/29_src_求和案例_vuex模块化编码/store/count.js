//求和相关的配置
export default {
    namespaced: true,//开启命名空间 使mapstate能读取到countOptions
    actions: {
        jiaOdd(context, value) {//context小的store：上下文对象 便于取store里面的数据
            if (context.state.sum % 2) {
                context.commit('JIA', value)//调用commit方法执行mutations对象的JIA函数
            }
        },
        jiaWait(context, value) {

            setTimeout(() => {
                    context.commit('JIA', value)
                }
                , 1000)
        },
    },
    mutations: {
        JIA(state, value) {
            state.sum += value
        },
        JIAN(state, value) {
            state.sum -= value
        },
    },
    state: {
        sum: 0,//初始化的值
        school: 'SIT',
        subject: '前端',
    },
    getters: {
        bigSum(state) {
            return state.sum * 10
        }
    },

}