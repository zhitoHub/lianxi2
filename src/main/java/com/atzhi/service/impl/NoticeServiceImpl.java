package com.atzhi.service.impl;

import com.atzhi.mapper.NoticeMapper;
import com.atzhi.pojo.Notice;
import com.atzhi.pojo.User;
import com.atzhi.service.NoticeService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class NoticeServiceImpl extends ServiceImpl<NoticeMapper, Notice> implements NoticeService {

    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public List<Notice> selectAll() {
        return noticeMapper.selectList(null);
    }

    @Override
    public void deleteBatchIds(@RequestBody List<Long> ids) {
        LambdaQueryWrapper<Notice> queryWrapper = new LambdaQueryWrapper<Notice>()
                .in(Notice::getId,ids);
        noticeMapper.delete(queryWrapper);
    }

    @Override
    public void add(Notice notice) {
        noticeMapper.insert(notice);
    }

    /*@Override
    public void deleteBatchIds(@RequestBody int[] ids) {
        for (int id:ids) {
            noticeMapper.deleteById(id);
        }
    }*/
}
