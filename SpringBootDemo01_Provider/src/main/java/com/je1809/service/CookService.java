package com.je1809.service;

import com.je1809.pojo.Cook;
import com.je1809.pojo.CookExample;
import com.je1809.util.MsgResult;

import java.util.List;

public interface CookService {

    int countByExample(CookExample example);

    int deleteByExample(CookExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Cook record);

    int insertSelective(Cook record);

    List<Cook> selectByExample(CookExample example);

    Cook selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(Cook record, CookExample example);

    int updateByExample(Cook record,CookExample example);

    int updateByPrimaryKeySelective(Cook record);

    int updateByPrimaryKey(Cook record);

    List<Cook> cook3();

    MsgResult dataFromDB2Solr();
}
