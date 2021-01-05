<template>
    <login-page @login="login"/>
</template>

<script>
import LoginPage from '@/components/Register/LoginPage.vue'
import axios from 'axios'
import router from '@/router'
import {mapActions} from 'vuex'

export default {
  name: "Login",
  components: {
    LoginPage
  },
  methods: {
    ...mapActions(['getId']),
    login(payload) {
        axios.post('http://localhost:1234/register/login', payload)
        .then(res => {
            console.log("res : " + res.status)
            if(res.status == 200) {
                console.log(res.data)
                this.getId(res.data)
                router.push('/')
            } else {
                alert(this.id)
            }
        })
        .catch(err => {
            alert("에러 : " + err)
        })
    }
  }
};
</script>