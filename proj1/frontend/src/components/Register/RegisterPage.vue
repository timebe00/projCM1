<template>
  <div id="registerpage">
    <h1>회원가입</h1>
    <br/><br/>
    <v-row>
        <v-text-field placeholder="이름"/>
    </v-row>
    <v-row>
        <v-col>
            <v-text-field placeholder="id"/>
        </v-col>
        <v-col>
            <v-btn>중복확인</v-btn>
        </v-col>
    </v-row>
    <v-row>
        <v-text-field placeholder="password"/>
    </v-row>
    <v-row>
        <v-col><v-radio label="KT" value="kt"/></v-col>
        <v-col><v-radio label="SKT" value="skt"/></v-col>
        <v-col><v-radio label="LGU+" value="lg"/></v-col>
    </v-row>
    <v-row>
        <v-text-field placeholder="전화번호"/>
    </v-row>
    <v-row>
        <v-col><v-btn>확인</v-btn></v-col>
        <v-col>
        </v-col>
        <v-col><v-btn @click="$router.push('/login')">취소</v-btn></v-col>
    </v-row>
  </div>
</template>

<script>
export default {
  name: "RegisterPage",
  components: {
  }
};
</script>
<style>
#registerpage {
    width : 300px;
    margin-top : 13%;
    margin-left : 40%;
}
</style>