package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

public interface UserService {

    /**
     * 用户登录
     * @return
     */
    User login(User user);

    /**
     * 查找所有用户
     * @return
     */
    List<User> findAll();
}
