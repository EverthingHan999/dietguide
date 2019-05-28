package com.je1809.impl;

import com.je1809.mapper.CookCopyMapper;
import com.je1809.pojo.CookCopy;
import com.je1809.pojo.CookCopyExample;
import com.je1809.service.CookCopyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CookCopyServiceImpl implements CookCopyService {
    @Resource
    private CookCopyMapper cookCopyMapper;


    @Override
    public int countByExample(CookCopyExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(CookCopyExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer ccid) {
        return 0;
    }

    @Override
    public int insert(CookCopy record) {
        return 0;
    }

    @Override
    public int insertSelective(CookCopy record) {
        return 0;
    }

    @Override
    public List<CookCopy> selectByExample(CookCopyExample example) {
        return cookCopyMapper.selectByExample(example);
    }

    @Override
    public CookCopy selectByPrimaryKey(Integer ccid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(CookCopy record, CookCopyExample example) {
        return 0;
    }

    @Override
    public int updateByExample(CookCopy record, CookCopyExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(CookCopy record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(CookCopy record) {
        return 0;
    }
}
