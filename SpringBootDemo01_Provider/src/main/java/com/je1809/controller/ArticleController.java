package com.je1809.controller;

import com.alibaba.fastjson.JSON;
import com.je1809.pojo.*;
import com.je1809.service.ArticleDescrService;
import com.je1809.service.ArticleService;
import com.je1809.service.ArticleTypeService;
import com.je1809.service.CookService;
import com.je1809.util.MsgResult;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Controller
public class ArticleController {

    @Autowired
    private ArticleTypeService articleTypeService;
    @Autowired
    private ArticleService articleService;
    @Autowired
    private ArticleDescrService articleDescrService;
    @Autowired
    private RedisTemplate<String,String> redisTemplate;
    @Autowired
    private CookService cookService;

    @ResponseBody
    @GetMapping("/provider/redisArticleTypesAll")
    public List<ArticleType> redisArticleTypesAll(){
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

    @ResponseBody
    @GetMapping("/provider/redisArticlesAllOrderByLookcount")
    public List<Article> redisArticlesAllOrderByLookcount(){
        String cookbook = redisTemplate.opsForValue().get("articlesAllOrderByLookcount");
        if( cookbook != null){
            List<Article> list = (List<Article>) JSON.parse(cookbook);
            return list;
        }else {
            ArticleExample articleExample = new ArticleExample();
            articleExample.setOrderByClause("lookcount desc");
            List<Article> articles = articleService.selectByExample(articleExample);

            String s = JSON.toJSONString(articles);
            redisTemplate.opsForValue().set("articlesAllOrderByLookcount",s);
            redisTemplate.expire("articlesAllOrderByLookcount",11000, TimeUnit.MILLISECONDS);
            return articles;
        }
    }

    @ResponseBody
    @GetMapping("/provider/articleByAid/{aid}")
    public Article redisArticleByAid(@PathVariable int aid){
        Article article = articleService.selectByPrimaryKeyConnect(aid);
        article.setLookcount(article.getLookcount()+1);
        articleService.updateByPrimaryKey(article);
        return articleService.selectByPrimaryKeyConnect(aid);
    }

    @ResponseBody
    @GetMapping("/provider/articleDescrsByAid/{aid}")
    public List<ArticleDescr> articleDescrsByAid(@PathVariable int aid){

        ArticleDescrExample articleDescrExample = new ArticleDescrExample();
        ArticleDescrExample.Criteria criteria = articleDescrExample.createCriteria();
        criteria.andAidEqualTo(aid);
        articleDescrExample.setOrderByClause("count");

        return articleDescrService.selectByExample(articleDescrExample);
    }

    @GetMapping("/provider/getRealPath")
    @ResponseBody
    public String getRealPath(HttpServletRequest request){

        String realPath = request.getServletContext().getRealPath("");
        return  realPath;
    }

    @PostMapping("/provider/addArticle")
    @ResponseBody
    public boolean addArticle(HttpServletRequest request){
        int atid = Integer.parseInt(request.getParameter("atid"));
        String title = request.getParameter("title");
        String descr = request.getParameter("descr");

        Article article = new Article();

        article.setAtid(atid);
        article.setUid(1);
        article.setAname(title);
        if (descr.contains("<img")){
            String substring = descr.substring(descr.indexOf("src=")+5, descr.indexOf(".jpg")+4);
            System.out.println(substring);
            article.setAimg(substring);
        }
        Date date = new Date();
        article.setCreateTime(date);
        article.setLookcount(0);
        article.setRemarks(descr);
        boolean b = articleService.insert(article) > 0;
        if (b){
            articleService.dataFromDB2Solr();
        }
        return b;
    }

    @GetMapping("/provider/articleTypeByAtid/{atid}")
    @ResponseBody
    public ArticleType articleTypeByAtid(@PathVariable int atid){
        return articleTypeService.selectByPrimaryKey(atid);
    }

    @GetMapping("/provider/articlesByAtid/{atid}")
    @ResponseBody
    public List<Article> articlesByAtid(@PathVariable int atid){
        return articleService.selectByAtid(atid);
    }

    @PostMapping("/provider/articlesByAtidByPage")
    @ResponseBody
    public List<Article> articlesByAtidByPage(HttpServletRequest request){
        int atid = Integer.parseInt(request.getParameter("atid"));
        int page = Integer.parseInt(request.getParameter("page"));
        int limit = Integer.parseInt(request.getParameter("limit"));

        return articleService.selectByAtidByPage(atid,page,limit);
    }

    @GetMapping("/provider/articlesInput")
    @ResponseBody
    public MsgResult articlesInput(){
        return articleService.dataFromDB2Solr();
    };

    @GetMapping("/provider/cooksInput")
    @ResponseBody
    public MsgResult cooksInput(){
        return cookService.dataFromDB2Solr();
    };

    @PostMapping("/provider/searchByKeyWord")
    @ResponseBody
    public Map<String, List> searchByKeyWord(HttpServletRequest request){
        String keywords = request.getParameter("keywords");
        int page = Integer.parseInt(request.getParameter("page"));
        int limit = Integer.parseInt(request.getParameter("limit"));
        Map<String, List> map = articleService.searchByKeyWord(keywords, page, limit);
        return map;
    };

}
