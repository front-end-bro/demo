<template>
  <li>
    <label>
      <input type="checkbox" :checked="todo.done" @change="handleCheck(todo.id)"/>
      <span v-show="!todo.isEdit">{{ todo.title }}</span>
      <input
          type="text"
          v-show="todo.isEdit"
          :value="todo.title"
          @blur="handleBlur(todo,$event)"
          ref="inputTitle"
      >
    </label>
    <button class="btn btn-danger" @click="handleDelete(todo.id)">删除</button>
    <button v-if="!todo.isEdit"  class="btn btn-edit" @click="handleEdit(todo)">编辑</button>
  </li>
</template>

<script>
import pubsub from 'pubsub-js'//引入pubsub消息订阅与发布
export default {
  name: "JaminItem",
// 声明接受todo对象
  props: ['todo'],
  methods: {
    handleCheck(id) {
      // 通知App组件将对应的todo对象的done值取反
      // this.checkTodo(id)
      this.$bus.$emit('checkTodo', id)

    },
    handleDelete(id) {
      if (confirm("确定删除吗？")) {
        // this.deleteTodo(id)
        // this.$bus.$emit('deleteTodo',id)
        pubsub.publish('deleteTodo', id)//提供数据
      }
    },
    handleEdit(todo) {
      if (Object.prototype.hasOwnProperty.call(todo, 'isEdit')) {//判断对象中是否含有isEdit值
        todo.isEdit = true
      } else {
        this.$set(todo, 'isEdit', true)//为文本框添加双向绑定 且为选中状态
      }
      this.$nextTick(function (){//先让语句执行一轮 再执行语句块中的语句
        this.$refs.inputTitle.focus()
      })
    },
    handleBlur(todo, e) {//为文本绑定一个文本框失去焦点的函数@Blur
      todo.isEdit = false
      if(!e.target.value.trim()) return alert('输入不能为空！')
      this.$bus.$emit('updateTodo', todo.id, e.target.value)//提供修改数据
    }
  }
}
</script>

<style scoped>
/*item*/
li {
  list-style: none;
  height: 36px;
  line-height: 36px;
  padding: 0 5px;
  border-bottom: 1px solid #ddd;
}

li label {
  float: left;
  cursor: pointer;
}

li label li input {
  vertical-align: middle;
  margin-right: 6px;
  position: relative;
  top: -1px;
}

li button {
  float: right;
  display: none;
  margin-top: 3px;
}

li:before {
  content: initial;
}

li:last-child {
  border-bottom: none;
}

li:hover {
  background-color: #ddd;
}

li:hover button {
  display: block !important;
}
</style>