<template>
  <div class ="container">
    <div class="row">
      <div class="col-12 text-center">
        <h3 calss="pt-3">Our Movies</h3>
        <router-link :to="{name : 'AddMovie'}">
          <button class="btn">Add Movie</button>
        </router-link>
      </div>
    </div>
    <div class = "row">
      <div v-for="movie of movies" :key="movie.id" class="col-xl-4 col-md-6 col-12 pt-3 d-flex">
        <MovieBox :movie="movie"> </MovieBox>
      </div>
    </div>
  </div>
</template>
<script>
import MovieBox from "../../components/MovieBox";
export default {
  name: 'Movie',
  props: ["movies"],
  components: {
    MovieBox,
  },
  data() {
    return{
      baseUrl : "http://localhost:8080/",
    };
  },
  methods:{
  },
  mounted(){
  },
}

</script>
<style scoped>

</style>