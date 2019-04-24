<template>
  <div v-if="concert" class="concert-list-item">
    <div class="artist">{{concert.artist.alias}}</div>
    <div class="venue">{{concert.venue.name}}</div>
    <div class="date">{{concert.date}}</div>
    <div class="time">{{concert.begin}}</div>
  </div>
</template>

<script>
  export default {
    name: "ListItem",
    props: ['concert']
  }
</script>

<style scoped>
  .concert-list-item{
    position: relative;
    background: red;
    height: 100px;
    padding: 20px 20px 20px 200px;
  }
</style>
