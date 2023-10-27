package com.example.fansi.Service;

import com.example.fansi.Dao.User_api;
import com.example.fansi.POJO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Userservice implements UserserviceI{
    @Autowired
    User_api user_api;

    @Override
    public List<User> queryAll() {
        return user_api.queryAll();
    }

    @Override
    public void register(User user) {
        user_api.register(user);
    }

    @Override
    public User login(String username, String password) {
        return user_api.login(username, password);
    }


}
