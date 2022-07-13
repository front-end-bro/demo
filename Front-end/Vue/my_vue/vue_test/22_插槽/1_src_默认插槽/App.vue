<template>
  <div class="container">
    <Category title="美食" :listData="foods">
      <img src="https://s3.ax1x.com/2021/01/16/srJlq0.jpg" alt="">
    </Category>
    <Category title="游戏" >
      <ul>
        <li v-for="(g,index) in games" :key="index">{{g}}</li>
      </ul>
    </Category>
    <Category title="电影" :listData="films">
      <video controls src="http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4"></video>
    </Category>
  </div>
</template>

<script>
import Category from "@/components/Count";

export default {
  name: "App",
  components: {
    Category
  },
  data() {
    return {
      foods: ['a', 'b', 'c', 'd', 'e'],
      games: ['a2', 'b2', 'c2', 'd2', 'e2'],
      films: ['a3', 'b3', 'c3', 'd3', 'e3']
    }
  }
}
</script>

<style scoped>
.container {
  display: flex;
  justify-content: space-around; /*在弹性盒子对象的各项周围留有空白*/

}
</style>