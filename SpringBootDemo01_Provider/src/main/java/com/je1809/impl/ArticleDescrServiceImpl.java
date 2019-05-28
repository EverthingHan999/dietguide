package com.je1809.impl;

import com.je1809.mapper.ArticleDescrMapper;
import com.je1809.pojo.ArticleDescr;
import com.je1809.pojo.ArticleDescrExample;
import com.je1809.service.ArticleDescrService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ArticleDescrServiceImpl implements ArticleDescrService {

    @Resource
    private ArticleDescrMapper articleDescrMapper;

    @Override
    public int countByExample(ArticleDescrExample example) {
        return articleDescrMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ArticleDescrExample example) {
        return articleDescrMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer adid) {
        return articleDescrMapper.deleteByPrimaryKey(adid);
    }

    @Override
    public int insert(ArticleDescr record) {
        return articleDescrMapper.insert(record);
    }

    @Override
    public int insertSelective(ArticleDescr record) {
        return articleDescrMapper.insertSelective(record);
    }

    @Override
    public List<ArticleDescr> selectByExample(ArticleDescrExample example) {
        return articleDescrMapper.selectByExample(example);
    }

    @Override
    public ArticleDescr selectByPrimaryKey(Integer adid) {
        return articleDescrMapper.selectByPrimaryKey(adid);
    }

    @Override
    public int updateByExampleSelective(ArticleDescr record, ArticleDescrExample example) {
        return articleDescrMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(ArticleDescr record, ArticleDescrExample example) {
        return articleDescrMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(ArticleDescr record) {
        return articleDescrMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ArticleDescr record) {
        return articleDescrMapper.updateByPrimaryKey(record);
    }
}
