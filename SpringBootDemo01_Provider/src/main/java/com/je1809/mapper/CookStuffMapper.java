package com.je1809.mapper;

import com.je1809.pojo.CookStuff;
import com.je1809.pojo.CookStuffExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface CookStuffMapper {
    int countByExample(CookStuffExample example);

    int deleteByExample(CookStuffExample example);

    int deleteByPrimaryKey(Integer cstid);

    int insert(CookStuff record);

    int insertSelective(CookStuff record);

    List<CookStuff> selectByExample(CookStuffExample example);

    CookStuff selectByPrimaryKey(Integer cstid);

    int updateByExampleSelective(@Param("record") CookStuff record, @Param("example") CookStuffExample example);

    int updateByExample(@Param("record") CookStuff record, @Param("example") CookStuffExample example);

    int updateByPrimaryKeySelective(CookStuff record);

    int updateByPrimaryKey(CookStuff record);
}