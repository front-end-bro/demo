<template>
  <div>
    <button @click="isShow =!isShow">显示/隐藏</button>
    <transition-group
        name="animate__animated animate__bounce"
        appear
        enter-active-class="animate__animated animate__bounce"
        leave-active-class="animate__backOutDown"
    >
      <!--transition-group 组过渡-->
      <!--appear 初始渲染-->
      <h1 v-show="isShow" key="1">Hello!</h1>
      <h1 v-show="!isShow" key="2">Jamin</h1>
    </transition-group>
  </div>
</template>

<script>
import 'animate.css'

export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "Test",
  data() {
    return {
      isShow: true
    }
  }
}
</script>

<style scoped>
h1 {
  background-color: orange;
}


</style>