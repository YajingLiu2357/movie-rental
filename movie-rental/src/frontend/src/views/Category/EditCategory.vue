<template>
<div class="container">
  <div class="row">
    <div class="col-12 text-center">
      <h4 class="pt-3">Edit Category</h4>
    </div>
  </div>
  <div class="row">
    <div class="col-3"></div>
    <div class="col-6">
      <form v-if="category">
        <div class="form-group">
          <label>Category Name</label>
          <input type="text" v-model="category.categoryName" class="form-control" required>
        </div>
        <div class="form-group">
          <label>Description</label>
          <input type="text" v-model="category.description" class="form-control" required>
        </div>
        <div class="form-group">
          <label>Image URL</label>
          <input type="text" v-model="category.imageUrl" class="form-control" required>
        </div>
        <button type="submit" class="btn btn-primary" @click="editCategory">Edit Category</button>
      </form>
    </div>
    <div class="col-3"></div>
  </div>
</div>
</template>

<script>
import axios from 'axios';
import swal from 'sweetalert';
export default {
  name: "EditCategory",
  data(){
    return {
      category: null,
      id: null
    }
  },
  props: ["baseURL", "categories"],
  method:{
    async editCategory(){
      delete this.category["products"]
      console.log('category', this.category)
      await axios.post(`${this.baseURL}/category/update/${this.id}`, this.category)
          .then(() => {
            this.$emit("fetchData");
            this.$router.push({name: "Category"});
            swal({
              text: "category has been updated successfully",
              icon: "success",
            })
          }).catch(err => console.log('err', err));
    }
  },
  mounted() {
    this.id = this.$route.params.id;
    this.category = this.categories.find(category => category.id == this.id);
  }
}
</script>

<style scoped>

</style>