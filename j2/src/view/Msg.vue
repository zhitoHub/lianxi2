<template>
  <table border="1" style="width: 80%;margin: 30px auto">
    <tr>
      <td>留言主题:</td>
      <td>{{msg.title}}</td>
    </tr>
    <tr>
      <td>留言时间:</td>
      <td>{{msg.time | time}}</td>
    </tr>
    <tr style="height: 50px">
      <td>留言内容:</td>
      <td>{{msg.content}}</td>
    </tr>
  </table>
</template>

<script>
import dayjs from "dayjs";
import {getMsg} from "@/API/message";
export default {
  name: "Msg",
  data(){
    return {
      msg:{}
    }
  },
  methods:{
    getmsgs(){
      getMsg(this.$route.query.id).then(res => {
        this.msg = res.data
        console.log(res.data);
      })
    },
  },
  created() {
    this.getmsgs();
  },
  filters:{
    time(val) {
      const me = dayjs(val).format('YYYY-MM-DD');
      return me;
    }
  }
}
</script>

<style scoped>
tr {
  height: 30px;
  text-align: center;
}
</style>
