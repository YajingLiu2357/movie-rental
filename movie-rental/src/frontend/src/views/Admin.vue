<template>
  <div class="container py-4">
    <router-link :to ="{name: 'Movie'}">
      <button class="btn btn-primary btn-lg"> Admin Movie</button>
    </router-link>
  </div>
</template>

<script>
export default {
  name: "Admin"
}
</script>

<style scoped>
.btn{
  margin-bottom: 20px;
}
</style>