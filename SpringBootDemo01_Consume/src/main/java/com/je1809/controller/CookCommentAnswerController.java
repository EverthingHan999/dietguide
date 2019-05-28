package com.je1809.controller;

import com.je1809.pojo.CookCommentAnswer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class CookCommentAnswerController {

    private static final String REST_URL_PREFIX = "http://SpringBootDemo01-Provider";

    @Autowired
    private RestTemplate restTemplate;


    @ResponseBody
    @GetMapping("/consumer/CookCommentAnswers")
    public List<CookCommentAnswer> getAllCookCommentAnswers(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/provider/redisCookCommentAnswers",List.class);
    }
}
