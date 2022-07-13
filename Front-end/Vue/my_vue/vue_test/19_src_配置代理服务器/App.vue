<template>
  <div>
    <button @click="getStudents">点我获取学生信息</button>
    <button @click="getCars">点我获取汽车信息</button>
  </div>
</template>

<script>
import axios from 'axios'//引入axios
export default {
  name: "App",
  methods: {
    getStudents() {
      axios
          .get('http://localhost:8888/students')//URL地址
          .then(
              response => {//成功时回调函数
                console.log('请求成功了', response.data)
              },
              error => {//报错的回调
                console.log('请求失败了', error.message)
              }
          )
    },
    getCars() {
      axios
          .get('http://localhost:8888/cars')//URL地址
          .then(
              response => {//成功时回调函数
                console.log('请求成功了', response.data)
              },
              error => {//报错的回调
                console.log('请求失败了', error.message)
              })
    }
  }
}
</script>

<style scoped>

</style>