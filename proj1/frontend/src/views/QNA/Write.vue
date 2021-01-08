<template>
  <div class="mainbs">
    <write-page @save="save"/>
  </div>
</template>

<script>
import WritePage from '@/components/QNA/WritePage.vue'
import {mapActions} from 'vuex'

export default {
  name: "Write",
  components: {
    WritePage
  },
  methods: {
    ...mapActions(['inputwt']),
    save(payload) {
        this.inputwt(payload)
    }
  }
};
</script>
