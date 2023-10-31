package com.example.fansi.Controller;

import com.example.fansi.JWT.JWTUtils;
import com.example.fansi.POJO.User;
import com.example.fansi.Service.Userservice;
import com.example.fansi.Tool.MD5;
import com.example.fansi.Tool.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
@RestController
public class UserLogin {
    @Autowired
    Userservice userservice;
    MD5 md5=new MD5();
    @GetMapping("/select")
    public List<User> sb(){
        return  userservice.queryAll();
    }
    @GetMapping("/register")
    public Result<User> register(User user){
        String md5pwd = md5.MD5use(user.getPassword());
        user.setPassword(md5pwd);
        userservice.register(user);
        return Result.success(user, "register success");
    }
    @PostMapping("/login")

    public Result<User> login(@RequestParam String username,@RequestParam String password){
        System.out.println(username + password);
        String md5pwd = md5.MD5use(password);
        User login = userservice.login(username, md5pwd);
        String token= JWTUtils.createToken(login);
        return Result.sgs(login,"login success",token);
    }

}
