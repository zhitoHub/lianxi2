import axios from "axios";

export const request = axios.create({
    baseURL:'http://localhost:8088/user',
    timeout:10000
})
