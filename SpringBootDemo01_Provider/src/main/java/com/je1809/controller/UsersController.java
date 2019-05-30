package com.je1809.controller;

import com.alibaba.fastjson.JSON;
import com.je1809.pojo.Users;
import com.je1809.pojo.UsersExample;
import com.je1809.service.UsersService;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

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
            redisTemplate.expire("users",10000, TimeUnit.MILLISECONDS);
            return usersList;
        }
    }

    @ResponseBody
    @GetMapping("/provider/getUserByUser")
    public Users getUserByUser(HttpServletRequest req){
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        UsersExample usersExample = new UsersExample();
        UsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andUnameEqualTo(username);
        criteria.andPasswordEqualTo(password);
        List<Users> usersList = usersService.selectByExample(usersExample);
        if (usersList.size() == 0){
            return null;
        }else {
            return usersList.get(0);
        }
    }

    @ResponseBody
    @GetMapping("/provider/getIndexInfo")
    public Users getIndexInfo(String uname){
        return usersService.selectIndexByUserName(uname);
    }


}
