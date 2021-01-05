<template>
  <div>
  </div>
</template>

<script>
import {mapState} from 'vuex'

export default {
  name: "Home",
  components: {
  },
  mounted() {
    console.log('id : ' + this.id)
  },
  computed: {
    ...mapState(["id"])
  }
};
</script>
