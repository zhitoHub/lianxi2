import axios from "axios";

export function getAnn(){
    return axios({
        method:'get',
        url:'http://localhost:8088/notice/selectAll'
    })
}

export function add(data){
    return axios({
        method:'post',
        url:'http://localhost:8088/notice/add',
        data
    })
}

export function delgonggao(data){
    return axios({
        method:'delete',
        url:'http://localhost:8088/notice/deleteBatchIds',
        data
    })
}
