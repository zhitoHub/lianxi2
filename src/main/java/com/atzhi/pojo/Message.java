package com.atzhi.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_message")
public class Message {
    @TableId(value = "id",type = IdType.AUTO)
    Integer id;
    @TableField("userId")
    Integer userId;
    @TableField("title")
    String title;
    @TableField("content")
    String content;
    @TableField("time")
    String time;
}
