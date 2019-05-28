package com.je1809.service;

import com.je1809.pojo.CookCopy;
import com.je1809.pojo.CookCopyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CookCopyService {

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
