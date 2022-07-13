// 该文件专门用于创建整个应用的路由器
import VueRouter from "vue-router";

//引入组件
import About from "@/pages/About";
import Home from "@/pages/Home";
import Message from "@/pages/Message";
import News from "@/pages/News";
import Detail from "@/pages/Detail";

//创建并暴露一个路由器
const router = new VueRouter({
    routes: [
        {
            name: 'gaunyu',
            path: '/about',
            component: About,
            meta: {title: '关于'}
        },
        {
            name: 'zhuye',
            path: '/home',
            component: Home,
            meta: {title: '主页'},
            children: [
                {
                    name: 'xinwen',
                    path: 'news',//子路由无须添加 /
                    component: News,
                    meta: {isAuth: true, title: '新闻'},
                    beforeEnter(to,from,next){
                        console.log('独享路由守卫',to,from)
                        //判断是否需要鉴权
                        if (to.meta.isAuth) {
                            if (localStorage.getItem("aaa") === '123') {
                                next()
                            } else {
                                alert('名称或密码不对 请重试')
                            }

                        } else {
                            next()
                        }
                    }
                },
                {
                    name: 'xiaoxi',
                    path: 'message',
                    component: Message,
                    meta: {isAuth: true, title: '消息'},
                    children: [
                        {
                            name: 'xiangqing',
                            // path: 'Detail/:id/:title',//使用占位符声明接收params参数
                            path: 'detail',
                            meta: {title: '详情'},
                            component: Detail,
                            //props的第一种写法，值为对象
                            // 该对象中的所有key-value都会以props的形式传给Detail组件。
                            // props:{a:src,b:'hello'}

                            //props的第二种写法，值为布尔值
                            //若布尔值为真，就会把该路由组件收到的所有params参数
                            //以props的形式传给Detail组件。
                            // props:true

                            //props的第三种写法，值为函数 //既可以接受query 也可以接受params
                            props($route) {
                                return {
                                    id: $route.query.id,
                                    title: $route.query.title
                                }
                            }
                        }
                    ]
                }
            ]
        },
    ]
})


//全局前置路由守卫————初始化的时候被调用、每次路由切换之前被调用
/*router.beforeEach((to, from, next) => {

    //判断是否需要鉴权
    if (to.meta.isAuth) {
        if (localStorage.getItem("aaa") === '123') {
            next()
        } else {
            alert('名称或密码不对 请重试')
        }

    } else {
        next()
    }
    console.log('前置路由守卫', to, from)

})*/

//全局后置路由守卫————初始化的时候被调用、每次路由切换之后被调用
router.afterEach((to, from) => {
    document.title = to.meta.title || 'Jamin'
    console.log('后置路由守卫', to, from)
})

export default router
