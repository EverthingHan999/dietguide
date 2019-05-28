package com.je1809.service;


import com.je1809.pojo.MyAttention;
import com.je1809.pojo.MyAttentionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MyAttentionService {
    int countByExample(MyAttentionExample example);

    int deleteByExample(MyAttentionExample example);

    int deleteByPrimaryKey(Integer maid);

    int insert(MyAttention record);

    int insertSelective(MyAttention record);

    List<MyAttention> selectByExample(MyAttentionExample example);

    MyAttention selectByPrimaryKey(Integer maid);

    int updateByExampleSelective(@Param("record") MyAttention record, @Param("example") MyAttentionExample example);

    int updateByExample(@Param("record") MyAttention record, @Param("example") MyAttentionExample example);

    int updateByPrimaryKeySelective(MyAttention record);

    int updateByPrimaryKey(MyAttention record);
}
