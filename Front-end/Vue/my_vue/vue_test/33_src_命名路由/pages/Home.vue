<template>
  <div>
    <ul class="nav nav-tabs">
      <li>
        <router-link class="list-group-item" active-class="active" to="/home/News">News</router-link>
      </li>
      <li>
        <router-link class="list-group-item " active-class="active" to="/home/Message">Message</router-link>
      </li>
    </ul>
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "Home"
}
</script>

<style scoped>

</style>