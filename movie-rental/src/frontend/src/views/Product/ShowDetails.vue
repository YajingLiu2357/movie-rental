<template>
<div class="container">
  <div class="row pt-5">
    <div class="col-md-1">
      <div class="col-md-4 col-12">
        <img :src="product.imageURL" class="img-fluid">
      </div>
      <div class="col-md-6 col-12 pt-3 pt-md-0">
        <h4>{{product.name}}</h4>
        <h6 class="category font-italic">{{category.categoryName}}</h6>
        <h6 class="font-weight-bold">${{product.price}}</h6>
        <p>
          {{product.description}}
        </p>
      </div>

    </div>
  </div>
</div>
</template>

<script>
export default {
  name: "ShowDetails",
  data(){
    return {
      product: {},
      category:{},
    }
  },
  props: ["baseURL", "products", "categories"],
  mounted(){
    this.id = this.$route.params.id;
    this.product = this.products.find(product => product.id == this.id);
    this.category = this.categories.find(category => category.id == this.product.categoryId);
  }
}
</script>

<style scoped>
.category{
  font-weight: 400;
}
</style>