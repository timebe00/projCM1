<template>
  <div class="write">
    <v-text-field placeholder="제목" v-model="title"/>
    <v-textarea
      outlined
      no-resize
      id="wrtxt"
      v-model="txt"
    ></v-textarea>
    <v-col>
        <v-btn id="okbtn" v-on:click="savetxt()">확인</v-btn>
        <v-btn id="cnbtn" v-on:click="$router.push('/')">취소</v-btn>
    </v-col>
  </div>
</template>

<script>
import {mapState} from 'vuex'

export default {
  name: "WritePage",
  methods: {
    ...mapState(['id']),
    savetxt() {
        const {id, title, txt} = this
        this.$emit('save',{title, txt, id})
    }
  },
  data() {
    return {
        write: "",
        txt: ""
    }
  }
};
</script>

<style>
.write {
    margin-left: 25%;
    margin-right: 25%;
    margin-top: 150px;
}
#wrtxt {
    height:500px;
}
#okbtn {
    margin-left: 35%;
}
#cnbtn {
    margin-left: 100px;
}
</style>