package com.je1809.service;

import com.je1809.pojo.Article;
import com.je1809.pojo.ArticleExample;
import com.je1809.util.DataGridUtils;
import com.je1809.util.MsgResult;
import org.apache.solr.common.SolrDocumentList;

import java.util.List;
import java.util.Map;

public interface ArticleService {
    int countByExample(ArticleExample example);

    int deleteByExample(ArticleExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(Article record);

    int insertSelective(Article record);

    List<Article> selectByExample(ArticleExample example);

    List<Article> selectByAtid(Integer atid);

    List<Article> selectByAtidByPage(Integer atid,Integer page,Integer limit);

    Article selectByPrimaryKey(Integer aid);

    Article selectByPrimaryKeyConnect(Integer aid);

    int updateByExampleSelective(Article record, ArticleExample example);

    int updateByExample(Article record, ArticleExample example);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);

    MsgResult dataFromDB2Solr();

    Map<String, List> searchByKeyWord(String keyword, int pageNum, int pageSize);
}
