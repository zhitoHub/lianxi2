package com.atzhi.service;

import com.atzhi.pojo.Message;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface MessageService extends IService<Message> {
    List<Message> selectMessage();

    Message selectId(int mid);

    void deleteBatchIds(int[] ids);
}
