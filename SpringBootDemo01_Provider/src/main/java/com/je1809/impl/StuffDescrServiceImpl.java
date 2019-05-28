package com.je1809.impl;

import com.je1809.mapper.StuffDescrMapper;
import com.je1809.pojo.StuffDescr;
import com.je1809.pojo.StuffDescrExample;
import com.je1809.service.StuffDescrService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StuffDescrServiceImpl implements StuffDescrService {
    @Resource
    private StuffDescrMapper stuffDescrMapper;

    @Override
    public int countByExample(StuffDescrExample example) {
        return stuffDescrMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(StuffDescrExample example) {
        return stuffDescrMapper.deleteByExample (example);
    }

    @Override
    public int deleteByPrimaryKey(Integer sdid) {
        return stuffDescrMapper.deleteByPrimaryKey (sdid);
    }

    @Override
    public int insert(StuffDescr record) {
        return stuffDescrMapper.insert (record);
    }

    @Override
    public int insertSelective(StuffDescr record) {
        return stuffDescrMapper.insertSelective (record);
    }

    @Override
    public List<StuffDescr> selectByExample(StuffDescrExample example) {
        return stuffDescrMapper.selectByExample (example);
    }

    @Override
    public StuffDescr selectByPrimaryKey(Integer sdid) {
        return stuffDescrMapper.selectByPrimaryKey (sdid);
    }

    @Override
    public int updateByExampleSelective(StuffDescr record, StuffDescrExample example) {
        return stuffDescrMapper.updateByExampleSelective (record , example);
    }

    @Override
    public int updateByExample(StuffDescr record, StuffDescrExample example) {
        return stuffDescrMapper.updateByExample (record , example);
    }

    @Override
    public int updateByPrimaryKeySelective(StuffDescr record) {
        return stuffDescrMapper.updateByPrimaryKeySelective (record);
    }

    @Override
    public int updateByPrimaryKey(StuffDescr record) {
        return stuffDescrMapper.updateByPrimaryKey (record);
    }
}
