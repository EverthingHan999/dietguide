package com.je1809.controller;

import com.je1809.pojo.Cook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class CookController {
    private static final String REST_URL_PREFIX = "http://SpringBootDemo01-Provider";

    @Autowired
    private RestTemplate restTemplate;
    @ResponseBody
    @GetMapping("/consume/getAllCook")
    public List<Cook> getAllCook(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/provider/redisAllCook",List.class);
    }

    @ResponseBody
    @GetMapping("/consume/redisCookUser")
    public List<Cook> redisCookUser(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/provider/getCookUser",List.class);
    }

    @ResponseBody
    @GetMapping("/consume/getCookPractice")
    public Cook getCookPractice(HttpServletRequest request){
        Integer cid = Integer.valueOf(request.getParameter("cid"));
        return restTemplate.getForObject(REST_URL_PREFIX+"/provider/getCookPractice?cid="+cid,Cook.class);
    }
}
