import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue'
/*import AddCategory from '../views/Category/AddCategory.vue'
import Category from '../views/Category/Category.vue'*/
import Admin from '../views/Admin';
/*import Product from "../views/Product/Product";
import AddProduct from "../views/Product/AddProduct";
import EditCategory from "../views/Category/EditCategory";
import EditProduct from "../views/Product/EditProduct";
import ShowDetails from "../views/Product/ShowDetails";
import ListProducts from "../views/Category/ListProducts";*/
import Signup from "../views/Signup";
import Signin from "../views/Signin";
import AddMovie from "@/views/Movie/AddMovie";
import Movie from "@/views/Movie/Movie";
import EditMovie from "@/views/Movie/EditMovie";
import MovieDetail from "@/views/Movie/MovieDetail";

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  /*{
    path: '/category/show/:id',
    name: 'ListProducts',
    component: ListProducts
  },
  {
    path: '/admin/category/add',
    name: 'AddCategory',
    component: AddCategory
  },
  {
    path: '/admin/category',
    name: 'Category',
    component: Category
  },
  {
    path: '/admin/category/:id',
    name: 'EditCategory',
    component: EditCategory
  },*/
  {
    path: '/admin',
    name: 'Admin',
    component: Admin
  },
  /*{
    path: '/admin/product',
    name: 'Product',
    component: Product
  },
  {
    path: '/admin/product/new',
    name: 'AddProduct',
    component: AddProduct
  },
  {
    path: '/admin/product/edit/:id',
    name: 'EditProduct',
    component: EditProduct
  },*/
  /*{
    path: '/product/show/:id',
    name: 'ShowDetails',
    component: ShowDetails
  },*/
  {
    path: '/signup',
    name: 'Signup',
    component: Signup
  },
  {
    path: '/signin',
    name: 'Signin',
    component: Signin
  },
  {
    path: '/admin/movie/add',
    name: 'AddMovie',
    component: AddMovie
  },
  {
    path: '/admin/movie',
    name: 'Movie',
    component: Movie
  },
  {
    path: '/admin/movie/:id',
    name: 'EditMovie',
    component: EditMovie
  },
  {
    path: '/movie/show/:id',
    name: 'MovieDetail',
    component: MovieDetail
  },
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
