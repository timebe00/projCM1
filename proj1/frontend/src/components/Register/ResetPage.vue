<template>
  <div id="repw">
    <v-text-field placeholder="비밀번호 입력" v-model="pw1" type="password"/>
    <v-text-field placeholder="비밀번호 재입력" v-model="pw" type="password"/>
    <v-btn v-on:click="setup(pw1, pw)">확인</v-btn>
  </div>
</template>

<script>
export default {
  name: "ResetPage",
  data() {
    return {
        pw1: "",
        pw: ""
    }
  },
  methods: {
    setup(pw1, pw) {
        if(pw1===pw) {
            console.log("id : " + id)
            const {pw, id} = this
            this.$emit('repw',{pw, id})
        } else {
            alert("입력이 다릅니다. 다시 입력해 주세요")
        }
    }
  },
  props: {
    id: String
  }
};
</script>

<style>
#repw {
    width : 300px;
    margin-top : 20%;
    margin-left : 45%;
}
</style>