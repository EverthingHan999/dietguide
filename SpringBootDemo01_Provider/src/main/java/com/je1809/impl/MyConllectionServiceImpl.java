package com.je1809.impl;

import com.je1809.mapper.MyConllectionMapper;
import com.je1809.pojo.MyConllection;
import com.je1809.pojo.MyConllectionExample;
import com.je1809.service.MyConllectionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MyConllectionServiceImpl implements MyConllectionService {
    @Resource
    private MyConllectionMapper myConllectionMapper;


    @Override
    public int countByExample(MyConllectionExample example) {
        return myConllectionMapper.countByExample (example);
    }

    @Override
    public int deleteByExample(MyConllectionExample example) {
        return myConllectionMapper.deleteByExample (example);
    }

    @Override
    public int deleteByPrimaryKey(Integer ucid) {
        return myConllectionMapper.deleteByPrimaryKey (ucid);
    }

    @Override
    public int insert(MyConllection record) {
        return myConllectionMapper.insert (record);
    }

    @Override
    public int insertSelective(MyConllection record) {
        return myConllectionMapper.insertSelective (record);
    }

    @Override
    public List<MyConllection> selectByExample(MyConllectionExample example) {
        return myConllectionMapper.selectByExample (example);
    }

    @Override
    public MyConllection selectByPrimaryKey(Integer ucid) {
        return myConllectionMapper.selectByPrimaryKey (ucid);
    }

    @Override
    public int updateByExampleSelective(MyConllection record, MyConllectionExample example) {
        return myConllectionMapper.updateByExampleSelective (record , example);
    }

    @Override
    public int updateByExample(MyConllection record, MyConllectionExample example) {
        return myConllectionMapper.updateByExample (record , example);
    }

    @Override
    public int updateByPrimaryKeySelective(MyConllection record) {
        return myConllectionMapper.updateByPrimaryKeySelective (record);
    }

    @Override
    public int updateByPrimaryKey(MyConllection record) {
        return myConllectionMapper.updateByPrimaryKey (record);
    }
}
