package com.je1809.impl;

import com.je1809.mapper.MyAttentionMapper;
import com.je1809.pojo.MyAttention;
import com.je1809.pojo.MyAttentionExample;
import com.je1809.service.MyAttentionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MyAttentionServiceImpl implements MyAttentionService {
    @Resource
    private MyAttentionMapper myAttentionMapper;

    @Override
    public int countByExample(MyAttentionExample example) {
        return myAttentionMapper.countByExample (example);
    }

    @Override
    public int deleteByExample(MyAttentionExample example) {
        return myAttentionMapper.deleteByExample (example);
    }

    @Override
    public int deleteByPrimaryKey(Integer maid) {
        return myAttentionMapper.deleteByPrimaryKey (maid);
    }

    @Override
    public int insert(MyAttention record) {
        return myAttentionMapper.insert (record);
    }

    @Override
    public int insertSelective(MyAttention record) {
        return myAttentionMapper.insertSelective (record);
    }

    @Override
    public List<MyAttention> selectByExample(MyAttentionExample example) {
        return myAttentionMapper.selectByExample (example);
    }

    @Override
    public MyAttention selectByPrimaryKey(Integer maid) {
        return myAttentionMapper.selectByPrimaryKey (maid);
    }

    @Override
    public int updateByExampleSelective(MyAttention record, MyAttentionExample example) {
        return myAttentionMapper.updateByExample (record , example);
    }

    @Override
    public int updateByExample(MyAttention record, MyAttentionExample example) {
        return myAttentionMapper.updateByExample (record ,example);
    }

    @Override
    public int updateByPrimaryKeySelective(MyAttention record) {
        return myAttentionMapper.updateByPrimaryKeySelective (record);
    }

    @Override
    public int updateByPrimaryKey(MyAttention record) {
        return myAttentionMapper.updateByPrimaryKey (record);
    }
}
