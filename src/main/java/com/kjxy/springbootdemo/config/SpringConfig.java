package com.kjxy.springbootdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration// 通过该注解来表明该类是一个Spring的配置，相当于一个xml文件
//@ComponentScan(basePackages = "com.kjxy.springbootdemo")// 配置扫描包
//@Import({SpringDataSourceConfig.class,SpringBeanConfig.class})
@ImportResource(locations = {"classpath:applicationContext-*.xml"})
public class SpringConfig {

}
