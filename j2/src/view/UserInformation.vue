<template>
  <div>
    <table style="width: 80%;text-align: center;margin: 30px auto" border="1" >
        <tr>
          <td style="width: 20%">用户昵称:</td>
          <td>{{user.name}}</td>
        </tr>
      <tr>
        <td>用户状态:</td>
        <td>{{user.state == 1 ? '未被冻结' : '已被冻结'}}</td>
      </tr>
      <tr>
        <td>真实姓名:</td>
        <td>{{user.tureName}}</td>
      </tr>
      <tr>
        <td>身份证号:</td>
        <td>{{user.cardId}}</td>
      </tr>
      <tr>
        <td>E-mail</td>
        <td>{{user.email}}</td>
      </tr>
      <tr>
        <td>联系电话:</td>
        <td>{{user.telephone}}</td>
      </tr>
      <tr>
        <td>QQ号码:</td>
        <td>{{user.qqId}}</td>
      </tr>
      <tr>
        <td>在线时间:</td>
        <td>{{user.regTime | change}}</td>
      </tr>
      <tr>
        <td>密码提示:</td>
        <td>{{user.question}}</td>
      </tr>
      <tr>
        <td>密码答案:</td>
        <td>{{user.answer}}</td>
      </tr>
    </table>
  </div>
</template>

<script>
import dayjs from 'dayjs'
import {getuser} from "@/API/user";
export default {
  name: "UserInformation",
  data(){
    return {
      user:{}
    }
  },
  created() {
    this.getuser();
  },
  methods:{
    getuser(){
      getuser(this.$route.query.id).then(res => {
        console.log(res.data)
        this.user = res.data;

      })
    }
  },
  filters:{
    change(time){
      const newtime = dayjs(time).format('YYYY-MM-DD');
      return newtime
    }
  }
}
</script>

<style scoped>
tr {
  height: 30px;
}
</style>
