package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    @Select("select * from t_user where name = #{name} and password = #{password}")
    User login(User user);

    @Select("select * from t_user")
    List<User> findAll();
}
