<template>
  <div class="App">
    <h1>{{ msg }},学生姓名是：{{ studentName }}</h1>
    <!--通过父组件给子组件传递函数类型的props实现：子给父传递数据-->
    <School :getSchoolName="getSchoolName"></School>

    <!--通过父组件给子组件绑定一个自定义事件实现：子给父传递数据(第一种写法 v-on或者@)-->
    <!--    <Student v-on:jamin="getStudentName" @demo="m1"></Student>-->

    <!--通过父组件给子组件绑定一个自定义事件实现：子给父传递数据(第二种写法 ref)-->
    <Student ref="student" @click.native="show"></Student>
    <!--.native修饰符 组件绑定到原生DOM事件-->

  </div>
</template>

<script>
import School from "./components/School";
import Student from "./components/Student";

export default {
  name: "App",
  data() {
    return {
      msg: 'Hello',
      studentName: ''
    }
  },
  components: {
    School, Student
  },
  methods: {
    getSchoolName(name) {
      console.log('学校名称是' + name)
    },
    getStudentName(name, ...params) {
      console.log('学生名字是' + name, params)
      this.studentName = name
    },
    // m1(){
    //   console.log('demo被触发了')
    // },
    show() {
      alert('123')
    }
  },
  mounted() {
    this.$refs.student.$on('jamin', this.getStudentName)//绑定一次性事件
    // this.$refs.student.$once('jamin',this.getStudentName)//绑定一次性事件(一次性）
  }

}
</script>

<style scoped>
.App {
  background-color: #fa8dff;
  padding: 5px;
}

h1 {
  text-align: center;
}
</style>