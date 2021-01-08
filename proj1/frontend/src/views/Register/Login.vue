<template>
    <login-page @login="login"/>
</template>

<script>
import LoginPage from '@/components/Register/LoginPage.vue'
import {mapActions} from 'vuex'

export default {
  name: "Login",
  components: {
    LoginPage
  },
  methods: {
    ...mapActions(['getId']),
    ...mapActions(['gologin']),
    login(payload) {
        this.gologin(payload)
    }
  }
};
</script>