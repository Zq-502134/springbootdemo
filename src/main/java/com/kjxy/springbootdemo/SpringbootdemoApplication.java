package com.kjxy.springbootdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

//入口类
@SpringBootApplication
@MapperScan("com.kjxy.springbootdemo.mapper")
@EntityScan("com.kjxy.springbootdemo.pojo")
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}

}
