package com.je1809.impl;

import com.je1809.mapper.CookSeasoningMapper;
import com.je1809.pojo.CookMakeMethod;
import com.je1809.pojo.CookMakeMethodExample;
import com.je1809.pojo.CookSeasoning;
import com.je1809.pojo.CookSeasoningExample;
import com.je1809.service.CookSeasoningService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CookSeasoningServiceImpl implements CookSeasoningService {
    @Resource
    private CookSeasoningMapper cookSeasoningMapper;

    @Override
    public int countByExample(CookSeasoningExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(CookSeasoningExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer ckseid) {
        return 0;
    }

    @Override
    public int insert(CookSeasoning record) {
        return 0;
    }

    @Override
    public int insertSelective(CookSeasoning record) {
        return 0;
    }

    @Override
    public List<CookSeasoning> selectByExample(CookSeasoningExample example) {
        return cookSeasoningMapper.selectByExample(example);
    }

    @Override
    public CookSeasoning selectByPrimaryKey(Integer ckseid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(CookSeasoning record, CookSeasoningExample example) {
        return 0;
    }

    @Override
    public int updateByExample(CookSeasoning record, CookSeasoningExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(CookSeasoning record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(CookSeasoning record) {
        return 0;
    }
}
