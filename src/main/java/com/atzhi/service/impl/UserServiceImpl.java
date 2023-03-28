package com.atzhi.service.impl;

import com.atzhi.mapper.UserMapper;
import com.atzhi.pojo.User;
import com.atzhi.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        return userMapper.selectList(null);
    }

    @Override
    public void add(User user) {
        userMapper.insert(user);
    }

    @Override
    public User selectById(int id) {
        return userMapper.selectById(id);
    }

}
