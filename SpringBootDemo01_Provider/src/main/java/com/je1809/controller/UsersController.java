package com.je1809.controller;

import com.alibaba.fastjson.JSON;
import com.je1809.pojo.Users;
import com.je1809.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UsersController {
    @Autowired
    private UsersService usersService;
    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @ResponseBody
    @GetMapping("/provider/Users")
    public List<Users> getAllUsers(){
        return usersService.selectByExample(null);
    }

    @ResponseBody
    @GetMapping("/provider/redisUser")
    public List<Users> redisUser(){
        String users = redisTemplate.opsForValue().get("users");
        if (users != null){
            List<Users> list = (List<Users>) JSON.parse(users);
            return list;
        }else {
            List<Users> usersList = usersService.selectByExample(null);
            String s = JSON.toJSONString(usersList);
            redisTemplate.opsForValue().set("users",s);
            return usersList;
        }

    }
}
