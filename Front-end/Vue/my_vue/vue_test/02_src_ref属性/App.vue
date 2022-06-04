<template>
  <div>
    <h1 v-text="msg" ref="title"></h1>
    <button @click="showDOM" ref="btn">点我输出所有DOM元素</button>
    <school ref="sch"></school>
  </div>
</template>

<script>
import School from "./components/School";
export default {
  name: "App",
  components:{
    School
  },
  data(){
    return{
      msg:'猪B牛小馁'
    }
  },
  methods:{
    showDOM(){
      console.log(this.$refs.title)// 真实DOM元素
      console.log(this.$refs.btn)// 真实DOM元素
      console.log(this.$refs.sch)// School组件的实例对象
    }
  }

}
</script>

<style scoped>

</style>