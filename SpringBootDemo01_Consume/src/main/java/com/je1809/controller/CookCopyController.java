package com.je1809.controller;

import com.je1809.pojo.CookCopy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class CookCopyController {

    private static final String REST_URL_PREFIX = "http://SpringBootDemo01-Provider";

    @Autowired
    private RestTemplate restTemplate;

    @ResponseBody
    @GetMapping("/consumer/CookCopys")
    public List<CookCopy> getAllCookCopys(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/provider/CookCopys",List.class);
    }
}
