package com.example.fansi.Service;

import com.example.fansi.POJO.User;

import java.util.List;

public interface UserserviceI {
    public List<User> queryAll();
    public void register(User user);
    public User login(String username,String password);
}
