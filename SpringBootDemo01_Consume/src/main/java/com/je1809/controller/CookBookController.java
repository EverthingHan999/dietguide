package com.je1809.controller;

import com.je1809.pojo.Cookbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class CookBookController {
    private static final String REST_URL_PREFIX = "http://SpringBootDemo01-Provider";

    @Autowired
    private RestTemplate restTemplate;
    @ResponseBody
    @GetMapping("/consume/getAllCookBook")
    public List<Cookbook> getAllCookBook(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/provider/redisCookBook",List.class);
    }
    @ResponseBody
    @GetMapping("/consume/getCookBookByCbid")
    public List<Cookbook> getCookBookByCbid(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/provider/getCookBookByCbid",List.class);
    }
}
