package com.je1809.impl;

import com.je1809.mapper.CookMakeMethodMapper;
import com.je1809.pojo.CookMakeMethod;
import com.je1809.pojo.CookMakeMethodExample;
import com.je1809.service.CookMakeMethodService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CookMakeMethodServiceImpl implements CookMakeMethodService {
    @Resource
    private CookMakeMethodMapper cookMakeMethodMapper;
    @Override
    public int countByExample(CookMakeMethodExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(CookMakeMethodExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer cmmid) {
        return 0;
    }

    @Override
    public int insert(CookMakeMethod record) {
        return 0;
    }

    @Override
    public int insertSelective(CookMakeMethod record) {
        return 0;
    }

    @Override
    public List<CookMakeMethod> selectByExample(CookMakeMethodExample example) {
        return cookMakeMethodMapper.selectByExample(example);
    }

    @Override
    public CookMakeMethod selectByPrimaryKey(Integer cmmid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(CookMakeMethod record, CookMakeMethodExample example) {
        return 0;
    }

    @Override
    public int updateByExample(CookMakeMethod record, CookMakeMethodExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(CookMakeMethod record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(CookMakeMethod record) {
        return 0;
    }
}
