import {
    GETID
} from './mutation-types'

export default {
    getId ({ commit }, id) {
        console.log("action : " +id)
        commit(GETID, id)
    }
}