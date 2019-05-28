package com.je1809.service;

import com.je1809.pojo.MenuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuService {
    int countByExample(MenuExample example);

    int deleteByExample(MenuExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(com.je1809.pojo.Menu record);

    int insertSelective(com.je1809.pojo.Menu record);

    List<com.je1809.pojo.Menu> selectByExample(MenuExample example);

    com.je1809.pojo.Menu selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") com.je1809.pojo.Menu record, @Param("example") MenuExample example);

    int updateByExample(@Param("record") com.je1809.pojo.Menu record, @Param("example") MenuExample example);

    int updateByPrimaryKeySelective(com.je1809.pojo.Menu record);

    int updateByPrimaryKey(com.je1809.pojo.Menu record);
}
