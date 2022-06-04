<template>
  <div>
    <h2>学校名称:{{ name }}</h2>
    <h2>学校地址:{{ address }}</h2>
  </div>
</template>

<script>
export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name:'School',
  data() {
    return {
      name: 'SSTI',
      address: 'ShenZhen'
    }
  }
}
</script>

<style scoped>

</style>