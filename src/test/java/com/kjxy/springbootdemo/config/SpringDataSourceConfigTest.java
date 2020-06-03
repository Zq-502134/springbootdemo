package com.kjxy.springbootdemo.config;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

import static org.junit.jupiter.api.Assertions.*;

class SpringDataSourceConfigTest {

    @Test
    void dataSource() {
        // 通过Java配置来实例化Spring容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringDataSourceConfig.class);
        DataSource ds = context.getBean(DataSource.class);
        System.out.println(ds.getClass());
        System.out.println(ds.getClass().getName());
        // 销毁该容器
        context.destroy();
    }
}