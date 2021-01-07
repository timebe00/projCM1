<template>
  <div>
    <div class="show" id="titlest">{{ title }}</div>
    <div class="show" id= "txtst">{{ txt }}</div>
    <v-btn id="shbtn" v-on:click="$router.push('/')">돌아가기</v-btn>
    <div class="show" id="shocom">
        <ul>
            <ol v-for="i in list"
             :key=i.comNo id="combody">{{i.comId}} <br/> {{i.comTxtarry}}</ol>
        </ul>
    </div>
    <div class="show" id="comment">
        <v-textarea
         outlined
         no-resize
         v-model="comtxt"
         v-on:click="logintxt()">
        </v-textarea>
        <v-btn v-on:click="oktxt()">확인</v-btn>
    </div>
  </div>
</template>

<script>
import {mapState} from 'vuex'
import axios from 'axios'
import router from '@/router'

export default {
  name: "ShowPage",
  components: {
  },
  props: {
    boardNo: Number
  },
  async mounted() {
    const boardNo = this.boardNo
    console.log("boardNo : " + boardNo)
    await axios.post('http://localhost:1234/board/showtxt', {boardNo})
        .then(res => {
            console.log(res.data)
            this.title = res.data.title
            this.txt = res.data.txt
            for(let i=0; i<res.data.comNo.length; i++) {
                this.list.push({comNo: res.data.comNo[i], comId: res.data.idarry[i], comTxtarry: res.data.txtarry[i]})
            }
        })
        .catch(err => {
            alert("에러 : " + err)
        })
  },
  data() {
    return {
        title: "",
        txt: "",
        comtxt: "",
        list: []
    }
  },
  methods: {
    logintxt() {
        if(this.id ==='')
        {
            router.push('/login')
        }
    },
    oktxt() {
        const {comtxt, id, boardNo} = this
        console.log("comtxt : " + comtxt + "  id : " + id + "  boardNo : " + boardNo)
        axios.post('http://localhost:1234/comment/save', {comtxt, id, boardNo})
            .then(res => {
                console.log(res.data)
                this.list.push({comNo: res.data.comNo, comId: res.data.id, comTxtarry: res.data.comtxt})
                this.comtxt = ""
            })
            .catch(err => {
                console.log(err)
            })
    }
  },
   computed: {
      ...mapState(["id"])
   }
};
</script>
<style>
.show {
    margin-left: 25%;
}
#titlest {
    border: 1px solid black;
    margin-top: 200px;
    width: 1000px;
    text-align: center;
}
#txtst {
    margin-top: 40px;
    width: 1000px;
}
#shbtn {
    margin-top: 15px;
    margin-left: 1350px
}
#comment {
    margin-top: 30px;
    width: 1000px;
}
#shocom {
    margin-top: 30px;
    width: 1000px;
}
#combody {
    border: 1px solid black;
}
</style>
