<template>
  <ul class="todo-main">
    <JaminItem
        v-for="todoObj in todos" :key="todoObj.id"
        :todo="todoObj"
    ></JaminItem>
  </ul>
</template>

<script>
import JaminItem from "./JaminItem";

export default {
  name: "JaminList",
  components: {JaminItem},
  props:['todos',]


}
</script>

<style scoped>
/*main*/
.todo-main {
  margin-left: 0px;
  border: 1px solid #ddd;
  border-radius: 2px;
  padding: 0px;
}

.todo-empty {
  height: 40px;
  line-height: 40px;
  border: 1px solid #ddd;
  border-radius: 2px;
  padding-left: 5px;
  margin-top: 10px;
}

</style>