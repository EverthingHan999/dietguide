package com.je1809.controller;

import com.je1809.pojo.CookStuff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CookStuffController {
    private static final String REST_URL_PREFIX = "http://SpringBootDemo01-Provider";
    @Autowired
    private RestTemplate restTemplate;

    @ResponseBody
    @GetMapping("/consume/getCookStuffs")
    public List<CookStuff> getCookStuff(HttpServletRequest request){
        Integer cid = Integer.valueOf(request.getParameter("cid"));
        return restTemplate.getForObject(REST_URL_PREFIX+"/provider/getCookStuffs?cid="+cid,List.class);
    }
}
