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
        return cookMakeMethodMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(CookMakeMethodExample example) {
        return cookMakeMethodMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer cmmid) {
        return cookMakeMethodMapper.deleteByPrimaryKey(cmmid);
    }

    @Override
    public int insert(CookMakeMethod record) {
        return cookMakeMethodMapper.insert(record);
    }

    @Override
    public int insertSelective(CookMakeMethod record) {
        return cookMakeMethodMapper.insertSelective(record);
    }

    @Override
    public List<CookMakeMethod> selectByExample(CookMakeMethodExample example) {
        return cookMakeMethodMapper.selectByExample(example);
    }

    @Override
    public CookMakeMethod selectByPrimaryKey(Integer cmmid) {
        return cookMakeMethodMapper.selectByPrimaryKey(cmmid);
    }

    @Override
    public int updateByExampleSelective(CookMakeMethod record, CookMakeMethodExample example) {
        return cookMakeMethodMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(CookMakeMethod record, CookMakeMethodExample example) {
        return cookMakeMethodMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(CookMakeMethod record) {
        return cookMakeMethodMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CookMakeMethod record) {
        return cookMakeMethodMapper.updateByPrimaryKey(record);
    }
}
