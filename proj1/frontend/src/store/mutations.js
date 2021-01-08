import {
    GETID,
    A
} from './mutation-types'

export default {
    [GETID] (state, id) {
        console.log("SETID : " + id)
        state.id = id
    },
    [A] () {
        console.log("OK")
    }
}