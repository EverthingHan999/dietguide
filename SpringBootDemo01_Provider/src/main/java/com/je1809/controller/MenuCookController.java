package com.je1809.controller;

import com.alibaba.fastjson.JSON;
import com.je1809.pojo.MenuCook;
import com.je1809.service.MenuCookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MenuCookController {
    @Autowired
    private MenuCookService menuCookService;
    @Autowired
    private RedisTemplate redisTemplate;

    @ResponseBody
    @GetMapping("/provider/getAllMenuCook")
    public List<MenuCook> getAllMenuCook(){
        return menuCookService.selectByExample(null);
    }

    @ResponseBody
    @GetMapping("/provider/redisMenuCook")
    public List<MenuCook> redisMenuCook(){
        String menucook = (String) redisTemplate.opsForValue().get("menucook");
        if( menucook != null){
            List<MenuCook> list = (List<MenuCook>) JSON.parse(menucook);
            return list;
        }else {
            List<MenuCook> menuCookList = menuCookService.selectByExample(null);
            String s = JSON.toJSONString(menuCookList);
            redisTemplate.opsForValue().set("menucook",s);
            return menuCookList;
        }
    }

}
