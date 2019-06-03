package com.je1809.controller;

import com.je1809.pojo.Article;
import com.je1809.pojo.ArticleDescr;
import com.je1809.pojo.ArticleType;
import com.je1809.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.*;

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

    @PostMapping("/consumer/articlesAllOrderByLookcount")
    @ResponseBody
    public List<Article> articlesAllOrderByLookcount(){
        return restTemplate.getForObject(REST_URL_PREFIX + "/provider/redisArticlesAllOrderByLookcount",List.class);
    }

    @PostMapping("/articleImgUpLoad")
    @ResponseBody
    public synchronized Map<String, Object> articleImgUpLoad(HttpServletRequest request, HttpServletResponse response) throws IOException {
        MultipartHttpServletRequest mr = (MultipartHttpServletRequest) request;
        Map<String, Object> map = new HashMap<>();
        Iterator<String> iterator = mr.getFileNames();
        while (iterator.hasNext()) {
            MultipartFile multipartFile = mr.getFile(iterator.next());
            // 原文件名
            String oldFileName = multipartFile.getOriginalFilename();

            // 文件后缀
            String suffix = oldFileName.substring(oldFileName.lastIndexOf("."));

            String sj = UUID.randomUUID().toString();
            String replace = sj.replace("-", "");
            String newFileName = replace + suffix;
            String forObject = restTemplate.getForObject(REST_URL_PREFIX + "/provider/getRealPath", String.class);
            //D:\AAA\stsTest\SpringBootDemo01\SpringBootDemo01_Consume\src\main\resources\static\article\img
            forObject = forObject.substring(0,forObject.lastIndexOf("SpringBootDemo01_Provider"))+"SpringBootDemo01_Consume\\src\\main\\resources\\static\\article\\img\\";

            String realPath = forObject + newFileName;

            System.out.println(realPath);

            File file = new File(realPath);

            String loadPath = "http://localhost/static/article/img/"+newFileName;

            multipartFile.transferTo(file);

            map.put("oldFileName", oldFileName);
            map.put("newFileName", newFileName);

            map.put("path", loadPath);
        }
        return map;
    }

    @PostMapping("/addArticle")
    @ResponseBody
    public boolean addArticle(HttpServletRequest request){
        String atid = request.getParameter("atid");
        String title = request.getParameter("title");
        String descr = request.getParameter("descr");
        Users user = (Users) request.getSession().getAttribute("user");
        String uid = user.getUid().toString();

        LinkedMultiValueMap<String, String> map = new LinkedMultiValueMap<>();

        map.add("atid",atid);
        map.add("title",title);
        map.add("descr",descr);
        map.add("uid",uid);

        return restTemplate.postForObject(REST_URL_PREFIX + "/provider/addArticle",map,boolean.class);
    }

    @PostMapping("/consumer/articlesByAtid")
    @ResponseBody
    public List<Article> articlesByAtid(HttpServletRequest request){
        int atid = Integer.parseInt(request.getParameter("atid"));

        return restTemplate.getForObject(REST_URL_PREFIX + "/provider/articlesByAtid/"+atid,List.class);
    }

    @PostMapping("/consumer/articleTypeByAtid")
    @ResponseBody
    public ArticleType articleTypeByAtid(HttpServletRequest request){
        int atid = Integer.parseInt(request.getParameter("atid"));

        return restTemplate.getForObject(REST_URL_PREFIX + "/provider/articleTypeByAtid/"+atid,ArticleType.class);
    }

    @PostMapping("/consumer/articlesByAtidByPage")
    @ResponseBody
    public List<Article> articlesByAtidByPage(HttpServletRequest request){
        int atid = Integer.parseInt(request.getParameter("atid"));
        int page = Integer.parseInt(request.getParameter("page"));
        int limit = Integer.parseInt(request.getParameter("limit"));

        LinkedMultiValueMap<String, Integer> map = new LinkedMultiValueMap<>();
        map.add("atid",atid);
        map.add("page",page);
        map.add("limit",limit);

        return restTemplate.postForObject(REST_URL_PREFIX + "/provider/articlesByAtidByPage",map,List.class);
    }

    @PostMapping("/consumer/searchByKeyWord")
    @ResponseBody
    public Map<String,List> searchByKeyWord(HttpServletRequest request){
        String keywords = request.getParameter("keywords");
        String page = request.getParameter("page");
        String limit = request.getParameter("limit");

        LinkedMultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.add("keywords",keywords);
        map.add("page",page);
        map.add("limit",limit);

        return restTemplate.postForObject(REST_URL_PREFIX + "/provider/searchByKeyWord", map, Map.class);
    }

}
