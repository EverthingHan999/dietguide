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
        return cookSeasoningMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(CookSeasoningExample example) {
        return cookSeasoningMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer ckseid) {
        return cookSeasoningMapper.deleteByPrimaryKey(ckseid);
    }

    @Override
    public int insert(CookSeasoning record) {
        return cookSeasoningMapper.insert(record);
    }

    @Override
    public int insertSelective(CookSeasoning record) {
        return cookSeasoningMapper.insertSelective(record);
    }

    @Override
    public List<CookSeasoning> selectByExample(CookSeasoningExample example) {
        return cookSeasoningMapper.selectByExample(example);
    }

    @Override
    public CookSeasoning selectByPrimaryKey(Integer ckseid) {
        return cookSeasoningMapper.selectByPrimaryKey(ckseid);
    }

    @Override
    public int updateByExampleSelective(CookSeasoning record, CookSeasoningExample example) {
        return cookSeasoningMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(CookSeasoning record, CookSeasoningExample example) {
        return cookSeasoningMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(CookSeasoning record) {
        return cookSeasoningMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CookSeasoning record) {
        return cookSeasoningMapper.updateByPrimaryKey(record);
    }
}
