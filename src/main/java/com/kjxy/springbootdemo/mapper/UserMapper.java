package com.kjxy.springbootdemo.mapper;

import com.kjxy.springbootdemo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByUser(User user);

/*    @Select("select * from userinfo where username=#{username} and password=#{password}")
    // @Results用于映射对象属性和数据库列，常用于对象属性和数据库列不同名情况
    @Results(id="userResult",value={
            @Result(id=true,column="id",property="id"),
            @Result(column="username",property="username"),
            @Result(column="password",property="password"),
            @Result(column="email",property="email"),
            @Result(column="phone",property="phone"),
            @Result(column="role",property="role")
    })
    User selectByUser(User user);*/
}