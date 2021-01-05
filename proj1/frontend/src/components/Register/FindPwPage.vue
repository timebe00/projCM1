<template>
  <div id="findfl">
    <h1>비밀번호 찾기</h1>
    <br/><br/>
    <v-row>
        <v-text-field placeholder="이름" v-model="name"/>
    </v-row>
    <v-row>
        <v-text-field placeholder="id" v-model="id"/>
    </v-row>
    <v-radio-group v-model="pho">
        <v-row>
            <v-col><v-radio label="KT" value="kt" v-on:click="Mklog()"/></v-col>
            <v-col><v-radio label="SKT" value="skt" v-on:click="Mklog()"/></v-col>
            <v-col><v-radio label="LGU+" value="lg" v-on:click="Mklog()"/></v-col>
        </v-row>
    </v-radio-group>
    <v-row>
        <v-text-field placeholder="전화번호" v-model="ph"/>
    </v-row>
    <v-row>
        <v-col><v-btn v-on:click="Fpw(name, id, pho, ph)">비밀번호 찾기</v-btn></v-col>
        <v-col><v-btn @click="$router.push('/login')">로그인</v-btn></v-col>
    </v-row>
  </div>
</template>

<script>
export default {
  name: "FindPwPage",
  methods: {
    Fpw(name, id, pho, ph) {
        this.$emit('findpw',{name, id, pho, ph})
    },
    Mklog() {
        console.log(this.pwphn)
    }
  },
  data () {
    return {
        pho: "",
        name: "",
        ph: "",
        id: ""
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
