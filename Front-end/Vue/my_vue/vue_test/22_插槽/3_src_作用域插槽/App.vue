<template>
  <div class="container">

    <Category title="游戏">
      <template scope="jamin">
        <ul>
          <li v-for="(g,index) in jamin.games" :key="index">{{ g }}</li>
        </ul>
      </template>

    </Category>

    <Category title="游戏">
      <template scope="{games}">
        <!--<template scope="{games}"> {games} ES6 解构赋值 -->
        <ol>
          <li v-for="(g,index) in games" :key="index">{{ g }}</li>
        </ol>
      </template>

    </Category>

    <Category title="游戏">
      <template slot-scope="{games}">
        <h4 v-for="(g,index) in games" :key="index">{{ g }}</h4>
      </template>

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

}
</script>

<style scoped>
.container {
  display: flex;
  justify-content: space-around; /*在弹性盒子对象的各项周围留有空白*/

}

h4 {
  text-align: center;
}
</style>