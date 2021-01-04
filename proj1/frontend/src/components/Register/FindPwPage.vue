<template>
  <div id="findfl">
    <h1>비밀번호 찾기</h1>
    <br/><br/>
    <v-row>
        <v-text-field placeholder="이름"/>
    </v-row>
    <v-row>
        <v-text-field placeholder="id"/>
    </v-row>
    <v-radio-group v-model="col">
        <v-row>
            <v-col><v-radio label="KT" value="kt"/></v-col>
            <v-col><v-radio label="SKT" value="skt"/></v-col>
            <v-col><v-radio label="LGU+" value="lg"/></v-col>
        </v-row>
    </v-radio-group>
    <v-row>
        <v-text-field placeholder="전화번호"/>
    </v-row>
    <v-row>
        <v-col><v-btn v-on:click="Fpw()">비밀번호 찾기</v-btn></v-col>
        <v-col><v-btn @click="$router.push('/login')">취소</v-btn></v-col>
    </v-row>
  </div>
</template>

<script>
export default {
  name: "FindPwPage",
  methods: {
    Fpw() {
        this.$emit('findpw',{})
    }
  },
  data () {
    return {
        col: ""
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
