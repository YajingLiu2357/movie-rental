<template>
<div class = "container">
  <div class ="row">
    <div class="col-12 text-center">
      <h4>Add New Movie</h4>
    </div>
  </div>
  <div class="row">
    <div class="col-3"></div>
    <div class="col-6">
      <form>
        <div class="form-group">
          <label>Category</label>
          <select class="form-control" v-model="categoryId" required>
            <option v-for="category in categories" :key="category.id" :value="category.id">{{category.categoryName}}</option>
          </select>
        </div>
        <div class="form-group">
          <label>Name</label>
          <input type="text" v-model="name" class="form-control">
        </div>
        <div class="form-group">
          <label>Description</label>
          <input type="text" v-model="description" class="form-control">
        </div>
        <div class="form-group">
          <label>Image Url</label>
          <input type="text" v-model="imageURL" class="form-control">
        </div>
        <div class="form-group">
          <label>Price</label>
          <input type="number" v-model="price" class="form-control">
        </div>
        <button type="submit" class="btn btn-primary" @click="addProduct">Add Movie</button>
      </form>
    </div>
    <div class="col-3"></div>
  </div>
</div>
</template>

<script>
import axios from 'axios';
//import swal from 'sweetalert';
import sweetalert from "sweetalert";
export default {
  name: "AddProduct",
  props: ["baseURL", "categories"],
  data (){
    return {
      id: null,
      categoryId: null,
      name: null,
      description: null,
      imageURL: null,
      price: null,
    }
  },
  methods: {
    addProduct(){
      const newProduct = {
        categoryId: this.categoryId,
        name: this.name,
        description: this.description,
        imageURL: this.imageURL,
        price: this.price,
      };
      axios.post(this.baseURL+"product/add", newProduct)
          .then(() =>{
            this.$router.push({name: 'Product'});
            sweetalert({
              text: "Product Added",
              icon: "success",
            })
          }).catch((err) =>{
            console.log("err", err);
      })
    }
  }
}
</script>

<style scoped>

</style>