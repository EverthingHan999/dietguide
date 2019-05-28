package com.je1809.controller;

import com.je1809.pojo.CookSeasoning;
import com.je1809.service.CookSeasoningService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class CookSeasoningController {
    @Resource
    private CookSeasoningService cookSeasoningService;
    @Resource
    private RedisTemplate<String,String> redisTemplate;

    @ResponseBody
    @GetMapping("/provider/CookSeasonings")
    public List<CookSeasoning> getAllCookSeasonings(){
        return cookSeasoningService.selectByExample(null);
    }



}
