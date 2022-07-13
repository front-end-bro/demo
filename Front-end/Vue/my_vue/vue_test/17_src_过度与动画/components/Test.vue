<template>
  <div>
    <button @click="isShow =!isShow">显示/隐藏</button>
    <transition name="Jamin" appear>
      <!--transition过渡-->
      <!--appear 初始渲染-->
      <h1 v-show="isShow">你好啊！</h1>

    </transition>
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

.Jamin-enter-active {
  animation: Jamin 0.5s linear;
  /*animation 属性用来指定一组或多组动画，每组之间用逗号相隔*/
  /*linear 匀速*/
}

.Jamin-leave-active {
  animation: Jamin 0.5s linear reverse;
  /*animation 属性用来指定一组或多组动画，每组之间用逗号相隔*/
  /*reverse反向播放*/
}

@keyframes Jamin {
  /*@keyframes创建动画*/
  from {
    transform: translateX(-100%);
    /*Transform 属性应用于元素的2D或3D转换*/
    /*translateX 定义转换，只是用 X 轴的值*/
  }
  to {
    transform: translateX(0);
    /*translateX 定义转换，只是用 X 轴的值*/
  }
}
</style>