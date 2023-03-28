package com.atzhi.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("t_user")
@Data
public class User {
    @TableId(value = "id",type = IdType.AUTO)
    Integer id;
    @TableField("name")
    String name;
    @TableField("tureName")
    String tureName;
    @TableField("cardId")
    String cardId;
    @TableField("email")
    String email;
    @TableField("telephone")
    String telephone;
    @TableField("qqId")
    String qqId;
    @TableField("pwd")
    String pwd;
    @TableField("regTime")
    String regTime;
    @TableField("question")
    String question;
    @TableField("answer")
    String answer;
    @TableField("state")
    Integer state;
}
