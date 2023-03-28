package com.atzhi.service;

import com.atzhi.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface UserService extends IService<User> {
    List<User> selectAll();

    void add(User user);

    User selectById(int id);
}
