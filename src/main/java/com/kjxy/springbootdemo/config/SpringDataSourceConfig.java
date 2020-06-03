package com.kjxy.springbootdemo.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;


//@Configuration
//@ComponentScan(basePackages = "com.kjxy.springbootdemo")
//@PropertySource(value = {"classpath:jdbc.properties"},ignoreResourceNotFound = true)
public class SpringDataSourceConfig {

    //读取外部的资源配置文件
    @Value("${jdbc.url}")
    private String jdbcUrl;

    @Value("${jdbc.driverClassName}")
    private String jdbcDriverClassName;

    @Value("${jdbc.username}")
    private String jdbcUsername;

    @Value("${jdbc.password}")
    private String jdbcPassword;

    @Bean(destroyMethod = "")
    public DataSource dataSource() {
        //dbcp的使用
        BasicDataSource BasicDataSource = new BasicDataSource();
        // 数据库驱动
        BasicDataSource.setDriverClassName(jdbcDriverClassName);
        // 相应驱动的jdbcUrl
        BasicDataSource.setUrl(jdbcUrl);
        // 数据库的用户名
        BasicDataSource.setUsername(jdbcUsername);
        // 数据库的密码
        BasicDataSource.setPassword(jdbcPassword);
        // 连接初始值，连接池启动时创建的连接数量的初始值  默认值是0
        BasicDataSource.setInitialSize(3);
        // 最大空闲值,当经过一个高峰时间后，连接池可以慢慢将已经用不到的连接慢慢释放一部分，一直减少到maxIdle为止 ，0时无限制  默认值是8
        BasicDataSource.setMaxIdle(5);
        // 最小空闲值,当空闲的连接数少于阀值时，连接池就会预申请去一些连接，以免洪峰来时来不及申请  默认值是0
        BasicDataSource.setMinIdle(3);
        // 连接池的最大值，同一时间可以从池分配的最多连接数量，0时无限制   默认值是8
        BasicDataSource.setMaxTotal(8);
        return BasicDataSource;
    }
}
