package com.je1809.service;

import com.je1809.pojo.MenuCook;
import com.je1809.pojo.MenuCookExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuCookService {
    int countByExample(MenuCookExample example);

    int deleteByExample(MenuCookExample example);

    int deleteByPrimaryKey(Integer mcid);

    int insert(MenuCook record);

    int insertSelective(MenuCook record);

    List<MenuCook> selectByExample(MenuCookExample example);

    MenuCook selectByPrimaryKey(Integer mcid);

    int updateByExampleSelective(@Param("record") MenuCook record, @Param("example") MenuCookExample example);

    int updateByExample(@Param("record") MenuCook record, @Param("example") MenuCookExample example);

    int updateByPrimaryKeySelective(MenuCook record);

    int updateByPrimaryKey(MenuCook record);

    List<MenuCook> getMenu(Integer mid);
}
