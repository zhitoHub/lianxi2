import {request} from "@/request/BaseUrl";


// 所有用户信息
export function getUserAll(){
    return request({
        method:'get',
        url:'/selectAll'
    })
}

// 用户个人信息
export function getuser(id){
    return request({
        method:'get',
        url:'/selectById?id='+ id
    })
}
//这个是批量删除的api么？？
// 我一开始是这样写的但是不知道对不对没用过这个请求不知道咋传参
// 批量删除用户信息
export function dels(data){
    return request({
        method:'delete',
        url:'/delBatchIds',
        data:data
    })
}


export function adds(data){
    return request({
        method:'post',
        url:'/add',
        params:data
    })
}

