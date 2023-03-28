<template>
  <div>
    <el-table
      :data="arr"
      border
      style="width: 80%;margin: 20px auto;"
    >
      <el-table-column
        label="留言主题"
        prop="title"
      ></el-table-column>
      <el-table-column
        label="留言者"
        prop="tureName"

      ></el-table-column>
      <el-table-column
        label="留言时间"
      >
      <template slot-scope="scope">
        <span>{{scope.row.time | time}}</span>
      </template>
      </el-table-column>
      <el-table-column
        label="操作"
      >
        <template slot-scope="scope">
          <i class="el-icon-zoom-in" @click="getrouter(scope.row.id)"></i>
        </template>
      </el-table-column>
      <el-table-column label="删除">
        <template slot-scope="scope">
          <el-checkbox-group v-model="flay" @change="change">
            <el-checkbox :key="scope.row.id" :label="scope.row.id"></el-checkbox>
          </el-checkbox-group>
        </template>
      </el-table-column>
    </el-table>
    <el-button type="danger" @click="dels()">批量删除</el-button>
  </div>
</template>

<script>
import dayjs from "dayjs";
import {getAllmessage,del} from "@/API/message";
export default {
  name: "UserComments",
  data() {
    return {
      arr:[],
      flay:[]
    }
  },
  methods:{
    getmsg(){
      getAllmessage().then(res => {
        this.arr = res.data
        console.log(res.data);
      });
    },
    getrouter(id){
      this.$router.push('/msg?id='+id)
    },
    change(){
      console.log(this.flay)
    },
    dels(){
      del(this.flay).then(res => {
        if(res.status === 200){
          this.$message.success('删除成功!');
          this.getmsg();
        }
      })
    }
  },
  filters:{
    time(times){
      const time = dayjs(times).format('YYYY-MM-DD');
      return time
    }
  },
  mounted() {
    this.getmsg()
  }
}
</script>

<style scoped>

</style>
