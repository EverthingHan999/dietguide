package com.je1809.mapper;

import com.je1809.pojo.CookCopy;
import com.je1809.pojo.CookCopyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CookCopyMapper {
    int countByExample(CookCopyExample example);

    int deleteByExample(CookCopyExample example);

    int deleteByPrimaryKey(Integer ccid);

    int insert(CookCopy record);

    int insertSelective(CookCopy record);

    List<CookCopy> selectByExample(CookCopyExample example);

    CookCopy selectByPrimaryKey(Integer ccid);

    int updateByExampleSelective(@Param("record") CookCopy record, @Param("example") CookCopyExample example);

    int updateByExample(@Param("record") CookCopy record, @Param("example") CookCopyExample example);

    int updateByPrimaryKeySelective(CookCopy record);

    int updateByPrimaryKey(CookCopy record);
}