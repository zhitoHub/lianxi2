import Vue from "vue";
import VueRouter from "vue-router";

Vue.use(VueRouter);

import Main from "@/view/Main";
import Goods from "@/view/Goods";
import Addgoods from "@/view/Addgoods";
import Goodscategory from "@/view/Goodscategory";
import Addgoodscategory from "@/view/Addgoodscategory";
import Adduser from "@/view/Adduser";
import User from "@/view/User";
import UserComments from "@/view/UserComments";
import ChangeUser from "@/view/ChangeUser";
import ChangeGoods from "@/view/ChangeGoods";
import SelectGoods from "@/view/SelectGoods";
import UserInformation from "@/view/UserInformation";
import Msg from "@/view/Msg";
import Announcement from "@/view/Announcement";
import Addcontent from "@/view/Addcontent";
const router = new VueRouter({
   routes:[
       {
           path:'/',
           component:Main,
           redirect:'/goods',
           children:[
               {path:'goods',component:Goods},
               {path:'addgoods',component:Addgoods},
               {path:'category',component:Goodscategory},
               {path:'addcategory',component:Addgoodscategory},
               {path:'user',component:User},
               {path:'adduser',component:Adduser},
               {path:'UserComments',component:UserComments},
               {path:'changeuser',component:ChangeUser},
               {path:'changegoods',component:ChangeGoods},
               {path:'selectgoods',component:SelectGoods},
               {path:'userfrom',component:UserInformation},
               {path:'msg',component:Msg},
               {path:'announcement',component:Announcement},
               {path:'addcontent',component:Addcontent}
           ]

       },
   ]
});

export default router
