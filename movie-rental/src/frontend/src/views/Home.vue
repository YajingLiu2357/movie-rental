<template>
  <div id="home">
    <div id="background-div" class="page-holder bg-cover">
      <div class="container py-5">
        <header class="text-left text-white py-5">
          <h3 class="mb-4 rounded" id="heading">
            <a href="#start-shopping" class="bg-white px-2 py-2 rounded">Start renting movies</a>
          </h3>
          <p class="lead mb-0 bg-dark p-1 rounded"> Demo Movie Rental Web Application</p>
        </header>
      </div>
      <hr/>
    </div>
    <div class="container">
      <div class="row">
        <div class="col-12 text-center">
          <h2 class="pt-3" id="start-shopping"> Top Movies</h2>
        </div>
      </div>
      <div class="row">
        <div v-for="index in this.movieSize" :key="index" class="col-md-6 col-xl-4 col-12 pt-3 justify-content-around d-flex">
          <MovieBox :movie="movies[index-1]"/>
        </div>
      </div>

    </div>
  </div>
</template>

<script>
import MovieBox from "../components/MovieBox";
export default {
  name: 'Home',
  components:{MovieBox} ,
  props: ["movies"],
  data(){
    return {
      movieSize: 0,
    }
  },
  mounted() {
    this.movieSize = Math.min(this.movies.length, 8);
  },
}
</script>
<style>
.page-holder{
  min-height: 100vh;
}
.bg-cover{
  background-size: cover !important;
}
#background-div{
  background: url("../assets/home.png")
}
#heading {
  font-weight: 400;
}
</style>
