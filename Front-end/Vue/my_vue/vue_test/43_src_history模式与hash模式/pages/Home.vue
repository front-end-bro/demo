<template>
  <div>
    <h2>Home组件内容</h2>
    <div>
      <ul class="nav nav-tabs">
        <li>
          <router-link class="list-group-item" active-class="active" to="/home/news">News</router-link>
        </li>
        <li>
          <router-link class="list-group-item " active-class="active" to="/home/message">Message</router-link>
        </li>
      </ul>
    </div>
    <!-- 缓存多个路由组件 -->
    <!-- <keep-alive :include="['News','Message']"> -->
    <!-- keep-alive 让不展示的路由组件保持挂载，不被销毁 包含News组件-->
    <keep-alive include="News">
      <router-view></router-view>
    </keep-alive>

  </div>
</template>

<script>
export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "Home"
}
</script>

<style scoped>

</style>