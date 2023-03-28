<template>
  <div>
    <el-container>
      <el-aside width="210px" >
        <CommonAside></CommonAside>
      </el-aside>
      <el-container>
        <el-header>
          <CommonHeader></CommonHeader>
        </el-header>
        <router-view></router-view>
      </el-container>
    </el-container>
  </div>
</template>

<script>
import CommonAside from "@/components/CommonAside";
import CommonHeader from "@/components/CommonHeader";
export default {
  name: "Main",
  components:{
    CommonAside,
    CommonHeader
  }

}
</script>

<style scoped>
.el-aside {
  height: 100vh;
  padding: 0;
}
/deep/ .el-header {
  height: 120px;
}
.el-header {
  height: 120px;
  padding: 0;
}
</style>
