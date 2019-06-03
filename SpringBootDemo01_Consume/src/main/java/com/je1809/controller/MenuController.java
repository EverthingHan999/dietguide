package com.je1809.controller;

import com.je1809.pojo.Menu;
import com.je1809.pojo.MenuCook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MenuController {
    private static final String REST_URL_PREFIX = "http://SpringBootDemo01-Provider";

    @Resource
    private RestTemplate restTemplate;
    //通过mtid获取所有的菜单
    @ResponseBody
    @GetMapping("/consumer/getMenusBymtid")
    public List<Menu> getMenusBymtid(){
        return  restTemplate.getForObject(REST_URL_PREFIX+"/provider/getMenusBymtid",List.class);
    }
    //获取所有的菜单
    @ResponseBody
    @GetMapping("/consumer/getAllMenus")
    public List<Menu> getAllMenus(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/provider/getAllMenus",List.class);
    }

    //获取所有的菜单
    @ResponseBody
    @GetMapping("/consumer/getAllMenus2")
    public List<Menu> getAllMenus2(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/provider/getAllMenus2",List.class);
    }

    //获取所有的菜单数
    @ResponseBody
    @GetMapping("/consumer/getRecordNumbers")
    public int getRecordNumbers(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/provider/getRecordNumbers",Integer.class);
    }
    //获取热门的菜单，根据浏览量来判断
    @ResponseBody
    @GetMapping("/consumer/getHotMenus")
    public List<Menu> getHotMenus(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/provider/getHotMenus",List.class);
    }

    //获取某一菜单种类的menus

    @ResponseBody
    @GetMapping("/consumer/getSingleMenu")
    public  List<Menu> getSingleMenu(@RequestParam("mtid") String mtid){
        return restTemplate.getForObject(REST_URL_PREFIX+"/provider/getSingleMenu?mtid="+mtid,List.class);
    }

    //获取某一菜单下的详情
    @ResponseBody
    @GetMapping("/consumer/getChaoCaiMenu")
    public Menu getChaoCaiMenu(@RequestParam("mid") String mid){

        return restTemplate.getForObject(REST_URL_PREFIX+"/provider/getChaoCaiMenu?mid="+mid,Menu .class);
    }

    //获取某一菜单下的所有菜品
    @ResponseBody
    @GetMapping("/consumer/getCooksByMid")
    public List<MenuCook> getCooksByMid(@RequestParam("mid") String mid){
        return restTemplate.getForObject(REST_URL_PREFIX+"/provider/getCooksByMid?mid="+mid,List.class);
    }

    //分页
    @ResponseBody
    @GetMapping("/consumer/getMenusByFenye")
    public List<Menu> getMenusByFenye(@RequestParam("limit") String limit,@RequestParam("curpage") String curpage){
        System.out.println(limit+"+++++++++++++++++++++"+curpage);
        return restTemplate.getForObject(REST_URL_PREFIX+"/provider/getMenusByFenye?curpage="+curpage+"&limit="+limit,List.class);
    }

}
