const {defineConfig} = require('@vue/cli-service')
module.exports = defineConfig({
    transpileDependencies: true,
    lintOnSave: false,//关闭语法检查
    devServer: {
        port: 8888,//修改端口号
        // disableHostCheck:true

        /*// 19_src_配置代理服务器
        // 开启代理服务器 和要访问的服务器端口一致的端口 (第一种写法)
        // proxy:'http://localhost:5000'


        proxy:{
            '/jamin':{//'/jamin' 请求前缀
                target:'http://localhost:5000',//要访问的服务器
                pathRewrite:{'^/jamin':''},//路径重写
                // '^/jamin' 匹配所有以/jamin开头的路径 并换成空值
                ws:true,//用于支持websocket
                changeOrigin:true//用于控制请求头中的host值
            },
            '/jamin2':{
                target:'http://localhost:5001',
                pathRewrite:{'^/jamin2':''},
                ws:true,
                changeOrigin:true
            }
        }*/
    }

})
