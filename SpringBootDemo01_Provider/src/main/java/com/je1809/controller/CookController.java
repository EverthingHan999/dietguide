package com.je1809.controller;

import com.alibaba.fastjson.JSON;
import com.je1809.pojo.Cook;
import com.je1809.pojo.CookExample;
import com.je1809.service.CookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springsource.loaded.C;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Controller
public class CookController {
    @Autowired
    private CookService cookService;
    @Autowired
    private RedisTemplate redisTemplate;

    private static CookExample cookExample;
    static {
        cookExample = new CookExample();
    }

    @ResponseBody
    @GetMapping("/provider/getAllCook")
    public List<Cook> getAllCook(){
        cookExample.clear();
        List<Cook> cooks = cookService.selectByExample(null);
        return cooks;
    }

    @ResponseBody
    @GetMapping("/provider/redisAllCook")
    public List<Cook> redisAllCook(){
        cookExample.clear();
        String cook = (String) redisTemplate.opsForValue().get("cook");
        if(cook != null){
            List<Cook> list = (List<Cook>) JSON.parse(cook);
            return list;
        }else {
            List<Cook> cookList = cookService.selectByExample(null);
            ArrayList<Cook> cookArrayList = new ArrayList<>();
            for (int i=0 ; i<10; i++){
                cookArrayList.add(cookList.get(i));
            }
            String s = JSON.toJSONString(cookList);
            redisTemplate.opsForValue().set("cook",s);
            redisTemplate.expire("cookList",5000, TimeUnit.MILLISECONDS);
            return cookList;
        }
    }

    @ResponseBody
    @GetMapping("/provider/getCookUser")
    public List<Cook> getCookUser(){
        cookExample.clear();
        List<Cook> cooks = cookService.cook3();
        return cooks;
    }


    @ResponseBody
    @GetMapping("/provider/redisCookUser")
    public List<Cook> redisCookUser(){
        cookExample.clear();
        String cook1 = (String) redisTemplate.opsForValue().get("cook1");
        if(cook1 != null){
            List<Cook> list = (List<Cook>) JSON.parse(cook1);
            return list;
        }else {
            List<Cook> cookList = cookService.cook3();
            ArrayList<Cook> cookuArrayList = new ArrayList<>();
            for (int i=0 ; i<cookList.size(); i++){
                cookuArrayList.add(cookList.get(i));
            }
            String s = JSON.toJSONString(cookList);
            redisTemplate.opsForValue().set("cook1",s);
           /* redisTemplate.expire("cookList",5000, TimeUnit.MILLISECONDS);*/
            return cookList;
        }
    }
}
