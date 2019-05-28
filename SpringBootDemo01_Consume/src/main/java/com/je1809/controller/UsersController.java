package com.je1809.controller;

import com.je1809.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class UsersController {

    private static final String REST_URL_PREFIX = "http://SpringBootDemo01-Provider";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/Users")
    @ResponseBody
    public List<Users> getAllUsers(){
        return restTemplate.getForObject(REST_URL_PREFIX + "/provider/redisUser",List.class);
    }

    @GetMapping("/consumer/hello")
    public String index(){
        return "index";
    }

    @GetMapping("/consumer/abc")
    @ResponseBody
    public String index1(){
        return "abc";
    }
}
