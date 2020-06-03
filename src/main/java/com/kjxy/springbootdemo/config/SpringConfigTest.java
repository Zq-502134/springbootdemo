package com.kjxy.springbootdemo.config;

import com.kjxy.springbootdemo.dao.UserDao;
import com.kjxy.springbootdemo.pojo.User;
import com.kjxy.springbootdemo.service.UserService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

import java.util.List;

class SpringConfigTest {
    public static void main(String[] args) {
        // 通过Java配置来实例化Spring容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        // 在Spring容器中获取service Bean对象
        UserService userService = context.getBean(UserService.class);
        DataSource ds = context.getBean(DataSource.class);
        // 调用对象中的方法
        List<User> list = userService.queryUserList();
        for (User user : list) {
            System.out.println(user.getId() + ", " + user.getName() + ", " + user.getAge());
        }
        System.out.println(ds.getClass());
        System.out.println(ds.getClass().getName());
        // 销毁该容器
        context.destroy();
    }

}