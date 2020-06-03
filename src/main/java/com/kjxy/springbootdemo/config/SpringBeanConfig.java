package com.kjxy.springbootdemo.config;

import com.kjxy.springbootdemo.dao.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration// 通过该注解来表明该类是一个Spring的配置，相当于一个xml文件
//@ComponentScan(basePackages = "com.kjxy.springbootdemo")// 配置扫描包
public class SpringBeanConfig{
    @Bean
    // 通过该注解来表明是一个Bean对象，相当于xml中的<bean>
    public UserDao getUserDAO() {
        return new UserDao(); // 直接new对象做演示
    }
}
