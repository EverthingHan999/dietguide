package com.je1809.controller;

import com.alibaba.fastjson.JSON;
import com.je1809.pojo.CookCommentAnswer;
import com.je1809.pojo.CookCommentAnswerExample;
import com.je1809.service.CooKCommentAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class CookCommentAnswerController {
    @Autowired
    private CooKCommentAnswerService cooKCommentAnswerService;

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    private static CookCommentAnswerExample example;
    static {
        example = new CookCommentAnswerExample();
    }
    //获取所有的评价回答
    @ResponseBody
    @GetMapping("/provider/CookCommentAnswers")
    public List<CookCommentAnswer> getAllCookCommentAnswers(){
        return cooKCommentAnswerService.selectByExample(null);
    }


    //将查询到的评论存入到redis中
    @ResponseBody
    @GetMapping("/provider/redisCookCommentAnswers")
    public List<CookCommentAnswer> redisCookCommentAnswers(){
        String cookCommentAnswers = redisTemplate.opsForValue().get("cookCommentAnswers");
        //如果cookCommentAnswers不为空，说明redis中已经存储过该key
        if (cookCommentAnswers != null){
            List<CookCommentAnswer> list = (List<CookCommentAnswer>) JSON.parse(cookCommentAnswers);
            return list;

        }else {
            //如果cookCommentAnswers为空，说明redis中没有存储过该键值对，将其存至redis中
            List<CookCommentAnswer> cookCommentAnswersList = cooKCommentAnswerService.selectByExample(null);
            String s = JSON.toJSONString(cookCommentAnswersList);
            redisTemplate.opsForValue().set("cookCommentAnswers",s);
            return cookCommentAnswersList;
        }
    }

}
