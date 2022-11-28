<template>
  <div class="container">
    <div class="row pt-5">
      <div class="col-md-1"></div>
      <div class="col-md-4 col-12">
        <img :src="movie.imageUrl" class="img-fluid">
      </div>
      <div class="col-md-6 col-12 pt-3 pt-md-0 text-left">
        <h4>{{movie.title}}</h4>
        <h6 class="category font-italic">Genre: {{movie.genre}}</h6>
        <h6 class="font-weight-bold">${{movie.rentalPrice}}</h6>
        <h6 class="font-weight-bold">Year: {{movie.year}}</h6>
        <h6>Leading Actor: {{movie.leadingActor}}</h6>
        <h6>Studio: {{movie.studio}}</h6>
        <h6>Director: {{movie.director}}</h6>
        <h6>Length: {{movie.length}}min</h6>
        <h6>Cost Production: ${{movie.costProduction}}</h6>
        <h6>Estimated Box-Office Revenue: ${{movie.revenue}}</h6>
        <p>
          {{movie.description}}
        </p>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "MovieDetail",
  data(){
    return {
      movie: {},
    }
  },
  props: ["baseURL", "movies"],
  mounted(){
    this.id = this.$route.params.id;
    this.movie = this.movies.find(movie => movie.id == this.id);
  }
}
</script>

<style scoped>
.category{
  font-weight: 400;
}
</style>