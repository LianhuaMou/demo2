package com.example.demo2.controller;

import com.example.demo2.Service.UserInfoService;
import com.example.demo2.Service.impl.UserInfoServiceImpl;
import com.example.demo2.model.user.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DemoController {
    @Autowired//自动注入
    private UserInfoService userInfoService;

    @RequestMapping(value = "/demo")
    public String hello(){
        return "Hello , Spring Boot";
    }


    @RequestMapping("/insert")
    public void insert(UserInfo userinfo){
        userInfoService.insert(userinfo);
    }
 /*   @RequestMapping("/delete/{id}")
    public void delete(@PathVariable("id")  int id){
        userService.delete(id);
    }
    @RequestMapping("/update")
    public void update(User user){
        userService.update(user);
    }
    @RequestMapping("/select/{id}")
    public User select(@PathVariable("id") int id){
        return userService.select(id);
    }*/
    @RequestMapping("/selectAll")
    public List<UserInfo> selectAll(){
        return userInfoService.selectAll();
    }

}
