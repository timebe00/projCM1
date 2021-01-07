<template>
  <div class="mainbs">
    <show-page v-bind:boardNo="boardNo"/>
  </div>
</template>

<script>
import ShowPage from '@/components/QNA/ShowPage.vue'

export default {
  name: "Show",
  components: {
    ShowPage
  },
  mounted() {
    console.log("boardNo Show : " + this.boardNo)
  },
  props: {
      boardNo: Number
  },
};
</script>
