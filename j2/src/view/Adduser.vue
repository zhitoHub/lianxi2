<template>
  <div>
    <div class="input">
      <div class="flex">
        <span>用户昵称:</span>
        <el-input
            style="width: 50%"
            placeholder="请输入昵称"
            prefix-icon="el-icon-search"
            v-model="nickname">
        </el-input>
      </div>
      <div class="flex">
        <span>真实姓名:</span>
        <el-input
            style="width: 50%"
            placeholder="请输入真实姓名"
            prefix-icon="el-icon-user"
            v-model="name">
        </el-input>
      </div>
      <div class="flex">
        <span>身份证号:</span>
        <el-input
            style="width: 50%"
            placeholder="请输入身份证号"
            prefix-icon="el-icon-copy-document"
            v-model="identityCard">
        </el-input>
      </div>
      <div class="flex">
        <span>电子邮箱:</span>
        <el-input
            style="width: 50%"
            placeholder="请输入电子邮箱"
            prefix-icon="el-icon-help"
            v-model="email">
        </el-input>
      </div>
      <div class="flex">
        <span>联系电话:</span>
        <el-input
            style="width: 50%"
            placeholder="请输入电子邮箱"
            prefix-icon="el-icon-phone-outline"
            v-model="phone">
        </el-input>
      </div>
      <div class="flex">
        <span>QQ号码:</span>
        <el-input
            style="width: 50%"
            placeholder="请输入电子邮箱"
            prefix-icon="el-icon-eleme"
            v-model="QQ">
        </el-input>
      </div>
    </div>
    <div style="display: flex;justify-content: center">
      <el-button type="success" @click="add">添加</el-button>
      <el-button type="danger" @click="del">重写</el-button>
    </div>
  </div>
</template>

<script>
import {adds} from "@/API/user";
export default {
  name: "Adduser",
  data() {
    return {
      nickname:"",
      name:"",
      identityCard:"",
      email:"",
      phone:"",
      QQ:""
    }
  },
  methods:{
    del(){
      this.nickname = ""
      this.name = ""
      this.identityCard = ""
      this.email = ""
      this.phone = ""
      this.QQ = ""
    },
    add(){
      adds({
        name:this.nickname,
        tureName:this.name,
        cardId:this.identityCard,
        email:this.email,
        telephone:this.phone,
        qqId:this.QQ
      }).then(res => {
        if(res.status === 200){
          this.$message.success('添加成功!')
        }
      })
    }
  }
}
</script>

<style scoped>
.input {
  width: 50%;
  margin: 20px auto;
}
span {
  margin-right: 20px;
}
.flex {
  display: flex;
  align-items: center;
  margin: 10px 0px;
}
</style>
