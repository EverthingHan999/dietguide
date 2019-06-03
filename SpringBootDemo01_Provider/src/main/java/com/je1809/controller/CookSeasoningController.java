package com.je1809.controller;

import com.je1809.pojo.CookSeasoning;
import com.je1809.pojo.CookSeasoningExample;
import com.je1809.service.CookSeasoningService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CookSeasoningController {
    @Resource
    private CookSeasoningService cookSeasoningService;
    @Resource
    private RedisTemplate<String,String> redisTemplate;

    private static CookSeasoningExample example;
    static {
        example = new CookSeasoningExample();
    }
    @ResponseBody
    @GetMapping("/provider/CookSeasonings")
    public List<CookSeasoning> getAllCookSeasonings(){
        return cookSeasoningService.selectByExample(null);
    }

    @ResponseBody
    @GetMapping("/provider/getCookSeasoningById")
    public List<CookSeasoning> getCookSeasoningById(HttpServletRequest request){
        example.clear();
        Integer cid = Integer.valueOf(request.getParameter("cid"));
        CookSeasoningExample.Criteria criteria = example.createCriteria();
        criteria.andCidEqualTo(cid);
        return cookSeasoningService.selectByExample(example);
    }

}
