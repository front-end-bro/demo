<template>
  <div>
<!--    :age="17" 加了冒号后 里面的数据视为js表达式 -->
    <Student name="Jamin" sex="男" :age="17"></Student>
  </div>
</template>

<script>
import Student from "./components/Student";
export default {
  name: "App",
  components:{
    Student
  },

}
</script>

<style scoped>

</style>