package com.je1809.controller;

import com.alibaba.fastjson.JSON;
import com.je1809.pojo.ArticleType;
import com.je1809.service.ArticleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Controller
public class ArticleController {

    @Autowired
    private ArticleTypeService articleTypeService;
    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @ResponseBody
    @GetMapping("/provider/redisArticleTypesAll")
    public List<ArticleType> redisCookBook(){
        String cookbook = redisTemplate.opsForValue().get("articleType");
        if( cookbook != null){
            List<ArticleType> list = (List<ArticleType>) JSON.parse(cookbook);
            return list;
        }else {
            List<ArticleType> articleTypeList = articleTypeService.selectByExampleConnect(null);
            String s = JSON.toJSONString(articleTypeList);
            redisTemplate.opsForValue().set("articleType",s);
            redisTemplate.expire("articleType",15000, TimeUnit.MILLISECONDS);
            return articleTypeList;
        }
    }
}
