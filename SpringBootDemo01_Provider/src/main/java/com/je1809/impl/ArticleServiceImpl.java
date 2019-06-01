package com.je1809.impl;

import com.je1809.mapper.ArticleMapper;
import com.je1809.mapper.CookMapper;
import com.je1809.pojo.Article;
import com.je1809.pojo.ArticleExample;
import com.je1809.pojo.Cook;
import com.je1809.service.ArticleService;
import com.je1809.util.DataGridUtils;
import com.je1809.util.MsgResult;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private ArticleMapper articleMapper;
    @Resource
    private CookMapper cookMapper;

    private String url = "http://10.12.159.35:8082/solr";

    @Override
    public int countByExample(ArticleExample example) {
        return articleMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ArticleExample example) {
        return articleMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer aid) {
        return articleMapper.deleteByPrimaryKey(aid);
    }

    @Override
    public int insert(Article record) {
        return articleMapper.insert(record);
    }

    @Override
    public int insertSelective(Article record) {
        return articleMapper.insert(record);
    }

    @Override
    public List<Article> selectByExample(ArticleExample example) {
        return articleMapper.selectByExample(example);
    }

    @Override
    public List<Article> selectByAtid(Integer atid) {
        return articleMapper.selectByAtid(atid);
    }

    @Override
    public List<Article> selectByAtidByPage(Integer atid, Integer page, Integer limit) {
        return articleMapper.selectByAtidByPage(atid,page,limit);
    }

    @Override
    public Article selectByPrimaryKey(Integer aid) {
        return articleMapper.selectByPrimaryKey(aid);
    }

    @Override
    public Article selectByPrimaryKeyConnect(Integer aid) {
        return articleMapper.selectByPrimaryKeyConnect(aid);
    }

    @Override
    public int updateByExampleSelective(Article record, ArticleExample example) {
        return articleMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Article record, ArticleExample example) {
        return articleMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Article record) {
        return articleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Article record) {
        return articleMapper.updateByPrimaryKey(record);
    }

    @Override
    public MsgResult dataFromDB2Solr() {
        MsgResult msg = new MsgResult();

        List<Article> articles = articleMapper.selectByExample(null);

        HttpSolrServer server = new HttpSolrServer(url);

        SolrInputDocument sidoc = null;

        try {

            for(Article s : articles){
                sidoc = new SolrInputDocument();

                sidoc.setField("id", "article_"+s.getAid());
                sidoc.setField("article_aid", s.getAid());
                sidoc.setField("article_atid", s.getAtid());
                sidoc.setField("article_uid", s.getUid());
                sidoc.setField("article_aname", s.getAname());
                sidoc.setField("article_aimg", s.getAimg());
                sidoc.setField("article_create_time", s.getCreateTime());
                sidoc.setField("article_lookcount", s.getLookcount());

                server.add(sidoc);
            }

            server.commit();

            msg.setMsg("success");
            msg.setStatus(200);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return msg;
    }

    @Override
    public Map<String, List> searchByKeyWord(String keyword, int pageNum, int pageSize) {
        SolrServer solrServer = new HttpSolrServer(url);
        // 创建一个solrQuery查询对象
        SolrQuery query = new SolrQuery();
        // 设置查询条件
        query.setQuery(keyword);
        // 设置查询的起始索引，类似于mysql的limit a,b 中的a
        query.setStart(pageNum);
        // 设置查询的条目数，类似于mysql的limit a,b 中的b
        query.setRows(pageSize);
        // 设置查询的业务域
        query.set("df", "all_keywords");
        // 设置开启高亮显示
        query.setHighlight(true);
        // 设置要高亮的列
        query.addHighlightField("cook_cname");
        query.addHighlightField("article_aname");
        // 设置高亮显示的前缀
        query.setHighlightSimplePre("<font color='blue'>");
        // 设置高亮显示的后缀
        query.setHighlightSimplePost("</font>");
        // 执行查询，得到queryResponse对象
        QueryResponse queryResponse = null;
        try {
            queryResponse = solrServer.query(query);
        } catch (SolrServerException e) {
            e.printStackTrace();
        }
        // 取文档列表（当前页文档），取查询结果总记录数
        SolrDocumentList solrDocumentList = queryResponse.getResults();
        System.out.println("查询结果总记录数：" + solrDocumentList.getNumFound());
        Map<String,List> map = new HashMap<>();
        List<Article> articleList = new ArrayList<>();
        List<Cook> cookList = new ArrayList<>();
        for (SolrDocument solrDocument:solrDocumentList) {
            String stringid = (String) solrDocument.get("id");
            //取高亮显示
            String productName = "";

            Map<String, Map<String, List<String>>> highlighting = queryResponse.getHighlighting();
            List<String> list = null;
            if (stringid.startsWith("article")){
                list = highlighting.get(stringid).get("article_aname");
                if (null != list) {
                    productName = list.get(0);
                } else {
                    productName = (String) solrDocument.get("article_aname");
                }
                int aid =Integer.parseInt(stringid.substring(8));
                Article article = articleMapper.selectByPrimaryKeyConnect(aid);
                article.setAname(productName);
                articleList.add(article);
            }else if (stringid.startsWith("cook")){
                list = highlighting.get(stringid).get("cook_cname");
                if (null != list) {
                    productName = list.get(0);
                } else {
                    productName = (String) solrDocument.get("cook_cname");
                }
                int cid = Integer.parseInt(stringid.substring(5));
                Cook cook = cookMapper.selectByPrimaryKey(cid);
                cook.setCname(productName);
                cookList.add(cook);
            }
            map.put("articleList",articleList);
            map.put("cookList",cookList);
        }

        return map;

    }
}
