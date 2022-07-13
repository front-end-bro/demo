<template>
  <div class="School">
    <h1>学校名称：{{ name }}</h1>
    <h1>学校地址：{{ address }}</h1>
    <button @click="sendSchoolName">获取学校名称</button>
  </div>
</template>

<script>
export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "School",
  props: ['getSchoolName',],
  data() {
    return {
      name: 'SSTI',
      address: 'Shenzhen'
    }
  },
  methods:{
    sendSchoolName(){
      this.getSchoolName(this.name)
    }
  }
}
</script>

<style scoped>
.School {
  background-color: #78ecff;
  margin: 10px;
}
</style>