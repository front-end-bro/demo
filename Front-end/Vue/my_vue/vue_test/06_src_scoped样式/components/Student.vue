<template>
  <div>
    <h2>学生姓名：{{name}}</h2>
    <h2 class="test">学生年龄：{{age}}</h2>
  </div>
</template>

<script>
export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "Student",
  data(){
    return {
      name:'Jamin',
      age:18
    }
  }
}
</script>

<!--scoped样式-->
<!--作用：让样式在局部生效，防止冲突-->
<style scoped>

</style>
<style lang="less" scoped>
    .test{
      background-color: aquamarine;
      .font{
        font-size: larger;
      }
    }
</style>