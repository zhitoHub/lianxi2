import axios from "axios";
export function getAllmessage(){
    return axios({
        method:'get',
        url:'http://localhost:8088/message/selectMessage'
    })
}

export function getMsg(id){
    return axios({
        method:'get',
        url:`http://localhost:8088/message/selectId?mid=${id}`
    })
}

export function del(data){
    return axios({
        method:'delete',
        url:'http://localhost:8088/message/deleteBatchIds',
        data:data
    })
}
