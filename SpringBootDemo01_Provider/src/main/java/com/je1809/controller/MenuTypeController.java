package com.je1809.controller;

import com.je1809.pojo.MenuTypeExample;
import com.je1809.service.MenuTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class MenuTypeController {
    @Resource
    private MenuTypeService menuTypeService;

    private static MenuTypeExample example;

    static {
        example = new MenuTypeExample();
    }

    @ResponseBody
    @PostMapping("/provider/menuIndex")
    public String menuIndex(){
        return "caidan/index";
    }
}
