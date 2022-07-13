<template>
  <div class="Student">
    <h1>学生姓名：{{ name }}</h1>
    <h1>学生年龄：{{ age }}</h1>
    <button @click="sendStudentName">获取学生名称</button>
    <button @click="unbind">解绑jamin事件</button>
    <button @click="clearVc">销毁vc组件</button>

  </div>
</template>

<script>
export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "student",
  data() {
    return {
      name: 'Jamin',
      age: 18
    }
  },
  methods: {
    sendStudentName() {
      //触发Student组件实例上的jamin事件
      this.$emit('jamin',this.name,111,23313)
      // this.$emit('demo')
    },
    unbind(){
      this.$off('jamin')//解绑一个自定义事件
      // this.$off(['jamin','demo'])//解绑两个自定义事件
      // this.$off()//解绑所有自定义事件
    },
    clearVc(){
      this.$destroy()//当vc组件被销毁后，student实例的自定义事件全都不奏效
    }


  }
}
</script>

<style scoped>
.Student {
  background-color: #6dffcc;
  margin: 10px;

}
</style>