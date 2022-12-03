<template>
  <div class="container">
    <div class="row">
      <div class="col-12 text-center">
        <h2 class="pt-3" id="start-shopping"> Search Results</h2>
      </div>
    </div>
    <div class="row">
      <div v-for="result in searchResult" :key="result.id" class="col-md-6 col-xl-4 col-12 pt-3 justify-content-around d-flex">
        <MovieBox :movie="result"/>
      </div>
    </div>

  </div>
</template>

<script>
import MovieBox from "../components/MovieBox";
export default {
  name: "Search",
  props: ["movies"],
  components: {MovieBox},
  data(){
    return {
      searchValue: "",
      searchResult: []
    }
  },
  mounted () {
    this.searchValue = this.$route.params.searchValue;
    this.searchResult = this.movies.filter(movie => movie.title.toLowerCase().includes(this.searchValue.toLowerCase()));
  },
}
</script>

<style scoped>

</style>