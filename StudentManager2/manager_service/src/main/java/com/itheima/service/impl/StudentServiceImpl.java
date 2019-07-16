package com.itheima.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.dao.StudentDao;
import com.itheima.domain.Student;
import com.itheima.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 刘玉保
 * @date 2019/07/14 上午 10:21
 */

@Service("studentService")
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;


    public PageInfo<Student> findAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Student> studentList = studentDao.findAll();
        return new PageInfo<Student>(studentList);
    }

    public Student findById(Integer id) {
        return studentDao.findById(id);
    }

    public void save(Student student) {
        studentDao.save(student);
    }

    public void update(Student student) {
        studentDao.update(student);
    }

    public void delete(Integer[] id) {
        studentDao.delete(id);
    }

    public void deleteAll() {
        studentDao.deleteAll();
    }
}
