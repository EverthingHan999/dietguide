package com.je1809.mapper;

import com.je1809.pojo.Cookbook;
import com.je1809.pojo.CookbookExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface CookbookMapper {
    int countByExample(CookbookExample example);

    int deleteByExample(CookbookExample example);

    int deleteByPrimaryKey(Integer cbid);

    int insert(Cookbook record);

    int insertSelective(Cookbook record);

    List<Cookbook> selectByExample(CookbookExample example);

    Cookbook selectByPrimaryKey(Integer cbid);

    int updateByExampleSelective(@Param("record") Cookbook record, @Param("example") CookbookExample example);

    int updateByExample(@Param("record") Cookbook record, @Param("example") CookbookExample example);

    int updateByPrimaryKeySelective(Cookbook record);

    int updateByPrimaryKey(Cookbook record);

    List<Cookbook> cookboot3();
}