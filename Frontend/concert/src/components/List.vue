<template>
  <div>
  Concert-List works!
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

</style>
