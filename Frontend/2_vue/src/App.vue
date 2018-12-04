<template>
  <div id="app">
    <h2>
    <img alt="Vue logo" src="./assets/logo.png" height="20">
      Vue.js
    </h2>
    <HelloWorld msg="Welcome to Your Vue.js App"/>
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'

export default {
  name: 'app',
  components: {
    HelloWorld
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
    border: solid black;
    border-radius: 25px;
    padding: 20px;
    display: inline-block;
}
</style>
