package com.kjxy.springbootdemo.dao;

import com.kjxy.springbootdemo.pojo.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    public List<User> queryUserList() {
        List<User> result = new ArrayList<User>();
        // 模拟数据库的查询
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("username_" + i);
            user.setId("20180111_" + i);
            user.setAge(i + 10);
            result.add(user);
        }
        return result;
    }
}
