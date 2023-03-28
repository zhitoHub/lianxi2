package com.atzhi.controller;

import com.atzhi.pojo.User;
import com.atzhi.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin        //跨域注解
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/selectAll")
    public List<User> selectAll(){
        return userService.selectAll();
    }

    @PostMapping("/add")
    public String add(User user){
        userService.add(user);
        return "添加成功";
    }

    @GetMapping("/selectById")
    public User selectById(int id){
        return userService.selectById(id);
    }
}
