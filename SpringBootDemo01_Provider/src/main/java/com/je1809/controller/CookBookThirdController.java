package com.je1809.controller;

import com.alibaba.fastjson.JSON;
import com.je1809.pojo.CookbookThird;
import com.je1809.service.CookBookThirdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CookBookThirdController {
    @Autowired
    private CookBookThirdService cookBookThirdService;
    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @ResponseBody
    @GetMapping("/provider/getAllCookBookThird")
    public List<CookbookThird> getAllCookBookThird(){
        return cookBookThirdService.selectByExample(null);
    }

    @ResponseBody
    @GetMapping("/provider/redisCookBookThirds")
    public List<CookbookThird> redisCookBookThirds(){
        String cookbookthird = redisTemplate.opsForValue().get("cookbookthird");
        if(cookbookthird != null){
            List<CookbookThird> list = (List<CookbookThird>) JSON.parse(cookbookthird);
            return list;
        }else {
            List<CookbookThird> cookbookThirdList = cookBookThirdService.selectByExample(null);
            String s = JSON.toJSONString(cookbookThirdList);
            redisTemplate.opsForValue().set("cookbookthird",s);
            return cookbookThirdList;
        }
    }
}
