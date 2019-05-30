package com.je1809.impl;

import com.je1809.mapper.CookMapper;
import com.je1809.pojo.Cook;
import com.je1809.pojo.CookExample;
import com.je1809.service.CookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CookServiceImpl implements CookService {

    @Resource
    private CookMapper cookMapper;

    @Override
    public int countByExample(CookExample example) {
        return cookMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(CookExample example) {
        return cookMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer cid) {
        return cookMapper.deleteByPrimaryKey(cid);
    }

    @Override
    public int insert(Cook record) {
        return cookMapper.insert(record);
    }

    @Override
    public int insertSelective(Cook record) {
        return cookMapper.insertSelective(record);
    }

    @Override
    public List<Cook> selectByExample(CookExample example) {
        return cookMapper.selectByExample(example);
    }

    @Override
    public Cook selectByPrimaryKey(Integer cid) {
        return cookMapper.selectByPrimaryKey(cid);
    }

    @Override
    public int updateByExampleSelective(Cook record, CookExample example) {
        return cookMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Cook record, CookExample example) {
        return cookMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Cook record) {
        return cookMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Cook record) {
        return cookMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Cook> cook3() {
        return cookMapper.cook3();
    }
}
