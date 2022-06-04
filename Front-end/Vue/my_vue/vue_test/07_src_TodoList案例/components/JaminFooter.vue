<template>
  <div class="todo-footer" v-show="total">
    <label>
      <input type="checkbox" :checked="isAll" @change="checkAll"/>
    </label>
    <span>
          <span>已完成{{ doneTotal }}</span> / 全部{{ total }}
        </span>
    <button class="btn btn-danger" @click="clearAll">清除已完成任务</button>
  </div>
</template>

<script>
export default {
  name: "JaminFooter",
  props: ['todos','checkAllTodo','clearAllTodo'],
  computed: {
    total() {
      return this.todos.length;
    },
    /*创建一个统计done个数的函数
    doneTotal(){
      return this.todos.reduce((pre,current)=>{//pre 第一次传入的数，current 上一次的返回值
       return  pre + (current.done ?  1 : 0)
       // current.done ?  1 : 0 判断是否选中 选中则返回1
      },0/!*从零开始*!/)
    }*/
    doneTotal() {
      return this.todos.reduce((pre, todo) => pre + (todo.done ? 1 : 0), 0)
    },
    isAll() {
      return this.doneTotal === this.total && this.total > 0
    }

  },
  methods:{
    checkAll(e){
      this.checkAllTodo(e.target.checked)
    },
    clearAll(){
      if (confirm('确定删除吗')){
        this.clearAllTodo()

      }
    }
  }
}
</script>

<style scoped>
/*footer*/
.todo-footer {
  height: 40px;
  line-height: 40px;
  padding-left: 6px;
  margin-top: 5px;
}

.todo-footer label {
  display: inline-block;
  margin-right: 20px;
  cursor: pointer;
}

.todo-footer label input {
  position: relative;
  top: -1px;
  vertical-align: middle;
  margin-right: 5px;
}

.todo-footer button {
  float: right;
  margin-top: 5px;
}
</style>