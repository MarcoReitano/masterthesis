<template>
  <div class="concert-list">
  <h1 class="list-title">Concert-List</h1>
  <list-item v-for="concert of concerts" v-bind:key="concert.date" v-bind:concert="concert"></list-item>
  </div>
</template>

<script>
  import ListItem from "./ListItem";
  import axios from "axios";

  export default {
    name: "List",
    components: {ListItem},
    data: function(){
      return{
        resultData: '',
        concerts: ''
      }
    },
    mounted() {
      axios({ method: "GET", "url": "http://mitneve.io/concerts"}).then(result => {
        this.concerts = result.data._embedded.concerts;
      }, error => {
        console.error(error)
      });
    }
  }
</script>

<style scoped>
  .list-title{
    color: black;
  }
  .concert-list{
    display: block;
    color: white;
    font-family: Arial, Helvetica, sans-serif;
  }
</style>
