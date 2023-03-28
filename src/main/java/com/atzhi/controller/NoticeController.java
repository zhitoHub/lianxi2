package com.atzhi.controller;

import com.atzhi.pojo.Notice;
import com.atzhi.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notice")
@CrossOrigin
public class NoticeController {
    @Autowired
    private NoticeService noticeService;

    @GetMapping("/selectAll")
    public List<Notice> selectAll(){
        return noticeService.selectAll();
    }

    /*@DeleteMapping("/deleteBatchIds")
    public String deleteBatchIds(@RequestBody int[] ids){
        noticeService.deleteBatchIds(ids);
        return "删除成功";
    }*/

    @DeleteMapping("/deleteBatchIds")
    public String deleteBatchIds(@RequestBody List<Long> ids){
        noticeService.deleteBatchIds(ids);
        return "删除成功";
    }

    @PostMapping("/add")
    public String add(Notice notice){
        noticeService.add(notice);
        return "添加成功";
    }
}
