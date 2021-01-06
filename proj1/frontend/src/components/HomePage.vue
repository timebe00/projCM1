<template>
  <div>
    <v-btn v-if="id!=''" v-on:click="$router.push('/write')" id="wrbtn">글쓰기</v-btn>
    <v-data-table
        :headers="headers"
        :items="desserts"
        :items-per-page="15"
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
    ...mapState(["id"]),
    headers () {
        return [
          {
            text: 'No',
            sortable: false,
            width: '5%',
            value: 'boardno'
          },
          {
            text: '제목',
            sortable: false,
            width: '80%',
            value: 'title'
          },
          {
            text: '조회수',
            sortable: false,
            width: '5%',
            value: 'views'
          },
          {
            text: '등록자',
            sortable: false,
            width: '10%',
            value: 'id'
          }
        ]
      }
  }
};
</script>
<style>
#wrbtn {
    margin-top: 50px;
    margin-left: 90%
}
</style>