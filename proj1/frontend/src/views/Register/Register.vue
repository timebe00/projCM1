<template>
  <register-page @idsame="findid" @reg="reg"/>
</template>

<script>
import RegisterPage from '@/components/Register/RegisterPage.vue'
import {mapActions} from 'vuex'

export default {
  name: "Register",
  components: {
    RegisterPage
  },
  methods: {
    ...mapActions(['overlap']),
    ...mapActions(['inputreg']),
    findid(payload) {
         console.log(payload)
        this.overlap(payload)
    },
    reg(payload) {
        this.inputreg(payload)
    }
  }
};
</script>