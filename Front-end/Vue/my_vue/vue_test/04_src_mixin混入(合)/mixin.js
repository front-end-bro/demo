
// 分别暴露
export const mixinShowname={
    methods:{
        showName() {
            alert(this.name)
        }
    }
}

/*
mixin(混入)
    功能：把多个组件共用的配置提取成一个混合对象
        如果vm数据和混合同时修改同一属性值 则以vm中的数据为主
        生命周期钩子函数除外*/
