<template>
  <div class="App">
    <h1>{{ msg }}</h1>
    <School></School>
    <Student></Student>

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
    }
  },
  components: {
    School, Student
  },
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