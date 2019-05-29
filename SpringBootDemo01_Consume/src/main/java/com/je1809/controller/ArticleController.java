package com.je1809.controller;

import com.je1809.pojo.Article;
import com.je1809.pojo.ArticleDescr;
import com.je1809.pojo.ArticleType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
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
    @ResponseBody
    public List<ArticleType> getArticleTypesAll(){
        return restTemplate.getForObject(REST_URL_PREFIX + "/provider/redisArticleTypesAll",List.class);
    }

    @PostMapping("/consumer/getArticleByAid")
    @ResponseBody
    public Article getArticleByAid(HttpServletRequest request){
        int aid = Integer.parseInt(request.getParameter("aid"));
        return restTemplate.getForObject(REST_URL_PREFIX + "/provider/articleByAid/"+aid,Article.class);
    }

    @PostMapping("/consumer/articleDescrsByAid")
    @ResponseBody
    public List<ArticleDescr> articleDescrsByAid(HttpServletRequest request){
        int aid = Integer.parseInt(request.getParameter("aid"));
        return restTemplate.getForObject(REST_URL_PREFIX + "/provider/articleDescrsByAid/"+aid,List.class);
    }

}
