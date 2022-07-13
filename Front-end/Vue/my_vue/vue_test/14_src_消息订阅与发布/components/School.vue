<template>
  <div class="School">
    <h1>学校名称：{{ name }}</h1>
    <h1>学校地址：{{ address }}</h1>
  </div>
</template>

<script>
import pubsub from 'pubsub-js'//引入pubsub消息订阅与发布
export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "School",
  data() {
    return {
      name: 'SSTI',
      address: 'Shenzhen'
    }
  },
  methods: {
    /*receive(data){
      console.log('接受全局事件总线数据：'+data)
    }*/
    demo(msgName,data) {//第一个参数是订阅消息名称，第二个参数是数据
      console.log('hello消息收到了',msgName,data,this)
    }
  },
  mounted() {
    // this.$bus.$on('hello',this.receive)//接收全局事件总线数据
    this.pid=pubsub.subscribe('hello',this.demo)//订阅消息
  },
  beforeDestroy() {//在组件销毁前 解绑全局事件总线
    // this.$bus.$off('hello')
    pubsub.unsubscribe(this.pid)//取消订阅
  }

}
</script>

<style scoped>
.School {
  background-color: #78ecff;
  margin: 10px;
}
</style>