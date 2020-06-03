package com.kjxy.springbootdemo.config;

import com.kjxy.springbootdemo.pojo.User;
import com.kjxy.springbootdemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpringBeanConfigTest {

    @Test
    void getUserDAO() {
        // 通过Java配置来实例化Spring容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringBeanConfig.class);
        // 在Spring容器中获取service Bean对象
        UserService userService = context.getBean(UserService.class);
        // 调用对象中的方法
        List<User> list = userService.queryUserList();
        for (User user : list) {
            System.out.println(user.getId() + ", " + user.getName() + ", " + user.getAge());
        }
        // 销毁该容器
        context.destroy();
    }
}