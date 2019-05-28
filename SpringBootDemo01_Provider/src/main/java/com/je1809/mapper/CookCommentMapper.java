package com.je1809.mapper;

import com.je1809.pojo.CookComment;
import com.je1809.pojo.CookCommentExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface CookCommentMapper {
    int countByExample(CookCommentExample example);

    int deleteByExample(CookCommentExample example);

    int deleteByPrimaryKey(Integer ckcid);

    int insert(CookComment record);

    int insertSelective(CookComment record);

    List<CookComment> selectByExample(CookCommentExample example);

    CookComment selectByPrimaryKey(Integer ckcid);

    int updateByExampleSelective(@Param("record") CookComment record, @Param("example") CookCommentExample example);

    int updateByExample(@Param("record") CookComment record, @Param("example") CookCommentExample example);

    int updateByPrimaryKeySelective(CookComment record);

    int updateByPrimaryKey(CookComment record);
}