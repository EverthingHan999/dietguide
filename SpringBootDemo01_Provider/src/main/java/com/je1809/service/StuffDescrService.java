package com.je1809.service;

import com.je1809.pojo.StuffDescr;
import com.je1809.pojo.StuffDescrExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StuffDescrService {
    int countByExample(StuffDescrExample example);

    int deleteByExample(StuffDescrExample example);

    int deleteByPrimaryKey(Integer sdid);

    int insert(StuffDescr record);

    int insertSelective(StuffDescr record);

    List<StuffDescr> selectByExample(StuffDescrExample example);

    StuffDescr selectByPrimaryKey(Integer sdid);

    int updateByExampleSelective(@Param("record") StuffDescr record, @Param("example") StuffDescrExample example);

    int updateByExample(@Param("record") StuffDescr record, @Param("example") StuffDescrExample example);

    int updateByPrimaryKeySelective(StuffDescr record);

    int updateByPrimaryKey(StuffDescr record);
}
