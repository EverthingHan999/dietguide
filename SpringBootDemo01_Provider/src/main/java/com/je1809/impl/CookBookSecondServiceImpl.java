package com.je1809.impl;

import com.je1809.mapper.CookbootSecondMapper;
import com.je1809.pojo.CookbootSecond;
import com.je1809.pojo.CookbootSecondExample;
import com.je1809.service.CookBookSecondService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CookBookSecondServiceImpl implements CookBookSecondService {
    @Resource
    private CookbootSecondMapper cookbootSecondMapper;
    @Override
    public int countByExample(CookbootSecondExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(CookbootSecondExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer cbsid) {
        return 0;
    }

    @Override
    public int insert(CookbootSecond record) {
        return 0;
    }

    @Override
    public int insertSelective(CookbootSecond record) {
        return 0;
    }

    @Override
    public List<CookbootSecond> selectByExample(CookbootSecondExample example) {
        return cookbootSecondMapper.selectByExample(example);
    }

    @Override
    public CookbootSecond selectByPrimaryKey(Integer cbsid) {
        return cookbootSecondMapper.selectByPrimaryKey(cbsid);
    }

    @Override
    public int updateByExampleSelective(CookbootSecond record, CookbootSecondExample example) {
        return 0;
    }

    @Override
    public int updateByExample(CookbootSecond record, CookbootSecondExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(CookbootSecond record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(CookbootSecond record) {
        return 0;
    }
}
