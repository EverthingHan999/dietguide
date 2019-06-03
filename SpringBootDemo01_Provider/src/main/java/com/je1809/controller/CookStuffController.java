package com.je1809.controller;

import com.je1809.pojo.CookStuff;
import com.je1809.pojo.CookStuffExample;
import com.je1809.service.CookStuffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CookStuffController {
    @Resource
    private CookStuffService cookStuffService;
    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    private static CookStuffExample example;
    static {
        example = new CookStuffExample();
    }
    @ResponseBody
    @GetMapping("/provider/CookStuffs")
    public List<CookStuff> getAllCookStuffs(){
        return cookStuffService.selectByExample(null);
    }

    @ResponseBody
    @GetMapping("/provider/getCookStuffs")
    public List<CookStuff> getCookStuffs(HttpServletRequest request){
        example.clear();
        Integer cid = Integer.valueOf(request.getParameter("cid"));
        CookStuffExample.Criteria criteria = example.createCriteria();
        criteria.andCidEqualTo(cid);
        return cookStuffService.selectByExample(example);
    }
}
