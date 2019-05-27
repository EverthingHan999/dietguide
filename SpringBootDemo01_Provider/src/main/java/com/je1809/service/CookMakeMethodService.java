package com.je1809.service;

import com.je1809.pojo.CookMakeMethod;
import com.je1809.pojo.CookMakeMethodExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CookMakeMethodService {

    int countByExample(CookMakeMethodExample example);

    int deleteByExample(CookMakeMethodExample example);

    int deleteByPrimaryKey(Integer cmmid);

    int insert(CookMakeMethod record);

    int insertSelective(CookMakeMethod record);

    List<CookMakeMethod> selectByExample(CookMakeMethodExample example);

    CookMakeMethod selectByPrimaryKey(Integer cmmid);

    int updateByExampleSelective(@Param("record") CookMakeMethod record, @Param("example") CookMakeMethodExample example);

    int updateByExample(@Param("record") CookMakeMethod record, @Param("example") CookMakeMethodExample example);

    int updateByPrimaryKeySelective(CookMakeMethod record);

    int updateByPrimaryKey(CookMakeMethod record);
}
