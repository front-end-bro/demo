<template>
  <div class="Student">
    <h1>学生姓名：{{ name }}</h1>
    <h1>学生年龄：{{ age }}</h1>
    <button @click="sendStudentName">点击传输学生姓名</button>

  </div>
</template>

<script>
import pubsub from 'pubsub-js'//引入pubsub消息订阅与发布
export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "student",
  data() {
    return {
      name: 'Jamin',
      age: 18
    }
  },
  methods:{
    sendStudentName() {
      // this.$bus.$emit('hello',this.name)
      //在全局事件总线上绑定hello事件 且传输现组件的学生姓名
      pubsub.publish('hello',666)//提供数据
    }
  },
}
</script>

<style scoped>
.Student {
  background-color: #6dffcc;
  margin: 10px;

}
</style>