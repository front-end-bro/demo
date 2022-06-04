<template>
  <div>
    <h2>学生姓名：{{name}}</h2>
    <h2>学生年龄：{{age}}</h2>
    <input type="text" v-fbind:value="name">
  </div>
</template>

<script>
export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "Student",
  data(){
    return{
      name:'Jamin',
      age:17
    }
  }
}
</script>

<style scoped>

</style>