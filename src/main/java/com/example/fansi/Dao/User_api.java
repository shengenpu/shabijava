package com.example.fansi.Dao;

import com.example.fansi.POJO.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface User_api{
    @Select("select * from user")
    public List<User> queryAll();
    @Insert("Insert into user values (#{id},#{username},#{password},#{avatar},#{email},#{phone})")
    void register(User user);
    @Select("select * from user where username=#{username} and password=#{password}")
    User login(String username,String password);
}
