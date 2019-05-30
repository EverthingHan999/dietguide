package com.je1809.controller;

import com.alibaba.fastjson.JSON;
import com.je1809.pojo.Menu;
import com.je1809.pojo.MenuExample;
import com.je1809.pojo.MenuType;
import com.je1809.pojo.MenuTypeExample;
import com.je1809.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
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
    
    
    //获取所有的菜单
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

    //通过mtid获取所有的menu
    @ResponseBody
    @GetMapping("/provider/getMenusBymtid")
    public List<Menu> getMenusBymtid(HttpServletRequest request){
        example.clear();
        int mtid = Integer.parseInt(request.getParameter("mtid"));
        MenuExample.Criteria criteria = example.createCriteria();
        criteria.andMtidEqualTo(mtid);
        return menuService.selectByExample(example);
    }
    //获取所有的menus
    @ResponseBody
    @GetMapping("/provider/getAllMenus")
    public List<Menu> getAllMenus(){
        example.clear();
        return menuService.selectByExample(null);
    }

    //获取所有的menus2
    @ResponseBody
    @GetMapping("/provider/getAllMenus2")
    public List<Menu> getAllMenus2(){
        example.clear();
        return menuService.selectByExample(null);
    }

    //获取所有的菜单数
    @ResponseBody
    @GetMapping("/provider/getRecordNumbers")
    public int getRecordNumbers(){
        return menuService.countByExample(null);
    }

    //获取热门菜单
    @ResponseBody
    @GetMapping("/provider/getHotMenus")
    public List<Menu> getHotMenus(){
        example.clear();
        example.setOrderByClause(" lookCount desc");
        List<Menu> menus =(ArrayList) menuService.selectByExample(example);
        List<Menu> menuList = new ArrayList<>();
        for (int i= 0;i < menus.size();i++) {
            menuList.add(menus.get(i));
        }
        return menuList;
    }
    //获取菜单种类下的菜单
    @ResponseBody
    @GetMapping("/provider/getSingleMenu")
    public List<Menu> getSingleMenu(HttpServletRequest request){
        example.clear();
        int mtid = Integer.parseInt(request.getParameter("mtid"));
        MenuExample.Criteria criteria = example.createCriteria();
        criteria.andMtidEqualTo(mtid);
        List<Menu> menuList = menuService.selectByExample(example);
        return menuList;
    }


}
