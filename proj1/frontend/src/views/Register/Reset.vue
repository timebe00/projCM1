<template>
  <div>
    <reset-page v-bind:id="id" @repw="setup"/>
  </div>
</template>

<script>
import ResetPage from '@/components/Register/ResetPage.vue'
import {mapActions} from 'vuex'

export default {
  name: "Reset",
  components: {
    ResetPage
  },
  methods: {
    ...mapActions(['resetpw']),
    setup(payload) {
      this.resetpw(payload)
    }
  },
  props: {
      id: String
  }
};
</script>
