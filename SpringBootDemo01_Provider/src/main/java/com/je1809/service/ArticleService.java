package com.je1809.service;

import com.je1809.pojo.Article;
import com.je1809.pojo.ArticleExample;

import java.util.List;

public interface ArticleService {
    int countByExample(ArticleExample example);

    int deleteByExample(ArticleExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(Article record);

    int insertSelective(Article record);

    List<Article> selectByExample(ArticleExample example);

    List<Article> selectByAtid(Integer atid);

    Article selectByPrimaryKey(Integer aid);

    Article selectByPrimaryKeyConnect(Integer aid);

    int updateByExampleSelective(Article record, ArticleExample example);

    int updateByExample(Article record, ArticleExample example);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);

}
