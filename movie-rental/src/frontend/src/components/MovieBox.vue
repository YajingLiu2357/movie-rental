<template>
  <div class="card w-100 h-100" style="margin-top: 10px">
    <div class="embed-responsive embed-responsive-16by9">
      <img class="card-img-top embed-responsive-item" :src="movie.imageUrl" alt="Card image cap"/>
    </div>
    <div class="card-body">
      <router-link :to="{name: 'MovieDetail', params: {id: movie.id}}">
        <h5 class="card-title">{{movie.title}}</h5>
      </router-link>
      <p class="card-text">{{ movie.description }}</p>
      <router-link :to="{name: 'EditMovie', params: {id: movie.id}}" v-show="$route.name == 'Movie'">
        <button class="btn btn-primary">Edit</button>
      </router-link>
    </div>
  </div>
</template>
<script>

export default {
  name: "MovieBox",
  props: ["movie"],
  methods:{

  }
}
</script>

<style scoped>
.card-img-top{
  object-fit: cover;
}
</style>
