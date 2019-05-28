package com.je1809.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Controller
public class MenuTypeController {
    private static final String REST_URL_PREFIX = "http://SpringBootDemo01-Provider";
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/consumer/menuIndex")
    public String menuIndex(){
        return "caidan/index";
    }

}
