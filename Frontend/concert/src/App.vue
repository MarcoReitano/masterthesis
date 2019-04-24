<template>
  <div id="app">
    <img alt="Vue logo" src="./assets/logo.png">
    <list-item></list-item>
  </div>
</template>

<script>
import ListItem from "./components/ListItem";

export default {
  name: 'app',
  components: {
    ListItem
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
