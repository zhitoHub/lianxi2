package com.atzhi.service;

import com.atzhi.pojo.Notice;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface NoticeService extends IService<Notice> {
    List<Notice> selectAll();

    void deleteBatchIds(List<Long> ids);
//    void deleteBatchIds(int[] ids);

    void add(Notice notice);
}
