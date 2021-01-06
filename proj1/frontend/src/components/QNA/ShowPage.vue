<template>
  <div>
    <div class="show" id="title"/>
    <div class="show" id= "txt"/>
    <v-btn id="shbtn" v-on:click="$router.push('/')">돌아가기</v-btn>
  </div>
</template>

<script>
export default {
  name: "ShowPage",
  components: {
  },
  mounted() {
  }
};
</script>
<style>
.show {
    border: 1px solid black;
    margin-left: 25%;
}
#title {
    margin-top: 200px;
    width: 1000px;
    height: 40px;
}
#txt {
    margin-top: 40px;
    width: 1000px;
    height: 500px;
}
#shbtn {
    margin-top: 15px;
    margin-left: 50%
}
</style>
