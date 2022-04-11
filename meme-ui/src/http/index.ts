import axios from "axios";

const baseURL = 'http://localhost/api/core'
const getMemeByRand = (path: string) => {
    return axios.get(baseURL + path)
}
export {
    getMemeByRand
}
