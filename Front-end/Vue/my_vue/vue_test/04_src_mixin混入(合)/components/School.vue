<template>
  <div>
    <h2 @click="showName">学校名称：{{name}}</h2>
    <h2>学校地址：{{address}}</h2>
  </div>
</template>

<script>
// 引入混合
import {mixinShowname} from "../mixin";

export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "School",
  data(){
    return{
      name:'SSTI',
      address:'Shenzhen'
    }
  },
  // 局部使用混合
  mixins:[mixinShowname]
}
</script>

<style scoped>

</style>