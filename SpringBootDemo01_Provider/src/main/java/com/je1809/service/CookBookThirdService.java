package com.je1809.service;

import com.je1809.pojo.CookbookThird;
import com.je1809.pojo.CookbookThirdExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CookBookThirdService {

    int countByExample(CookbookThirdExample example);

    int deleteByExample(CookbookThirdExample example);

    int deleteByPrimaryKey(Integer cbtid);

    int insert(CookbookThird record);

    int insertSelective(CookbookThird record);

    List<CookbookThird> selectByExample(CookbookThirdExample example);

    CookbookThird selectByPrimaryKey(Integer cbtid);

    int updateByExampleSelective(@Param("record") CookbookThird record, @Param("example") CookbookThirdExample example);

    int updateByExample(@Param("record") CookbookThird record, @Param("example") CookbookThirdExample example);

    int updateByPrimaryKeySelective(CookbookThird record);

    int updateByPrimaryKey(CookbookThird record);
}
