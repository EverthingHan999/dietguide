package com.je1809.mapper;

import com.je1809.pojo.CookSeasoning;
import com.je1809.pojo.CookSeasoningExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface CookSeasoningMapper {
    int countByExample(CookSeasoningExample example);

    int deleteByExample(CookSeasoningExample example);

    int deleteByPrimaryKey(Integer ckseid);

    int insert(CookSeasoning record);

    int insertSelective(CookSeasoning record);

    List<CookSeasoning> selectByExample(CookSeasoningExample example);

    CookSeasoning selectByPrimaryKey(Integer ckseid);

    int updateByExampleSelective(@Param("record") CookSeasoning record, @Param("example") CookSeasoningExample example);

    int updateByExample(@Param("record") CookSeasoning record, @Param("example") CookSeasoningExample example);

    int updateByPrimaryKeySelective(CookSeasoning record);

    int updateByPrimaryKey(CookSeasoning record);
}