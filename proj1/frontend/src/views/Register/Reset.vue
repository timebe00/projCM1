<template>
  <div>
    <reset-page v-bind:id="id" @repw="setup"/>
  </div>
</template>

<script>
import ResetPage from '@/components/Register/ResetPage.vue'
import axios from 'axios'
import router from '@/router'

export default {
  name: "Reset",
  components: {
    ResetPage
  },
  methods: {
  setup(payload) {
      console.log(payload)
      axios.post('http://localhost:1234/register/reset', payload)
        .then(res => {
          console.log("res : " + res.status)
          if(res.status == 200) {
              alert("로그인 해 주세요")
              router.push("/login")
          } else {
              alert("오류")
          }
        })
        .catch(err => {
          alert("에러 : " + err)
        })
    }
  },
  props: {
      id: String
  }
};
</script>
