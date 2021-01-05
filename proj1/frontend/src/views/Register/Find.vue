<template>
    <div>
        <find-id-page @findid="findid"/>
        <find-pw-page @findpw="findpw"/>
    </div>
</template>

<script>
import FindIdPage from '@/components/Register/FindIdPage.vue'
import FindPwPage from '@/components/Register/FindPwPage.vue'
import axios from 'axios'
import router from '@/router'

export default {
  name: "Find",
  components: {
    FindIdPage,
    FindPwPage
  },
  methods: {
    findid(payload) {
        axios.post('http://localhost:1234/register/findid', payload)
            .then(res => {
                console.log("res : " + res.status)
                if(res.status == 200) {
                    alert(res.data)
                } else {
                    alert("다시 입력해 주세요.")
                }
            })
            .catch(err => {
                alert("에러 : " + err)
            })
    },
    findpw(payload) {
        axios.post('http://localhost:1234/register/findpw', payload)
            .then(res => {
                console.log("res : " + res.status)
                if(res.status == 200) {
                    console.log(payload.id)
                    router.push({ name: 'Reset', params: { id: payload.id} })
                } else {
                    alert("다시 입력해 주세요.")
                }
            })
            .catch(err => {
                alert("에러 : " + err)
            })
    }

  }
};
</script>
