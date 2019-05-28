package com.je1809.impl;

import com.je1809.mapper.ArticleMapper;
import com.je1809.pojo.Article;
import com.je1809.pojo.ArticleExample;
import com.je1809.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private ArticleMapper articleMapper;

    @Override
    public int countByExample(ArticleExample example) {
        return articleMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ArticleExample example) {
        return articleMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer aid) {
        return articleMapper.deleteByPrimaryKey(aid);
    }

    @Override
    public int insert(Article record) {
        return articleMapper.insert(record);
    }

    @Override
    public int insertSelective(Article record) {
        return articleMapper.insert(record);
    }

    @Override
    public List<Article> selectByExample(ArticleExample example) {
        return articleMapper.selectByExample(example);
    }

    @Override
    public Article selectByPrimaryKey(Integer aid) {
        return articleMapper.selectByPrimaryKey(aid);
    }

    @Override
    public int updateByExampleSelective(Article record, ArticleExample example) {
        return articleMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Article record, ArticleExample example) {
        return articleMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Article record) {
        return articleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Article record) {
        return articleMapper.updateByPrimaryKey(record);
    }
}
