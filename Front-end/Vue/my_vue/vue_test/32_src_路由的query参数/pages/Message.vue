<template>
  <div>
    <ul>
      <li v-for="m in messageList" :key="m.id">
        <!-- 跳转路由并携带query参数，to的字符串写法 -->
        <!--        <router-link :to="`/home/message/detail?id=${m.id}&title=${m.title}`">{{m.title}}</router-link>&nbsp;&nbsp;-->

        <!-- 跳转路由并携带query参数，to的对象写法 -->
        <router-link :to="{
          path:'/home/message/detail',
          query:{
            id:m.id,
            title:m.title
          }

        }">
          {{ m.title }}
        </router-link>
        &nbsp;&nbsp;
      </li>

    </ul>
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "Message",
  data() {
    return {
      messageList: [
        {id: '001', title: 'message001'},
        {id: '002', title: 'message002'},
        {id: '003', title: 'message003'},
      ]
    }


  }
}
</script>

<style scoped>

</style>