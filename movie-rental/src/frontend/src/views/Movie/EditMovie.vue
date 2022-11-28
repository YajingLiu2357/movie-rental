<template>
  <div class="container">
    <div class="row">
      <div class="col-12 text-center">
        <h4 class="pt-3">Edit Movie</h4>
      </div>
    </div>
    <div class="row">
      <div class="col-3"></div>
      <div class="col-6">
        <form v-if="movie">
          <div class="form-group">
            <label for="title">Title</label>
            <input type="text" class="form-control" v-model="movie.title">
          </div>
          <div class="form-group">
            <label for="categoryName">Description</label>
            <textarea type="text" class="form-control" v-model="movie.description"/>
          </div>
          <div class="form-group">
            <label for="categoryName">Image</label>
            <input type="text" class="form-control" v-model="movie.imageUrl">
          </div>
          <div class="form-group">
            <label for="categoryName">Year</label>
            <input type="text" class="form-control" v-model="movie.year">
          </div>
          <div class="form-group">
            <label for="categoryName">Genre</label>
            <input type="text" class="form-control" v-model="movie.genre">
          </div>
          <div class="form-group">
            <label for="categoryName">Leading Actor</label>
            <input type="text" class="form-control" v-model="movie.leadingActor">
          </div>
          <div class="form-group">
            <label for="categoryName">Studio</label>
            <input type="text" class="form-control" v-model="movie.studio">
          </div>
          <div class="form-group">
            <label for="categoryName">Director</label>
            <input type="text" class="form-control" v-model="movie.director">
          </div>
          <div class="form-group">
            <label for="categoryName">Length</label>
            <input type="text" class="form-control" v-model="movie.length">
          </div>
          <div class="form-group">
            <label for="categoryName">Rental Price</label>
            <input type="text" class="form-control" v-model="movie.rentalPrice">
          </div>
          <div class="form-group">
            <label for="categoryName">Cost Production</label>
            <input type="text" class="form-control" v-model="movie.costProduction">
          </div>
          <div class="form-group">
            <label for="categoryName">Estimated Box-Office Revenue</label>
            <input type="text" class="form-control" v-model="movie.revenue">
          </div>
        </form>
        <button type="submit" class="btn btn-primary" v-on:click="editMovie">Edit Movie</button>
      </div>
      <div class="col-3"></div>
    </div>
  </div>
</template>

<script>
import axios from 'axios';
import sweetalert from 'sweetalert';
export default {
  name: "EditMovie",
  data(){
    return {
      movie: null,
      id: null
    }
  },
  props: ["baseURL", "movies"],
  methods:{
   async editMovie(){
      await axios.post(`${this.baseURL}movie/update/${this.id}`, this.movie)
          .then(() => {
            this.$emit("fetchData");
            this.$router.push({name: "MovieDetail", params: {id: this.id}});
            sweetalert({
              text: "Movie has been updated successfully",
              icon: "success",
            })
          }).catch(err => console.log('err', err));
    }
  },
  mounted() {
    this.id = this.$route.params.id;
    this.movie = this.movies.find(movie => movie.id == this.id);
  }
}
</script>

<style scoped>

</style>