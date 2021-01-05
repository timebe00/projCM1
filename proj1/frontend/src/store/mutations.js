import {
    GETID
} from './mutation-types'

export default {
    [GETID] (state, id) {
        console.log("SETID : " + id)
        state.id = id
    }
}