<template>
  <div>
    <button @click="isShow =!isShow">显示/隐藏</button>
    <transition-group name="Jamin" appear>
      <!--transition-group 组过渡-->
      <!--appear 初始渲染-->
      <h1 v-show="isShow" key="1">Hello!</h1>
      <h1 v-show="!isShow" key="2">Jamin</h1>

    </transition-group>
  </div>
</template>

<script>
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
/*进入的起点、离开的终点*/
.Jamin-enter,.Jamin-leave-to{
  transform: translateX(-100%);
}

.Jamin-enter-active,.Jamin-leave-active{
  transition: 0.5s linear;
  /*linear 匀速*/
}

.Jamin-enter-to,.Jamin-leave{
  transform: translateX(0);
}

</style>