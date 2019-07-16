package com.itheima.service;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.Log;


public interface LogService {
    void save(Log log);

    PageInfo<Log> findById(Integer[] id,Integer pageNum,Integer pageSize);
}
