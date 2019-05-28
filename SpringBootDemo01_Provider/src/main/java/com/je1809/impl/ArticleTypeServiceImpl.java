package com.je1809.impl;

import com.je1809.mapper.ArticleTypeMapper;
import com.je1809.pojo.ArticleType;
import com.je1809.pojo.ArticleTypeExample;
import com.je1809.service.ArticleTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ArticleTypeServiceImpl implements ArticleTypeService {

    @Resource
    private ArticleTypeMapper articleTypeMapper;

    @Override
    public int countByExample(ArticleTypeExample example) {
        return articleTypeMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ArticleTypeExample example) {
        return articleTypeMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer atid) {
        return articleTypeMapper.deleteByPrimaryKey(atid);
    }

    @Override
    public int insert(ArticleType record) {
        return articleTypeMapper.insert(record);
    }

    @Override
    public int insertSelective(ArticleType record) {
        return articleTypeMapper.insertSelective(record);
    }

    @Override
    public List<ArticleType> selectByExample(ArticleTypeExample example) {
        return articleTypeMapper.selectByExample(example);
    }

    @Override
    public List<ArticleType> selectByExampleConnect(ArticleTypeExample example) {
        return articleTypeMapper.selectByExampleConnect(example);
    }

    @Override
    public ArticleType selectByPrimaryKey(Integer atid) {
        return articleTypeMapper.selectByPrimaryKey(atid);
    }

    @Override
    public int updateByExampleSelective(ArticleType record, ArticleTypeExample example) {
        return articleTypeMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(ArticleType record, ArticleTypeExample example) {
        return articleTypeMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(ArticleType record) {
        return articleTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ArticleType record) {
        return articleTypeMapper.updateByPrimaryKey(record);
    }
}
