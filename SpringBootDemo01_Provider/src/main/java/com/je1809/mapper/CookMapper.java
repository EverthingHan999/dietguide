package com.je1809.mapper;

import com.je1809.pojo.Cook;
import com.je1809.pojo.CookExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface CookMapper {
    int countByExample(CookExample example);

    int deleteByExample(CookExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Cook record);

    int insertSelective(Cook record);

    List<Cook> selectByExample(CookExample example);

    Cook selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Cook record, @Param("example") CookExample example);

    int updateByExample(@Param("record") Cook record, @Param("example") CookExample example);

    int updateByPrimaryKeySelective(Cook record);

    int updateByPrimaryKey(Cook record);

    List<Cook> cook3();
}