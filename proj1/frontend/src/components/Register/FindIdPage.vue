<template>
  <div id="findfl">
    <h1>아이디 찾기</h1>
    <br/><br/>
    <v-row>
        <v-text-field placeholder="이름" v-model="name"/>
    </v-row>
    <v-radio-group v-model="pho">
        <v-row>
            <v-col><v-radio label="KT" value="kt"/></v-col>
            <v-col><v-radio label="SKT" value="skt"/></v-col>
            <v-col><v-radio label="LGU+" value="lg"/></v-col>
        </v-row>
    </v-radio-group>
    <v-row>
        <v-text-field placeholder="전화번호" v-model="pn"/>
    </v-row>
    <v-row>
        <v-col><v-btn v-on:click="findid()">아이디 찾기</v-btn></v-col>
        <v-col></v-col>
        <v-col><v-btn @click="$router.push('/login')">로그인</v-btn></v-col>
    </v-row>
  </div>
</template>

<script>
export default {
  name: "FindIdPage",
  data () {
    return {
        pho: "",
        name: "",
        pn: ""
    }
  },
  methods: {
    findid () {
      const {pho, name, pn} = this
      this.$emit('findid',{pho, name, pn})
    }
  }
};
</script>
<style>
#findfl {
    width : 300px;
    margin-top : 7%;
    margin-left : 40%;
}
</style>
