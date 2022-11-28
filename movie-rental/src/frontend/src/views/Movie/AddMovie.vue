<template>
  <div class ="container">
    <div class="row">
      <div class="col-12 text-center">
        <h3 calss="pt-3">Add Movie</h3>
      </div>
    </div>
    <div class = "row">
      <div class="col-3"></div>
      <div class="col-6">
        <form>
          <div class="form-group">
            <label for="title">Title</label>
            <input type="text" class="form-control" v-model="title">
          </div>
          <div class="form-group">
            <label for="categoryName">Description</label>
            <textarea type="text" class="form-control" v-model="description"/>
          </div>
          <div class="form-group">
            <label for="categoryName">Image Url</label>
            <input type="text" class="form-control" v-model="imageUrl">
          </div>
          <div class="form-group">
            <label for="categoryName">Year</label>
            <input type="text" class="form-control" v-model="year">
          </div>
          <div class="form-group">
            <label for="categoryName">Genre</label>
            <input type="text" class="form-control" v-model="genre">
          </div>
          <div class="form-group">
            <label for="categoryName">Leading Actor</label>
            <input type="text" class="form-control" v-model="leadingActor">
          </div>
          <div class="form-group">
            <label for="categoryName">Studio</label>
            <input type="text" class="form-control" v-model="studio">
          </div>
          <div class="form-group">
            <label for="categoryName">Director</label>
            <input type="text" class="form-control" v-model="director">
          </div>
          <div class="form-group">
            <label for="categoryName">Length</label>
            <input type="text" class="form-control" v-model="length">
          </div>
          <div class="form-group">
            <label for="categoryName">Rental Price</label>
            <input type="text" class="form-control" v-model="rentalPrice">
          </div>
          <div class="form-group">
            <label for="categoryName">Cost Production</label>
            <input type="text" class="form-control" v-model="costProduction">
          </div>
          <div class="form-group">
            <label for="categoryName">Estimated Box-Office Revenue</label>
            <input type="text" class="form-control" v-model="revenue">
          </div>
          <button type="button" class="btn btn-primary" @click="addMovie">Submit</button>
        </form>
      </div>
      <div class="col-3"></div>
    </div>
  </div>
</template>
<script>
import axios from 'axios';
const sweetalert = require('sweetalert');
export default {
  name: "AddMovie",
  data() {
    return{
      title: "",
      description: "",
      imageUrl: "",
      year: "",
      genre: "",
      leadingActor: "",
      studio: "",
      director: "",
      length: "",
      rentalPrice: "",
      costProduction: "",
      revenue: "",
    };
  },
  methods:{
    addMovie(){
      console.log(this.title, this.description);
      const newMovie = {
        title: this.title,
        description: this.description,
        imageUrl: this.imageUrl,
        year: this.year,
        genre: this.genre,
        leadingActor: this.leadingActor,
        studio: this.studio,
        director: this.director,
        length: this.length,
        rentalPrice: this.rentalPrice,
        costProduction: this.costProduction,
        revenue: this.revenue,
      };
      const baseUrl = "http://localhost:8080";
      axios.post(`${baseUrl}/movie/create`, newMovie)
          .then(() => {
            this.$router.push({name: "Movie"});
            sweetalert({
              text: 'Movie added successfully',
              icon: 'success',
            });
          }).catch((error) => {
        console.log(error);
      });
    }
  }
}

</script>
<style scoped>

</style>