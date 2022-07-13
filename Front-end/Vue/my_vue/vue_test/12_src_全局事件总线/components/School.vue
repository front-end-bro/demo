<template>
  <div class="School">
    <h1>学校名称：{{ name }}</h1>
    <h1>学校地址：{{ address }}</h1>
  </div>
</template>

<script>
export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "School",
  data() {
    return {
      name: 'SSTI',
      address: 'Shenzhen'
    }
  },
  methods:{
  receive(data){
    console.log('接受全局事件总线数据：'+data)
  }

},
  mounted() {
      this.$bus.$on('hello',this.receive)//接收全局事件总线数据
  },
  beforeDestroy() {//在组件销毁前 解绑全局事件总线
    this.$bus.$off('hello')
  }

}
</script>

<style scoped>
.School {
  background-color: #78ecff;
  margin: 10px;
}
</style>