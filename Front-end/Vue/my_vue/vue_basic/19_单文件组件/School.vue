<template>
  <div>
    <h2>{{name}}</h2>
    <h2>{{address}}</h2>
    <button @click="showName">点击</button>
  </div>
</template>

<script>
//export default 默认暴露 方便引入组件
export default {
  name: "School",
  data(){
    return{
      name:'SSTI',
      address:'ShenZhen'
    }
  },
  methods:{
    showName(){
      alert(this.name)
    }
  }
}
</script>

<style scoped>

</style>