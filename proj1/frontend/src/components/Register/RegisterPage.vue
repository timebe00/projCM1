<template>
  <div id="registerpage">
    <h1>회원가입</h1>
    <br/><br/>
    <v-row>
        <v-text-field placeholder="이름" v-model="name"/>
    </v-row>
    <v-row>
        <v-col>
            <v-text-field placeholder="id" v-model="id"/>
        </v-col>
        <v-col>
            <v-btn v-on:click="bolsame()">중복확인</v-btn>
        </v-col>
    </v-row>
    <v-row>
        <v-text-field placeholder="특수기호(@#^&만 가능) 2개 이상 사용" v-model="pw" type="password"/>
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
        <v-col><v-btn v-on:click="OKreg">확인</v-btn></v-col>
        <v-col>
        </v-col>
        <v-col><v-btn @click="$router.push('/login')">취소</v-btn></v-col>
    </v-row>
  </div>
</template>

<script>
export default {
  name: "RegisterPage",
  data() {
    return {
        name: "",
        id: "",
        pw: "",
        pho: "",
        pn: ""
    }
  },
  methods: {
      bolsame () {
         const id = this.id
         this.$emit('idsame',{id})
      },
      OKreg () {
        const {name, id, pw, pho, pn} = this
        this.$emit('reg', {name, id, pw, pho, pn})
      }
    },
};
</script>
<style>
#registerpage {
    width : 300px;
    margin-top : 13%;
    margin-left : 40%;
}
</style>