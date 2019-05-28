package com.je1809.service;

import com.je1809.pojo.ArticleDescr;
import com.je1809.pojo.ArticleDescrExample;

import java.util.List;

public interface ArticleDescrService {

    int countByExample(ArticleDescrExample example);

    int deleteByExample(ArticleDescrExample example);

    int deleteByPrimaryKey(Integer adid);

    int insert(ArticleDescr record);

    int insertSelective(ArticleDescr record);

    List<ArticleDescr> selectByExample(ArticleDescrExample example);

    ArticleDescr selectByPrimaryKey(Integer adid);

    int updateByExampleSelective(ArticleDescr record, ArticleDescrExample example);

    int updateByExample(ArticleDescr record, ArticleDescrExample example);

    int updateByPrimaryKeySelective(ArticleDescr record);

    int updateByPrimaryKey(ArticleDescr record);

}
