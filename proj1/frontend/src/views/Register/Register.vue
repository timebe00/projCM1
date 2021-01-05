<template>
  <register-page @idsame="findid" @reg="reg"/>
</template>

<script>
import RegisterPage from '@/components/Register/RegisterPage.vue'
import axios from 'axios'
import router from '@/router'

export default {
  name: "Register",
  components: {
    RegisterPage
  },
  methods: {
    findid(payload) {
        axios.post('http://localhost:1234/register/sameid', payload)
            .then(res => {
                console.log("res : " + res.status)
                if(res.status == 200) {
                    alert("사용할 수 있는 아이디 입니다.")
                } else {
                    alert("사용할 수 없는 아이디 입니다.")
                }
            })
            .catch(err => {
                alert("에러 : " + err)
            })
    },
    reg(payload) {
        console.log(payload)
        axios.post('http://localhost:1234/register/register', payload)
            .then(res => {
                console.log("res : " + res.status)
                if(res.status == 200) {
                    alert("회원가입 성공")
                    router.push('/login')
                } else {
                    alert("회원가입 실패")
                }
            })
            .catch(err => {
                alert("에러 : " + err)
            })
    }
  }
};
</script>