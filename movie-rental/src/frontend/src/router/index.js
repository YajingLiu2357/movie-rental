import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue'
import Admin from '../views/Admin';
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
  {
    path: '/admin',
    name: 'Admin',
    component: Admin
  },
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
