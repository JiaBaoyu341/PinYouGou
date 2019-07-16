package com.itheima.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.dao.LogDao;
import com.itheima.domain.Log;
import com.itheima.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 刘玉保
 * @date 2019/07/15 下午 5:04
 */
@Service("logService")
public class LogServiceImpl implements LogService {

    @Autowired
    private LogDao logDao;

    public void save(Log log) {
        logDao.save(log);
    }

//    public PageInfo<Log> findAll(Integer pageNum, Integer pageSize) {
//        PageHelper.startPage(pageNum,pageSize);
//        List<Log> logList = logDao.findAll();
//        return new PageInfo<Log>(logList);
//    }

    public PageInfo<Log> findById(Integer[] id,Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Log> logList = logDao.findById(id);
        return new PageInfo<Log>(logList);
    }
}
