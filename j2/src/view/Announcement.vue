<template>
  <div>
    <el-table
      :data="arr"
      border
      style="width: 80%;margin: 30px auto"
    >
      <el-table-column
        label="删除"
      >
        <template slot-scope="scope">
          <el-checkbox-group v-model="flay" @change="change">
            <el-checkbox :label="scope.row.id"></el-checkbox>
          </el-checkbox-group>
        </template>
      </el-table-column>
      <el-table-column
        prop="title"
        label="公告主题"
      ></el-table-column>
      <el-table-column
        label="操作"
      >
      <template slot-scope="scope">
        <el-button type="success">查看</el-button>
        <el-button type="warning">编辑</el-button>
      </template>
      </el-table-column>
    </el-table>
    <el-button type="danger" @click="shan">批量删除</el-button>
  </div>
</template>

<script>
import {getAnn,delgonggao} from "@/API/gonggao";
export default {
  name: "Announcement",
  data() {
    return {
      arr:[],
      flay:[]
    }
  },
  methods:{
    getAll(){
      getAnn().then(res => {
        this.arr = res.data
        console.log(res.data)
        // for(let i = 0; i < 6; i++){
        //   this.arr.push( res.data[i]);
        // }
      })
    },
    change(){
      console.log(this.flay)
    },
    shan(){
      delgonggao(this.flay).then(res => {
        if(res.status === 200){
          this.$message.success('删除成功!');
          this.getAll();
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
