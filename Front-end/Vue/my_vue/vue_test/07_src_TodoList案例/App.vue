<template>
  <div id="root">
    <div class="todo-container">
      <div class="todo-wrap">
        <JaminHeader :addTodo="addTodo"></JaminHeader>
        <JaminList :todos="todos" :checkTodo="checkTodo" :deleteTodo="deleteTodo"></JaminList>
        <JaminFooter :todos="todos" :checkAllTodo="checkAllTodo" :clearAllTodo="clearAllTodo"></JaminFooter>
      </div>
    </div>
  </div>
</template>

<script>
import JaminHeader from "./components/JaminHeader";
import JaminList from "./components/JaminList";
import JaminFooter from "./components/JaminFooter";

export default {
  name: "App",
  components: {JaminHeader, JaminList, JaminFooter},
  data() {
    return {
      todos: [
        {id: '001', title: '健身', done: true},
        {id: '002', title: '吃', done: false},
        {id: '003', title: '洗澡', done: true},
      ]
    }
  },
  methods: {
    // 添加一个todo事件
    addTodo(todoObj) {
      this.todos.unshift(todoObj)
    },
    // 勾选或者取消勾选一个todo事件
    checkTodo(id) {
      this.todos.forEach((todo) => {
        if (todo.id === id) todo.done = !todo.done
      })
    },
    // 删除一个todo事件
    deleteTodo(id) {
      this.todos = this.todos.filter((todo) => {
        return todo.id !== id
      })
    },
    // 全选或者取消全选
    checkAllTodo(done) {
      this.todos.forEach((todo) => {
        todo.done = done
      })
    },
    clearAllTodo(){
      this.todos =this.todos.filter((todo)=>{
        return !todo.done
      })
    }
  }
}
</script>

<style>
/*base*/
body {
  background: #fff;
}

.btn {
  display: inline-block;
  padding: 4px 12px;
  margin-bottom: 0;
  font-size: 14px;
  line-height: 20px;
  text-align: center;
  vertical-align: middle;
  cursor: pointer;
  box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.2), 0 1px 2px rgba(0, 0, 0, 0.05);
  border-radius: 4px;
}

.btn-danger {
  color: #fff;
  background-color: #da4f49;
  border: 1px solid #bd362f;
}

.btn-danger:hover {
  color: #fff;
  background-color: #bd362f;
}

.btn:focus {
  outline: none;
}

.todo-container {
  width: 600px;
  margin: 0 auto;
}

.todo-container .todo-wrap {
  padding: 10px;
  border: 1px solid #ddd;
  border-radius: 5px;
}

</style>