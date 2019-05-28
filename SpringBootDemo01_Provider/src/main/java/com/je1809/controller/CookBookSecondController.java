package com.je1809.controller;

import com.alibaba.fastjson.JSON;
import com.je1809.pojo.CookbootSecond;
import com.je1809.service.CookBookSecondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CookBookSecondController {
    @Autowired
    private CookBookSecondService cookBookSecondService;
    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @ResponseBody
    @GetMapping("/provider/getAllCookBookSecond")
    public List<CookbootSecond> getAllCookBookSecond(){
        return cookBookSecondService.selectByExample(null);
    }

    @ResponseBody
    @GetMapping("/provider/redisCookBookSecond")
    public List<CookbootSecond> redisCookBookSecond(){
        String cookbootsecond = redisTemplate.opsForValue().get("cookbootsecond");
        if (cookbootsecond != null){
            List<CookbootSecond> list = (List<CookbootSecond>) JSON.parse(cookbootsecond);
            return list;
        }else {
            List<CookbootSecond> cookbootSecondList = cookBookSecondService.selectByExample(null);
            String s = JSON.toJSONString(cookbootSecondList);
            redisTemplate.opsForValue().set("cookbootsecond",s);
            return cookbootSecondList;
        }
    }
}