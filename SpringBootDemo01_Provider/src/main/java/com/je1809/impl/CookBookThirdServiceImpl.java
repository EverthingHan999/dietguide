package com.je1809.impl;

import com.je1809.mapper.CookbookMapper;
import com.je1809.mapper.CookbookThirdMapper;
import com.je1809.pojo.CookbookThird;
import com.je1809.pojo.CookbookThirdExample;
import com.je1809.service.CookBookThirdService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CookBookThirdServiceImpl implements CookBookThirdService {
    @Resource
    private CookbookThirdMapper cookbookThirdMapper;
    @Override
    public int countByExample(CookbookThirdExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(CookbookThirdExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer cbtid) {
        return 0;
    }

    @Override
    public int insert(CookbookThird record) {
        return 0;
    }

    @Override
    public int insertSelective(CookbookThird record) {
        return 0;
    }

    @Override
    public List<CookbookThird> selectByExample(CookbookThirdExample example) {
        return cookbookThirdMapper.selectByExample(example);
    }

    @Override
    public CookbookThird selectByPrimaryKey(Integer cbtid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(CookbookThird record, CookbookThirdExample example) {
        return 0;
    }

    @Override
    public int updateByExample(CookbookThird record, CookbookThirdExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(CookbookThird record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(CookbookThird record) {
        return 0;
    }
}
