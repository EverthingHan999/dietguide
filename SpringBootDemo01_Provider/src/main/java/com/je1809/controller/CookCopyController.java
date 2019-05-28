package com.je1809.controller;

import com.je1809.pojo.CookCopy;
import com.je1809.pojo.CookCopyExample;
import com.je1809.service.CookCopyService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class CookCopyController {
    @Resource
    private CookCopyService cookCopyService;

    @Resource
    private RedisTemplate<String,String> redisTemplate;

    private static CookCopyExample example;

    static {
        example = new CookCopyExample();
    }

    //获取所有的仿作菜
    @ResponseBody
    @GetMapping("/provider/CookCopys")
    public List<CookCopy> getAllCookCopys(){
        return cookCopyService.selectByExample(null);
    }



}
