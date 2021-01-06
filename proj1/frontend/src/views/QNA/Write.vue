<template>
  <div class="mainbs" @save="save">
    <write-page/>
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
         axios.post('http://localhost:1234/board/save', payload)
             .then(res => {
                 console.log("res : " + res.status)
                 if(res.status == 200) {
                     console.log(res.data)
                     this.getId(res.data)
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
