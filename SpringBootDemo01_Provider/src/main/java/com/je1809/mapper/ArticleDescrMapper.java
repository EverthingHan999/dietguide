package com.je1809.mapper;

import com.je1809.pojo.ArticleDescr;
import com.je1809.pojo.ArticleDescrExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ArticleDescrMapper {
    int countByExample(ArticleDescrExample example);

    int deleteByExample(ArticleDescrExample example);

    int deleteByPrimaryKey(Integer adid);

    int insert(ArticleDescr record);

    int insertSelective(ArticleDescr record);

    List<ArticleDescr> selectByExample(ArticleDescrExample example);

    List<ArticleDescr> selectByAid(Integer aid);

    ArticleDescr selectByPrimaryKey(Integer adid);

    int updateByExampleSelective(@Param("record") ArticleDescr record, @Param("example") ArticleDescrExample example);

    int updateByExample(@Param("record") ArticleDescr record, @Param("example") ArticleDescrExample example);

    int updateByPrimaryKeySelective(ArticleDescr record);

    int updateByPrimaryKey(ArticleDescr record);
}