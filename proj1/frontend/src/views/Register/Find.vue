<template>
    <div>
        <find-id-page @findid="findid"/>
        <find-pw-page @findpw="findpw"/>
    </div>
</template>

<script>
import FindIdPage from '@/components/Register/FindIdPage.vue'
import FindPwPage from '@/components/Register/FindPwPage.vue'
import {mapActions} from 'vuex'

export default {
  name: "Find",
  components: {
    FindIdPage,
    FindPwPage
  },
  methods: {
    ...mapActions(['regfindid']),
    ...mapActions(['regfindpw']),
    findid(payload) {
        this.regfindid(payload)
    },
    findpw(payload) {
        this.regfindpw(payload)
    }

  }
};
</script>
