<template>
  <h2>我是About的内容</h2>
</template>

<script>
export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "About",

  //进入守卫：通过路由规则，进入该组件时被调用
  beforeRouteEnter(to,from,next){
    console.log('About--beforeRouteEnter',to,from)

    if (to.meta.isAuth){//判断是否需要鉴权
      if (localStorage.getItem('aaa')==='123'){
        next()
      }else {
        alert('账号或密码有误，请重试')
      }
    }else {
      next()
    }
  },

  //离开守卫：通过路由规则，离开该组件时被调用
  beforeRouteLeave(to,from,next){
    console.log('About--beforeRouteLeave',to,from)
    next()
  }
}
</script>

