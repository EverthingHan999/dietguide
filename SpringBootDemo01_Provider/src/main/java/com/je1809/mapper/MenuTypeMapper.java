package com.je1809.mapper;

import com.je1809.pojo.MenuType;
import com.je1809.pojo.MenuTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuTypeMapper {
    int countByExample(MenuTypeExample example);

    int deleteByExample(MenuTypeExample example);

    int deleteByPrimaryKey(Integer mtid);

    int insert(MenuType record);

    int insertSelective(MenuType record);

    List<MenuType> selectByExample(MenuTypeExample example);

    MenuType selectByPrimaryKey(Integer mtid);

    int updateByExampleSelective(@Param("record") MenuType record, @Param("example") MenuTypeExample example);

    int updateByExample(@Param("record") MenuType record, @Param("example") MenuTypeExample example);

    int updateByPrimaryKeySelective(MenuType record);

    int updateByPrimaryKey(MenuType record);
}