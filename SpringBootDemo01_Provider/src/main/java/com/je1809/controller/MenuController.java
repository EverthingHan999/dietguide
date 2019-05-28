package com.je1809.controller;

import com.alibaba.fastjson.JSON;
import com.je1809.pojo.Menu;
import com.je1809.pojo.MenuExample;
import com.je1809.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MenuController {
    @Autowired
    private MenuService menuService;
    @Autowired
    private RedisTemplate redisTemplate;

    private static MenuExample example;
    static {
        example = new MenuExample();
    }
    //获取所有的
    @ResponseBody
    @GetMapping("/provider/getAllMenu")
    public List<Menu> getAllMenu(){
        return menuService.selectByExample(null);
    }

    @ResponseBody
    @GetMapping("/provider/redisMenu")
    public List<Menu> redisMenu(){
        String menu = (String) redisTemplate.opsForValue().get("menu");
        if( menu != null){
            List<Menu> list = (List<Menu>) JSON.parse(menu);
            return list;
        }else {
            List<Menu> menuList = menuService.selectByExample(null);
            String s = JSON.toJSONString(menuList);
            redisTemplate.opsForValue().set("menu",s);
            return menuList;

        }
    }
}
