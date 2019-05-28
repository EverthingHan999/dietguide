package com.je1809.controller;

import com.je1809.pojo.ArticleType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class ArticleController {

    private static final String REST_URL_PREFIX = "http://SpringBootDemo01-Provider";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/toarticlemain")
    public String index(){
        return "article/articlemain";
    }

    @PostMapping("/consumer/articleTypesAll")
    public List<ArticleType> getArticleTypesAll(){
        return null;
    }

}
