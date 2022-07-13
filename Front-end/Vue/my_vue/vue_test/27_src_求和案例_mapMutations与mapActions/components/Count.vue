<template>
  <div>
    <h2>当前求和为:{{ sum }}</h2>
    <!--组件中读取数据-->
    <h2>将前求和放大十倍:{{ bigSum }}</h2>
    <h2>在{{ school }},学{{ subject }}</h2>
    <select v-model.number="n">
      <option value="1">1</option>
      <option value="2">2</option>
      <option value="3">3</option>
    </select>
    <button @click="increment(n)">+</button>
    <button @click="decrement(n)">-</button>
    <button @click="incrementOdd(n)">当前求和为奇数再加</button>
    <button @click="incrementWait(n)">等一等再加</button>
  </div>
</template>

<script>
//引入函数
import {mapState, mapGetters,mapMutations,mapActions} from 'vuex';

export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "Count",
  data() {
    return {
      n: 1,//用户选择的数字
    }
  },

  computed: {
    //借助mapState生成计算属性，从state中读取数据。（对象写法）
    // ...mapState({sum:'sum', school: 'school', subject: 'subject'})

    //借助mapState生成计算属性，从state中读取数据。（数组写法）
    ...mapState(['sum', 'school', 'subject']),
    // ****************************************************************

    //借助mapGetters生成计算属性，从getters中读取数据。（对象写法）
    // ...mapGetters ...是ES6函数扩展运算符
    ...mapGetters({bigSum: 'bigSum'}),

    //借助mapGetters生成计算属性，从getters中读取数据。（数组写法）
    // ...mapGetters(['bigSum'])
  },
  methods: {
    /*increment() {
      this.$store.commit('JIA', this.n)//调用commit方法执行mutations对象里的JIA方法
    },
    decrement() {
      this.$store.commit('JIAN', this.n)
    }, */

    //借助mapMutations生成对应的方法，方法中会调用commit去联系mutations(对象写法)
    ...mapMutations({increment:'JIA',decrement:'JIAN'}),


   /* incrementOdd() {
      this.$store.dispatch("jiaOdd", this.n)//调用dispatch方法使用actions对象里的方法jiaOdd函数
    },
    incrementWait() {
      this.$store.dispatch("jiaWait", this.n)
    },*/

    //借助mapActions生成对应的方法，方法中会调用dispatch去联系actions(对象写法)
    ...mapActions({incrementOdd:'jiaOdd',incrementWait:'jiaWait'}),

  }

}

</script>

<style scoped>

button {
  margin: 5px;
}
</style>