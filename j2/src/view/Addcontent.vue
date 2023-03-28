<template>
  <div>
    <table border="1">
      <tr>
        <td>公告主题:</td>
        <td>
          <input type="text" style="height: 30px;margin-left: 20px" v-model="title">
        </td>
      </tr>
      <tr>
        <td>公告内容:</td>
        <td>
          <textarea style="margin-left: 20px;width: 200px;height: 100px" v-model="content"></textarea>
        </td>
      </tr>
    </table>
    <div style="display: flex;align-items: center">
      <el-button type="primary" @click="adds">添加</el-button>
      <el-button type="warning" @click="deletes">重写</el-button>
    </div>
  </div>
</template>

<script>
import {add} from '@/API/gonggao'
import axios from "axios";
export default {
  name: "Addcontent",
  data(){
    return {
      title:"",
      content:""
    }
  },
  methods:{
    deletes(){
      this.content = ""
      this.title = ""
    },
    adds(){
      axios({
        method: 'post',
        url:`http://localhost:8088/notice/add?title=${this.title}&content=${this.content}`
      }).then(res => {
        if(res.status === 200){
          this.$message({
            message: '公告添加成功!',
            type: 'success'
          });
          setTimeout(() => {
            this.$router.push('/announcement');
          },1000)
        }
      });
    }
  }
}
</script>

<style scoped>
table {
  width: 60%;
  margin: 60px auto;
  padding: 0;
  margin-bottom: 0px;
}
tr {
  height: 30px;
}
</style>
