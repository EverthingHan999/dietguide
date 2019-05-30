package com.je1809.controller;

import com.je1809.pojo.MenuType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MenuTypeController {
    private static final String REST_URL_PREFIX = "http://SpringBootDemo01-Provider";
    @Autowired
    private RestTemplate restTemplate;
    //主页跳转自菜单页面的主页
    @GetMapping("/consumer/menuIndex")
    public String menuIndex(){
        return "caidan/index";
    }

    //获取所有的菜单种类
    @ResponseBody
    @GetMapping("/consumer/menuTypes")
    public List<MenuType> menuTypes(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/provider/menuTypes",List.class);
    }

}
