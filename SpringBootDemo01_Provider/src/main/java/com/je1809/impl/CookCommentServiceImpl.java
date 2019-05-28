package com.je1809.impl;

import com.je1809.mapper.CookCommentMapper;
import com.je1809.pojo.CookComment;
import com.je1809.pojo.CookCommentExample;
import com.je1809.service.CookCommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CookCommentServiceImpl implements CookCommentService {

    @Resource
    private CookCommentMapper cookCommentMapper;

    @Override
    public int countByExample(CookCommentExample example) {
        return cookCommentMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(CookCommentExample example) {
        return cookCommentMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer ckcid) {
        return cookCommentMapper.deleteByPrimaryKey(ckcid);
    }

    @Override
    public int insert(CookComment record) {
        return cookCommentMapper.insert(record);
    }

    @Override
    public int insertSelective(CookComment record) {
        return cookCommentMapper.insertSelective(record);
    }

    @Override
    public List<CookComment> selectByExample(CookCommentExample example) {
        return cookCommentMapper.selectByExample(example);
    }

    @Override
    public CookComment selectByPrimaryKey(Integer ckcid) {
        return cookCommentMapper.selectByPrimaryKey(ckcid);
    }

    @Override
    public int updateByExampleSelective(CookComment record, CookCommentExample example) {
        return cookCommentMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(CookComment record, CookCommentExample example) {
        return cookCommentMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(CookComment record) {
        return cookCommentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CookComment record) {
        return cookCommentMapper.updateByPrimaryKey(record);
    }
}
