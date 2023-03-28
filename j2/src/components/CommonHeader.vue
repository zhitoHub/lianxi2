<template>
  <div class="header">
    <div class="left-title" style="display: flex;align-items: center;padding-left: 30px">
      <h1>电商后台管理系统</h1>
    </div>
    <div class="right">
      <el-dropdown>
					<span class="el-dropdown-link">
						<img src="../assets/user.png" class="user">
					</span>
        <el-dropdown-menu slot="dropdown">
          <el-dropdown-item>个人中心</el-dropdown-item>
          <el-dropdown-item>退出</el-dropdown-item>
        </el-dropdown-menu>
      </el-dropdown>
    </div>
  </div>
</template>

<script>
export default {
  name: "CommonHeader"
}
</script>

<style scoped>
.header {
  height: 100%;
  width: auto;
  background-color: #545c64;
  color: white;
  padding: 0;
  display: flex;
  justify-content: space-between;
}
.user {
  height: 35px;
  width: 35px;
  border-radius: 50%;
}
.right {
  display: flex;
  align-items: center;
  padding-right: 50px;
}
</style>
