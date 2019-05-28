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
        return 0;
    }

    @Override
    public int deleteByExample(CookStuffExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer cstid) {
        return 0;
    }

    @Override
    public int insert(CookStuff record) {
        return 0;
    }

    @Override
    public int insertSelective(CookStuff record) {
        return 0;
    }

    @Override
    public List<CookStuff> selectByExample(CookStuffExample example) {
        return cookStuffMapper.selectByExample(example);
    }

    @Override
    public CookStuff selectByPrimaryKey(Integer cstid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(CookStuff record, CookStuffExample example) {
        return 0;
    }

    @Override
    public int updateByExample(CookStuff record, CookStuffExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(CookStuff record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(CookStuff record) {
        return 0;
    }
}
