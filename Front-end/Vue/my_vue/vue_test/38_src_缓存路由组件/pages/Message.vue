<template>
  <div>
    <ul>
      <li v-for="m in messageList" :key="m.id">
        <!-- 跳转路由并携带params参数，to的字符串写法 -->
        <!--<router-link :to="`/home/message/detail/${m.id}/${m.title}`">{{m.title}}</router-link>&nbsp;&nbsp;-->

        <!-- 跳转路由并携带query参数，to的对象写法 -->
        <router-link :to="{
                  //路由携带params参数时，若使用to的对象写法，则不能使用path配置项，必须使用name配置
                  name:'xiangqing',//简化路由的跳转
                  query:{
                    id:m.id,
                    title:m.title
                  }
                }">
          {{ m.title }}
        </router-link>
        &nbsp;&nbsp;
        <button @click="pushShow(m)">push查看</button>
        <button @click="replace(m)">replace查看</button>
      </li>
    </ul>
    <hr>

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
  },
  methods:{
    pushShow(m){//push是追加历史记录
      this.$router.push({
        name:'xiangqing',//简化路由的跳转
        query:{
          id:m.id,
          title:m.title
        }})
    },
    replace(m){//replace是替换当前记录
      this.$router.replace({
        name:'xiangqing',//简化路由的跳转
        query:{
          id:m.id,
          title:m.title
        }})
    }
  }
}
</script>

<style scoped>

</style>