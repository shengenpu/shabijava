package com.example.fansi.Service;

import com.example.fansi.POJO.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface User_api{
    @Select("select * from User")
    public List<User> queryAll();
    User login(String account,String password);
    Void register(String account,String password);
}
