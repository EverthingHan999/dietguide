package com.je1809.controller;

import com.je1809.pojo.CookbootSecond;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@Controller
public class CookBookSecondController {
    private static final String REST_URL_PREFIX = "http://SpringBootDemo01-Provider";

    @Autowired
    private RestTemplate restTemplate;

    @ResponseBody
    @GetMapping("/consume/getCookBookSecondById")
    public CookbootSecond getCookBookSecondById(HttpServletRequest request){
        Integer cbsid = Integer.valueOf(request.getParameter("cbsid"));
        HashMap<String, Integer> map = new HashMap<>();
        map.put("cbsid", cbsid);
        return restTemplate.getForObject(REST_URL_PREFIX+"/provider/getCookSecondById?cbsid={cbsid}",CookbootSecond.class,map);
    }
}
