package com.itheima.service;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.Student;

public interface StudentService {

    /**
     * 查找所有学生信息
     * @return
     */
    PageInfo findAll(Integer pageNum, Integer pageSize);

    /**
     * 根据ID查找对应学生信息
     * @param id
     * @return
     */
    Student findById(Integer id);

    /**
     * 添加学生信息
     * @param student
     */
    void save(Student student);

    /**
     * 修改学生信息
     * @param student
     */
    void update(Student student);

    /**
     * 批量删除学生信息
     * @param id
     */
    void delete(Integer[] id);

    /**
     * 清除所有学生信息
     */
    void deleteAll();

}
