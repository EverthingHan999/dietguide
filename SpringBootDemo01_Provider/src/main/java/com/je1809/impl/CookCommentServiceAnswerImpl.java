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
        return 0;
    }

    @Override
    public int deleteByExample(CookCommentAnswerExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer ckcaid) {
        return 0;
    }

    @Override
    public int insert(CookCommentAnswer record) {
        return 0;
    }

    @Override
    public int insertSelective(CookCommentAnswer record) {
        return 0;
    }

    @Override
    public List<CookCommentAnswer> selectByExample(CookCommentAnswerExample example) {
        return cookCommentAnswerMapper.selectByExample(example);
    }

    @Override
    public CookCommentAnswer selectByPrimaryKey(Integer ckcaid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(CookCommentAnswer record, CookCommentAnswerExample example) {
        return 0;
    }

    @Override
    public int updateByExample(CookCommentAnswer record, CookCommentAnswerExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(CookCommentAnswer record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(CookCommentAnswer record) {
        return 0;
    }
}
