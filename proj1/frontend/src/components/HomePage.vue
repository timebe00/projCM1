<template>
  <div>
    <v-btn v-if="id!=''" v-on:click="$router.push('/write')" id="wrbtn">글쓰기</v-btn>
    <v-data-table
        :headers="headers"
        :items="list"
        :items-per-page="15"
        class="elevation-1"
      >
      <template v-slot:item.title="{ item }">
        <div @click="cllist(item.boardNo)">{{ item.title }}</div>
      </template>
      </v-data-table>
  </div>
</template>

<script>
import {mapState} from 'vuex'
import axios from 'axios'
import router from '@/router'

export default {
  name: "HomePage",
  components: {
  },
  async mounted() {
    await axios.post('http://localhost:1234/board/show')
        .then(res => {
            this.list = res.data
        })
        .catch(err => {
            alert("에러 : " + err)
        })
  },
  computed: {
    ...mapState(["id"]),
    headers () {
        return [
          {
            text: 'No',
            sortable: false,
            width: '5%',
            value: 'boardNo'
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
  },
  data() {
      return {
        list: []
      }
  },
  methods: {
    cllist(boardNo) {
        console.log("boardNo : " + boardNo)
        router.push({ name: 'Show', params: { boardNo: boardNo} })
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