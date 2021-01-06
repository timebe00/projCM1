<template>
  <div class="mainbs">
    <write-page @save="save"/>
  </div>
</template>

<script>
import WritePage from '@/components/QNA/WritePage.vue'
import axios from 'axios'
import router from '@/router'

export default {
  name: "Write",
  components: {
    WritePage
  },
  methods: {
    save(payload) {
        console.log("echo")
         axios.post('http://localhost:1234/board/save', payload)
             .then(res => {
                 console.log("res : " + res.status)
                 if(res.status == 200) {
                     router.push('/')
                 }
             })
             .catch(err => {
                 alert("에러 : " + err)
             })
    }
  }
};
</script>
