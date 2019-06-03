package com.je1809.controller;

import com.je1809.pojo.CookMakeMethod;
import com.je1809.pojo.CookMakeMethodExample;
import com.je1809.service.CookMakeMethodService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CookMakeMethodController {
    @Resource
    private CookMakeMethodService cookMakeMethodService;
    @Resource
    private RedisTemplate<String,String> redisTemplate;
    private static CookMakeMethodExample example;
    static {
        example = new CookMakeMethodExample();
    }

    @ResponseBody
    @GetMapping("/provider/CookMakeMethods")
    public List<CookMakeMethod> getAllCookMakeMethods(){

        return cookMakeMethodService.selectByExample(null);
    }

    @ResponseBody
    @GetMapping("/provider/getCookMakeMethodById")
    public List<CookMakeMethod> getCookMakeMethodById(HttpServletRequest request){
        example.clear();
        Integer cid = Integer.valueOf(request.getParameter("cid"));
        CookMakeMethodExample.Criteria criteria = example.createCriteria();
        criteria.andCidEqualTo(cid);
        return cookMakeMethodService.selectByExample(example);

    }
}
