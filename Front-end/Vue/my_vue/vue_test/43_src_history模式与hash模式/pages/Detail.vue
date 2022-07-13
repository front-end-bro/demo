<template>
<ul>
  <li>消息编号：{{id}}</li>
  <li>消息标题：{{title}}</li>
</ul>
</template>

<script>
export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "Detail",
  props:['id','title'],//接收props
  mounted() {
    console.log(this.$route)
  }
}
</script>

<style scoped>

</style>