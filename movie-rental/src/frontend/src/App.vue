<template>
  <Navbar />
<!--  <router-view v-if="categories && products && movies" style="mini-height: 60vh"
      :baseURL = "baseURL"
      :categories="categories"
      :products="products"
      :movies="movies"
      @fetchData="fetchData"
  >
  </router-view>-->

  <router-view v-if="movies" style="mini-height: 60vh"
               :baseURL = "baseURL"
               :movies="movies"
               @fetchData="fetchData"
  >
  </router-view>
  <Footer/>
</template>

<script>
import Navbar from "./components/Navbar.vue";
import axios from "axios";
import Footer from "./components/Footer";
export default {
  components: {Navbar, Footer},
  data(){
    return {
      baseURL : "http://localhost:8080/",
      /*products: null,
      categories: null,*/
      movies: null

    }
  },
  methods: {
    async fetchData(){
      // api call to get all categories
     /* await axios.get(this.baseURL + "category/")
          .then(res => {
            this.categories = res.data;
          }).catch(err => console.log('err', err));

      // api call to get all products
      await axios.get(this.baseURL + "product/")
          .then(res => {
            this.products = res.data;
          }).catch(err => console.log('err', err));*/
      await axios.get(this.baseURL + "movie/")
          .then(res => {
            this.movies = res.data;
          }).catch(err => console.log('err', err));
    }
  },
  mounted(){
    this.fetchData();
  }
}
</script>
<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}
</style>
