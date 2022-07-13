<template>
  <div>
    <h2>当前求和为:{{ $store.state.sum }}</h2>
    <select v-model.number="n">
      <option value="1">1</option>
      <option value="2">2</option>
      <option value="3">3</option>
    </select>
    <button @click="increment">+</button>
    <button @click="decrement">-</button>
    <button @click="incrementOdd">当前求和为奇数再加</button>
    <button @click="incrementWait">等一等再加</button>
  </div>
</template>

<script>
export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "Count",
  data() {
    return {
      n: 1,//用户选择的数字
    }
  },
  methods: {
    increment() {
      this.$store.commit('JIA',this.n)//调用commit方法执行mutations对象里的JIA方法
    },
    decrement() {
      this.$store.commit('JIAN',this.n)
    },


    incrementOdd(){
      this.$store.dispatch("jiaOdd",this.n)//调用dispatch方法使用actions对象里的方法jiaOdd函数
    },
    incrementWait(){
        this.$store.dispatch("jiaWait",this.n)
    }

  }

}

</script>

<style scoped>

button {
  margin: 5px;
}
</style>