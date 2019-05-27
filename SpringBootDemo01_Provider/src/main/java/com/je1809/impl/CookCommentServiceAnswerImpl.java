package com.je1809.impl;

import com.je1809.mapper.CookCommentAnswerMapper;
import com.je1809.mapper.CookCommentMapper;
import com.je1809.mapper.CookMakeMethodMapper;
import com.je1809.pojo.CookCommentAnswer;
import com.je1809.pojo.CookCommentAnswerExample;
import com.je1809.service.CooKCommentAnswerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CookCommentServiceAnswerImpl implements CooKCommentAnswerService {
    @Resource
    private CookCommentAnswerMapper cookCommentAnswerMapper;

    @Override
    public int countByExample(CookCommentAnswerExample example) {
        return cookCommentAnswerMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(CookCommentAnswerExample example) {
        return cookCommentAnswerMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer ckcaid) {
        return cookCommentAnswerMapper.deleteByPrimaryKey(ckcaid);
    }

    @Override
    public int insert(CookCommentAnswer record) {
        return cookCommentAnswerMapper.insert(record);
    }

    @Override
    public int insertSelective(CookCommentAnswer record) {
        return cookCommentAnswerMapper.insertSelective(record);
    }

    @Override
    public List<CookCommentAnswer> selectByExample(CookCommentAnswerExample example) {
        return cookCommentAnswerMapper.selectByExample(example);
    }

    @Override
    public CookCommentAnswer selectByPrimaryKey(Integer ckcaid) {
        return cookCommentAnswerMapper.selectByPrimaryKey(ckcaid);
    }

    @Override
    public int updateByExampleSelective(CookCommentAnswer record, CookCommentAnswerExample example) {
        return cookCommentAnswerMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(CookCommentAnswer record, CookCommentAnswerExample example) {
        return cookCommentAnswerMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(CookCommentAnswer record) {
        return cookCommentAnswerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CookCommentAnswer record) {
        return cookCommentAnswerMapper.updateByPrimaryKey(record);
    }
}
