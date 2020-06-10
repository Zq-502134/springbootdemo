package com.kjxy.springbootdemo.service.impl;


import com.kjxy.springbootdemo.mapper.UserMapper;
import com.kjxy.springbootdemo.pojo.User;
import com.kjxy.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User login(User user) {
        /*if(userMapper.selectByUser(user) != null)
            return 1;
        else
            return 0;*/
        return userMapper.selectByUser(user);
    }
}
