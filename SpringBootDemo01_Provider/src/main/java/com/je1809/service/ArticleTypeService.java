package com.je1809.service;

import com.je1809.pojo.ArticleType;
import com.je1809.pojo.ArticleTypeExample;

import java.util.List;

public interface ArticleTypeService {

    int countByExample(ArticleTypeExample example);

    int deleteByExample(ArticleTypeExample example);

    int deleteByPrimaryKey(Integer atid);

    int insert(ArticleType record);

    int insertSelective(ArticleType record);

    List<ArticleType> selectByExample(ArticleTypeExample example);

    ArticleType selectByPrimaryKey(Integer atid);

    int updateByExampleSelective(ArticleType record, ArticleTypeExample example);

    int updateByExample(ArticleType record, ArticleTypeExample example);

    int updateByPrimaryKeySelective(ArticleType record);

    int updateByPrimaryKey(ArticleType record);

}
