package com.je1809.service;

import com.je1809.pojo.CookbootSecond;
import com.je1809.pojo.CookbootSecondExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CookBookSecondService {
    int countByExample(CookbootSecondExample example);

    int deleteByExample(CookbootSecondExample example);

    int deleteByPrimaryKey(Integer cbsid);

    int insert(CookbootSecond record);

    int insertSelective(CookbootSecond record);

    List<CookbootSecond> selectByExample(CookbootSecondExample example);

    CookbootSecond selectByPrimaryKey(Integer cbsid);

    int updateByExampleSelective(@Param("record") CookbootSecond record, @Param("example") CookbootSecondExample example);

    int updateByExample(@Param("record") CookbootSecond record, @Param("example") CookbootSecondExample example);

    int updateByPrimaryKeySelective(CookbootSecond record);

    int updateByPrimaryKey(CookbootSecond record);

    List<CookbootSecond> cooksencondthird();
}
