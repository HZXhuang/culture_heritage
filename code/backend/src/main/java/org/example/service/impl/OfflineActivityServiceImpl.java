package org.example.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.example.mapper.OfflineActivityMapper;
import org.example.pojo.OfflineActivity;
import org.example.service.OfflineActivityService;
import org.example.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OfflineActivityServiceImpl implements OfflineActivityService {

    @Autowired
    OfflineActivityMapper offlineActivityMapper;

    @Override
    public Result getAllOfflineActivity() {
        List<OfflineActivity> list = offlineActivityMapper.selectList(null);
        return Result.success(list);
    }

    @Override
    public Result getAllOfflineActivityByPage(Integer pageSize, Integer pageNumber) {
        IPage<OfflineActivity> page =new Page<>(pageNumber, pageSize);
        offlineActivityMapper.selectPage(page,null);
        Map map = new HashMap();
        map.put("current",page.getCurrent());
        map.put("total", page.getTotal());
        map.put("size",page.getSize());
        map.put("records", page.getRecords());
        return Result.success(map);
    }
}
