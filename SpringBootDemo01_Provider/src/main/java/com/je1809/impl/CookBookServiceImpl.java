package com.je1809.impl;

import com.je1809.mapper.CookbookMapper;
import com.je1809.pojo.Cookbook;
import com.je1809.pojo.CookbookExample;
import com.je1809.service.CookBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CookBookServiceImpl implements CookBookService {
    @Resource
    private CookbookMapper cookBookMapper;
    @Override
    public int countByExample(CookbookExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(CookbookExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer cbid) {
        return 0;
    }

    @Override
    public int insert(Cookbook record) {
        return 0;
    }

    @Override
    public int insertSelective(Cookbook record) {
        return 0;
    }

    @Override
    public List<Cookbook> selectByExample(CookbookExample example) {
        return cookBookMapper.selectByExample(example);
    }

    @Override
    public Cookbook selectByPrimaryKey(Integer cbid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Cookbook record, CookbookExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Cookbook record, CookbookExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Cookbook record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Cookbook record) {
        return 0;
    }
}
