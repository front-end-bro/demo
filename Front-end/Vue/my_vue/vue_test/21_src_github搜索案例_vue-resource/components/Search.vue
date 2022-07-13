<template>
  <section class="jumbotron">
    <h3 class="jumbotron-heading">Search Github Users</h3>
    <div>
      <input type="text" placeholder="enter the name you search" v-model="keyword"/>&nbsp;
      <button @click="searchUsers">Search</button>
    </div>
  </section>
</template>

<script>
import axios from 'axios'

export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "Search",
  data() {
    return {
      keyword: ''
    }
  },
  methods: {

    searchUsers() {
      //请求前更新List的数据
      this.$bus.$emit('updateListData', {isLoading: true, errMsg: '', users: [], isFirst: false})
      axios.get(`https://api.github.com/search/users?q=${this.keyWord}`)//${this.keyWord} ES6 模板字符串
          .then(
              response => {
                console.log('请求成功了')
                this.$bus.$emit('updateListData', {isLoading: false, errMsg: '', users: response.data.items})
              },
              error => {
                console.log('请求失败了', {isLoading: false, errMsg: error.message, users: []})
              }
          )
    }
  }
}
</script>

<style scoped>

</style>