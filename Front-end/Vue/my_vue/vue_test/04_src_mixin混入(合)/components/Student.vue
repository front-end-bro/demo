<template>
  <div>
    <h2 @click="showName">学生姓名：{{name}}</h2>
    <h2>学生年龄：{{age}}</h2>
  </div>
</template>

<script>
import {mixinShowname} from '../mixin'
export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "Student",
  data(){
    return{
      name:'Jamin',
      age:18
    }
  },
  mixins:[mixinShowname]
}
</script>

<style scoped>

</style>