<template>
  <Navbar />

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
      movies: null

    }
  },
  methods: {
    async fetchData(){
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
