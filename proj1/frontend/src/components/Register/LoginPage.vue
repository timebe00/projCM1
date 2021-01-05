<template>
    <div id="txtfd">
        <h1>로그인</h1>
        <br/><br/>
        <v-row>
            <v-text-field placeholder="id" v-model="id"/>
        </v-row>
        <v-row>
            <v-text-field placeholder="password" v-model="pw" type="password"/>
        </v-row>
        <v-row>
            <v-col><v-btn v-on:click="login()">로그인</v-btn></v-col>
            <v-col><v-btn @click="$router.push('/login/register')">회원가입</v-btn></v-col>
            <v-col><v-btn @click="$router.push('/login/find')">아이디/비밀번호 찾기</v-btn></v-col>
        </v-row>
    </div>
</template>

<script>
export default {
  name: "LoginPage",
  data() {
    return {
        id: "",
        pw: ""
    }
  },
  methods: {
    login () {
        const {id, pw} = this
        this.$emit('login',{id, pw})
    }
  }
};
</script>
<style>
#txtfd {
    width: 500px;
    margin-left:40%;
    margin-top:15%;
}
</style>