package com.kjxy.springbootdemo.service;

import com.kjxy.springbootdemo.dao.UserDao;
import com.kjxy.springbootdemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    // 注入Spring容器中的bean对象
    @Autowired
    private UserDao userDao;
    public List<User> queryUserList() {
        // 调用userDAO中的方法进行查询
        return this.userDao.queryUserList();
    }
}