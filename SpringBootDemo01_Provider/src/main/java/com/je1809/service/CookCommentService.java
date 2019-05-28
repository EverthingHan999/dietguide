package com.je1809.service;

import com.je1809.pojo.CookComment;
import com.je1809.pojo.CookCommentExample;

import java.util.List;

public interface CookCommentService {

    int countByExample(CookCommentExample example);

    int deleteByExample(CookCommentExample example);

    int deleteByPrimaryKey(Integer ckcid);

    int insert(CookComment record);

    int insertSelective(CookComment record);

    List<CookComment> selectByExample(CookCommentExample example);

    CookComment selectByPrimaryKey(Integer ckcid);

    int updateByExampleSelective(CookComment record, CookCommentExample example);

    int updateByExample(CookComment record, CookCommentExample example);

    int updateByPrimaryKeySelective(CookComment record);

    int updateByPrimaryKey(CookComment record);

}
