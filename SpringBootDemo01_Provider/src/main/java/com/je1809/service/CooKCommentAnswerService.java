package com.je1809.service;

import com.je1809.pojo.CookCommentAnswer;
import com.je1809.pojo.CookCommentAnswerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CooKCommentAnswerService {

    int countByExample(CookCommentAnswerExample example);

    int deleteByExample(CookCommentAnswerExample example);

    int deleteByPrimaryKey(Integer ckcaid);

    int insert(CookCommentAnswer record);

    int insertSelective(CookCommentAnswer record);

    List<CookCommentAnswer> selectByExample(CookCommentAnswerExample example);

    CookCommentAnswer selectByPrimaryKey(Integer ckcaid);

    int updateByExampleSelective(@Param("record") CookCommentAnswer record, @Param("example") CookCommentAnswerExample example);

    int updateByExample(@Param("record") CookCommentAnswer record, @Param("example") CookCommentAnswerExample example);

    int updateByPrimaryKeySelective(CookCommentAnswer record);

    int updateByPrimaryKey(CookCommentAnswer record);
}
