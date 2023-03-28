<template>
  <div>
    <el-table
        :data="arr"
        :ref="flay"
        style="width: 80%;margin: 10px auto"
        border
        stripe
    >
      <el-table-column
          label="姓名"
          prop="tureName"
          width="200px"
      ></el-table-column>
      <el-table-column
          label="状态"
          prop="state"
      ></el-table-column>
      <el-table-column
          label="删除"
      >
        <template slot-scope="scope">
          <el-checkbox-group v-model="flay" @change="change">
            <el-checkbox :key="scope.row.id" :label="scope.row.id"></el-checkbox>
          </el-checkbox-group>
        </template>
      </el-table-column>
      <el-table-column label="操作"
      >
        <template slot-scope="scope">
          <i class="el-icon-zoom-in" @click="getpush(scope.row.id)"></i>
        </template>
      </el-table-column>
    </el-table>
    <el-button type="danger" @click="del">批量删除</el-button>
  </div>
</template>

<script>
import {getUserAll, dels} from "@/API/user";
// import axios from "axios";
export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "User",
  data() {
    return {
      arr: [],
      flay: []
    }
  },
  methods: {
    getAll() {
      getUserAll().then(res => {
        if (res.status === 200) {
          this.arr = res.data;
          console.log(res.data)
          this.arr.forEach(item => {
            if (item.state === 1) {
              item.state = '未被冻结'
            } else {
              item.state = '已被冻结'
            }
          });
        }
      });
    },
    getchecked(val) {
      this.flay = val;
      console.log(this.flay)
    },
    change(val) {
      this.flay.forEach(item => {
        console.log(item)
      })
    },
    getpush(id) {
      this.$router.push('/userfrom?id=' + id);
    },
    del() {
      console.log(this.flay)
     dels(this.flay).then(res => {
       if (res.status == 200){
         this.$message.success("删除成功")
         this.getAll()
       }

     })
    }

  },
  created() {
    this.getAll();
  }
}
</script>

<style scoped>

</style>
