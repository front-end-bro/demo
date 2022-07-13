<template>
  <div class="col-xs-offset-2 col-xs-8">
    <div class="page-header">
      <h2>Vue Router Demo</h2>
      <button @click="forward">前进</button>
      <button @click="back">后退</button>
      <button @click="go">go测试</button>
    </div>
  </div>
</template>

<script>
export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "Banner",
  methods:{
    forward(){
      this.$router.forward()
    },
    back(){
      this.$router.back()
    },
    go(){
      this.$router.go(3)//前进3步
    }
  }
}
</script>

<style scoped>

</style>