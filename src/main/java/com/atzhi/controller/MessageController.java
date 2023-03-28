package com.atzhi.controller;

import com.atzhi.pojo.Message;
import com.atzhi.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/message")
@CrossOrigin
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/selectMessage")
    public List<Message> selectMessage(){
        return messageService.selectMessage();
    }

    @GetMapping("/selectId")
    public Message seleceId(int mid){
        return messageService.selectId(mid);
    }

    @DeleteMapping("/deleteBatchIds")
    public String deleteBatchIds(@RequestBody int[] ids){ //@RequestBody直接以String接收前端传过来的json数据
        messageService.deleteBatchIds(ids);
        return "删除成功";
    }
}
