package com.je1809.service;

import com.je1809.pojo.MyConllection;
import com.je1809.pojo.MyConllectionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MyConllectionService {
    int countByExample(MyConllectionExample example);

    int deleteByExample(MyConllectionExample example);

    int deleteByPrimaryKey(Integer ucid);

    int insert(MyConllection record);

    int insertSelective(MyConllection record);

    List<MyConllection> selectByExample(MyConllectionExample example);

    MyConllection selectByPrimaryKey(Integer ucid);

    int updateByExampleSelective(@Param("record") MyConllection record, @Param("example") MyConllectionExample example);

    int updateByExample(@Param("record") MyConllection record, @Param("example") MyConllectionExample example);

    int updateByPrimaryKeySelective(MyConllection record);

    int updateByPrimaryKey(MyConllection record);
}
