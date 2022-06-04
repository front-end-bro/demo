<template>
  <div>
    <h2>学生姓名:{{ name }}</h2>
    <h2>学生性别:{{ sex }}</h2>
    <h2>学生年龄:{{ myAge + 1 }}</h2>
    <button @click="updateAge">点击age加一</button>
  </div>
</template>

<script>
export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: 'Student',
  data(){
    return{
      myAge:this.age
    }
  },
  methods: {
    updateAge(){
      this.myAge++;
    }
  },
  props:['name','sex','age'], //简单声明接收

  // 接收的同时对数据进行类型限制
  /*props:{
    name:String,
    age:Number,
    sex:String
  },*/

  // 接收的同时对数据 进行类型限制+默认值的指定+必要性的限制
  /*props: {
    name: {
      // name的类型必须是字符串
      type: String,
      // name是必要的
      required: true
    },
    age: {
      // name的类型必须是数值
      type: Number,
      // age的默认数值是99
      default: 99
    },
    sex: {
      // sex的类型是字符串
      type: String,
      // sex是必要的
      required: true
    }
  }*/


}
</script>

<style scoped>

</style>