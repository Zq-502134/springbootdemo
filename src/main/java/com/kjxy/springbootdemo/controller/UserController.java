package com.kjxy.springbootdemo.controller;

import com.kjxy.springbootdemo.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class UserController {

    /*
    * 返回pojo对象
    * */
    @RequestMapping("/findUser")
    public User findUser(){
        User user = new User();
        user.setId("001");
        user.setName("一号种子");
        user.setAge(10);
        user.setSex("女");
        user.setBirthday(new Date());

        return user;
    }

    /*
    * 返回集合对象
    * */
    @RequestMapping("/findUserList")
    public List findUserList(){
        List uList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId("001"+i);
            user.setName(i+"号种子");
            user.setAge(10+i);
            user.setSex("女");
            user.setBirthday(new Date());
            uList.add(user);
        }

        return uList;
    }
    /*
    * 返回Map对象
    * */
    @RequestMapping("/findUserMap")
    public Map findUserMap(){
        Map umap = new HashMap();
        umap.put("name","Lily");
        umap.put("id","100");
        return umap;
    }
}
