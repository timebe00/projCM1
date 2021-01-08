import {
    GETID,
    A
} from './mutation-types'

import axios from 'axios'
import router from '@/router'

export default {
    getId ({ commit }, id) {
        console.log("action : " +id)
        commit(GETID, id)
    },
    resetpw(payload) {
      axios.post('http://localhost:1234/register/reset', payload)
        .then(res => {
          console.log("res : " + res.status)
          if(res.status == 200) {
              alert("로그인 해 주세요")
              router.push("/login")
          } else {
              alert("오류")
          }
        })
        .catch(err => {
          alert("에러 : " + err)
        })
    },
    overlap({ commit }, payload) {
        commit(A)
        axios.post('http://localhost:1234/register/sameid', payload)
            .then(res => {
                if(res.status == 200) {
                    alert("사용할 수 있는 아이디 입니다.")
                } else {
                    alert("사용할 수 없는 아이디 입니다.")
                }
            })
            .catch(err => {
                alert("에러 : " + err)
            })
    },
    inputreg({ commit }, payload) {
        commit(A)
        axios.post('http://localhost:1234/register/register', payload)
            .then(res => {
                console.log("res : " + res.status)
                if(res.status == 200) {
                    alert("회원가입 성공")
                    router.push('/login')
                } else {
                    alert("회원가입 실패")
                }
            })
            .catch(err => {
                alert("에러 : " + err)
            })
    },
    gologin({ commit }, payload) {
        axios.post('http://localhost:1234/register/login', payload)
        .then(res => {
            console.log("res : " + res.status)
            if(res.status == 200) {
                console.log(res.data)
                commit(GETID, res.data)
                router.push('/')
            } else {
                alert(this.id)
            }
        })
        .catch(err => {
            alert("에러 : " + err)
        })
    },
    regfindid({ commit }, payload) {
        commit(A)
        axios.post('http://localhost:1234/register/findid', payload)
            .then(res => {
                console.log("res : " + res.status)
                if(res.status == 200) {
                    alert(res.data)
                } else {
                    alert("다시 입력해 주세요.")
                }
            })
            .catch(err => {
                alert("에러 : " + err)
            })
    },
    regfindpw({ commit }, payload) {
        commit(A)
        axios.post('http://localhost:1234/register/findpw', payload)
            .then(res => {
                console.log("res : " + res.status)
                if(res.status == 200) {
                    console.log(payload.id)
                    router.push({ name: 'Reset', params: { id: payload.id} })
                } else {
                    alert("다시 입력해 주세요.")
                }
            })
            .catch(err => {
                alert("에러 : " + err)
            })
    },
    inputwt({ commit }, payload) {
        commit(A)
        axios.post('http://localhost:1234/board/save', payload)
            .then(res => {
                console.log(res)
                router.push('/')
            })
            .catch(err => {
                alert("에러 : " + err)
            })
    }
}