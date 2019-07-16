package com.itheima.dao;

import com.itheima.domain.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author 刘玉保
 * @date 2019/07/14 上午 9:34
 */

public interface StudentDao {

    @Select("select * from t_student")
    List<Student> findAll();

    @Select("select * from t_student where id = #{id}")
    Student findById(Integer id);

    @Insert("insert into t_student values (null,#{name},#{sex},#{age},#{address})")
    void save(Student student);

    @Update("update t_student set name=#{name},sex=#{sex},age=#{age},address=#{address} where id=#{id}")
    void update(Student student);

    @Delete({"<script>",
            "delete from t_student",
                "<where>",
                    "<foreach item='id' collection='array' open='id in (' close=')' separator=','>",
                        "#{id}",
                     "</foreach>",
                "</where>",
            "</script>"})
    void delete(Integer[] id);

    @Delete("truncate table t_student")
    void deleteAll();
}
