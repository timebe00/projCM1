<template>
  <v-main>
      <v-app-bar absolute dark>
              <v-toolbar-title @click="$router.push('/')">Collapsing Bar</v-toolbar-title>
              <v-spacer></v-spacer>
              <v-btn id="Log" @click="$router.push('/login')">로그인/회원가입</v-btn>
      </v-app-bar>
      <router-view/>
  </v-main>
</template>

<script>

export default {
  name: "App",

  components: {
  },

  data: () => ({
    //
  })
};
</script>

<style>
#Log {
    background-color : #ffffff;
    color: #000000
}
.mainbs {
    margin-top: 65px;
    width: 100vw;
    height: 92.9vh;
}
</style>
