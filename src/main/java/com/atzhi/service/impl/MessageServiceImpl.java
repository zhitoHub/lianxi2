package com.atzhi.service.impl;

import com.atzhi.mapper.MessageMapper;
import com.atzhi.pojo.Message;
import com.atzhi.service.MessageService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@Service
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message> implements MessageService {

    @Autowired
    private MessageMapper messageMapper;

    @Autowired
    private MessageService messageService;

    @Override
    public List<Message> selectMessage() {
        return messageMapper.selectList(null);
    }

    @Override
    public Message selectId(int mid) {
        return messageMapper.selectById(mid);
    }

    @Override
    public void deleteBatchIds(@RequestBody int[] ids) {
        for (int id : ids) {
            messageMapper.deleteById(id);
        }
    }
}
