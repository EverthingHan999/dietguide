package com.je1809.controller;

import com.je1809.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

@Controller
public class UsersController {

    private static final String REST_URL_PREFIX = "http://SpringBootDemo01-Provider";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/Users")
    @ResponseBody
    public List<Users> getAllUsers(){
        return restTemplate.getForObject(REST_URL_PREFIX + "/provider/redisUser",List.class);
    }

    @GetMapping("/consumer/hello")
    public String index(){
        return "index";
    }

    @ResponseBody
    @PostMapping("/consumer/login")
    public int userLogin(String username, String password, HttpSession session){
        HashMap<String, String> map = new HashMap<>();
        map.put("username",username);
        map.put("password",password);
        Users user = restTemplate.getForObject(REST_URL_PREFIX + "/provider/getUserByUser?username={username}&password={password}", Users.class, map);
        if (user != null){
            session.setAttribute("user",user);
            return 1;
        }else {
            return 0;
        }
    }

    @ResponseBody
    @GetMapping("/consumer/logout")
    public int userLogout(HttpSession session){
        session.setAttribute("user",null);
        return 1;
    }

    @ResponseBody
    @GetMapping("/consumer/getIndexInfo")
    public Users getIndexInfo(HttpServletRequest request){
        String uname = request.getParameter("uname");
        HashMap<String, String> map = new HashMap<>();
        map.put("uname",uname);
        Users user = restTemplate.getForObject(REST_URL_PREFIX + "/provider/getIndexInfo?uname={uname}", Users.class, map);
        if (user != null){
            return user;
        }else {
            return null;
        }
    }

    @ResponseBody
    @PostMapping("/consumer/getUserInfo")
    public Users getUserInfo(HttpSession session){
        Users user = (Users)session.getAttribute("user");
        if (user != null){
            return user;
        }else {
            return null;
        }
    }

}
