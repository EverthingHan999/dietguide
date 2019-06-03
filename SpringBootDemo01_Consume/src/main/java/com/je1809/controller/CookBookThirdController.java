package com.je1809.controller;

import com.je1809.pojo.CookbookThird;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CookBookThirdController {
    private static final String REST_URL_PREFIX = "http://SpringBootDemo01-Provider";

    @Autowired
    private RestTemplate restTemplate;

    @ResponseBody
    @GetMapping("/consume/getCookSecondThird")
    public List<CookbookThird> getCookSecondThird(HttpServletRequest request){
        Integer cbsid = Integer.valueOf(request.getParameter("cbsid"));
        return restTemplate.getForObject(REST_URL_PREFIX+"/provider/getCookSecondThird?cbsid="+cbsid, List.class);
    }
}
