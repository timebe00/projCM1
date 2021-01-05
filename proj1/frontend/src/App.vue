<template>
  <v-main>
      <v-app-bar absolute dark>
              <v-toolbar-title @click="$router.push('/')">Collapsing Bar</v-toolbar-title>
              <v-spacer></v-spacer>
              <v-btn id="Log" @click="$router.push('/login')" v-if="id === ''">로그인/회원가입</v-btn>
              <v-btn id="Log" v-else>로그아웃</v-btn>
      </v-app-bar>
      <router-view/>
  </v-main>
</template>

<script>
import {mapState} from 'vuex'

export default {
  name: "App",

  components: {
  },

  data: () => ({
    //
  }),
  methods: {
    logout() {
        console.log("id : " + this.id)
    }
  },
  computed: {
    ...mapState(['id'])
  }
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
