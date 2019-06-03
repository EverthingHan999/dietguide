package com.je1809.controller;

import com.alibaba.fastjson.JSON;
import com.je1809.pojo.MenuCook;
import com.je1809.pojo.MenuCookExample;
import com.je1809.service.MenuCookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MenuCookController {
    @Autowired
    private MenuCookService menuCookService;
    @Autowired
    private RedisTemplate redisTemplate;

    private static MenuCookExample example;
    static {
        example = new MenuCookExample();
    }

    //获取某一菜单下的所有菜品
    @ResponseBody
    @GetMapping("/provider/getCooksByMid")
    public List<MenuCook> getCooksByMid(HttpServletRequest request){
        int mid = Integer.parseInt(request.getParameter("mid"));
        List<MenuCook> menuCooks = menuCookService.getMenu(mid);
        return  menuCooks;
    }

}
