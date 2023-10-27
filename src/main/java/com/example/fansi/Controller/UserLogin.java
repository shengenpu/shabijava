package com.example.fansi.Controller;

import com.alibaba.fastjson2.JSONObject;
import com.example.fansi.JWT.JWTUtils;
import com.example.fansi.POJO.User;
import com.example.fansi.Service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
public class UserLogin {
    @Autowired
    Userservice userservice;
    @GetMapping("/select")
    public List<User> sb(){
        return  userservice.queryAll();
    }
    @GetMapping("/register")
    public void register(User user){
        userservice.register(user);
    }
    @PostMapping("/login")
    public JSONObject login(String username,String password){
        User login = userservice.login(username, password);
        String token= JWTUtils.createToken(login);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("token",token);
        jsonObject.put("user",login);
        return jsonObject;
    }

}
