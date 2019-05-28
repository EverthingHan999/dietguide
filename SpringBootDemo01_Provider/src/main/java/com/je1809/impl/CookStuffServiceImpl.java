package com.je1809.impl;

import com.je1809.mapper.CookStuffMapper;
import com.je1809.pojo.CookStuff;
import com.je1809.pojo.CookStuffExample;
import com.je1809.service.CookStuffService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CookStuffServiceImpl implements CookStuffService {
    @Resource
    private CookStuffMapper cookStuffMapper;
    @Override
    public int countByExample(CookStuffExample example) {
        return cookStuffMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(CookStuffExample example) {
        return cookStuffMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer cstid) {
        return cookStuffMapper.deleteByPrimaryKey(cstid);
    }

    @Override
    public int insert(CookStuff record) {
        return cookStuffMapper.insert(record);
    }

    @Override
    public int insertSelective(CookStuff record) {
        return cookStuffMapper.insertSelective(record);
    }

    @Override
    public List<CookStuff> selectByExample(CookStuffExample example) {
        return cookStuffMapper.selectByExample(example);
    }

    @Override
    public CookStuff selectByPrimaryKey(Integer cstid) {
        return cookStuffMapper.selectByPrimaryKey(cstid);
    }

    @Override
    public int updateByExampleSelective(CookStuff record, CookStuffExample example) {
        return cookStuffMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(CookStuff record, CookStuffExample example) {
        return cookStuffMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(CookStuff record) {
        return cookStuffMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CookStuff record) {
        return cookStuffMapper.updateByPrimaryKey(record);
    }
}
