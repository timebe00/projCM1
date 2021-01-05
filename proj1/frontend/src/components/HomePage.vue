<template>
  <div>
    <v-btn v-if="id!=''">글쓰기</v-btn>
    <v-data-table
        :headers="headers"
        :items="desserts"
        :items-per-page="5"
        class="elevation-1"
      ></v-data-table>
  </div>
</template>

<script>
import {mapState} from 'vuex'

export default {
  name: "HomePage",
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
