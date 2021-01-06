import Vue from "vue";
import VueRouter from "vue-router";
import Home from "@/views/Home.vue";
import Login from "@/views/Register/Login.vue";
import Register from "@/views/Register/Register.vue";
import Find from "@/views/Register/Find.vue";
import Reset from "@/views/Register/Reset.vue";

import Show from "@/views/QNA/Show.vue";
import Write from "@/views/QNA/Write.vue";

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "Home",
    component: Home
  },
  {
    path: "/login",
    name: "Login",
    component: Login
  },
  {
    path: "/login/register",
    name: "Register",
    component: Register
  },
  {
    path: "/login/find",
    name: "Find",
    component: Find
  },
  {
    path: "/login/reset",
    name: "Reset",
    components: {
        default:Reset
    },
    props: {
        default: true
    }
  },
  {
    path: "/show",
    name: "Show",
    component: Show
  },
  {
    path: "/write",
    name: "Write",
    component: Write
  },
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes
});

export default router;
