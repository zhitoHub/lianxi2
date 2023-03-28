<template>
  <div>
    <el-menu
        default-active="2"
        class="el-menu-vertical-demo"
        background-color="#545c64"
        text-color="#fff"
        active-text-color="#ffd04b"

    >
      <el-submenu index="2" >
        <template slot="title">
          <i class="el-icon-s-shop"></i>
          <span>商品管理</span>
        </template>
        <el-menu-item-group v-for="item in arr[0]">
          <el-menu-item :index="item.index" @click="getpath(item.path)">
            <i :class="item.icon"></i>
            <span>{{item.name}}</span>
          </el-menu-item>
        </el-menu-item-group>
      </el-submenu>
      <el-submenu index="3">
        <template slot="title">
          <i class="el-icon-user-solid"></i>
          <span>用户管理</span>
        </template>
        <el-menu-item-group v-for="item in arr[1]">
          <el-menu-item :index="item.index" @click="getpath(item.path)">
            <i :class="item.icon"></i>
            <span>{{item.name}}</span>
          </el-menu-item>
        </el-menu-item-group>
      </el-submenu>
      <el-submenu index="4">
        <template slot="title">
          <i class="el-icon-document"></i>
          <span>订单管理</span>
        </template>
        <el-menu-item-group v-for="item in arr[2]">
          <el-menu-item :index="item.index" @click="getpath(item.path)">
            <i :class="item.icon"></i>
            <span>{{item.name}}</span>
          </el-menu-item>
        </el-menu-item-group>
      </el-submenu>
      <el-submenu index="5">
        <template slot="title">
          <i class="el-icon-document-copy"></i>
          <span>信息管理</span>
        </template>
        <el-menu-item-group v-for="item in arr[3]">
          <el-menu-item :index="item.index" @click="getpath(item.path)">
              <i :class="item.icon"></i>
              <span>{{item.name}}</span>
          </el-menu-item>
        </el-menu-item-group>
      </el-submenu>
    </el-menu>
  </div>
</template>

<script>
import {nav} from "@/Data/Nav";
export default {
  name: "CommonAside",
  data(){
    return{
      arr:nav
    }
  },
  created() {

  },
  methods:{
    getpath(path){
      if(this.$route.path !== path){
        this.$router.push(path);
      }
    }
  }
}
</script>

<style scoped>
.el-menu {
  height: 100vh;
  border: none;
}
</style>
