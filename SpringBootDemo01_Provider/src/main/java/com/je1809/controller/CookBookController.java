package com.je1809.controller;

import com.alibaba.fastjson.JSON;
import com.je1809.pojo.Cook;
import com.je1809.pojo.Cookbook;
import com.je1809.service.CookBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class CookBookController {
    @Autowired
    private CookBookService cookBookService;
    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @ResponseBody
    @GetMapping("/provider/getAllCookbook")
    public List<Cookbook> getAllCookbook(){
        return cookBookService.selectByExample(null);
    }
    @ResponseBody
    @GetMapping("/provider/redisCookBook")
    public List<Cookbook> redisCookBook(){
        String cookbook = redisTemplate.opsForValue().get("cookbook");
        if( cookbook != null){
            List<Cookbook> list = (List<Cookbook>)JSON.parse(cookbook);
            return list;
        }else {
            List<Cookbook> cookbookList = cookBookService.selectByExample(null);
            String s = JSON.toJSONString(cookbookList);
            redisTemplate.opsForValue().set("cookbook",s);
            return cookbookList;
        }
    }
}
