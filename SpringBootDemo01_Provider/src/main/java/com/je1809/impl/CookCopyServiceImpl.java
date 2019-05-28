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
        return cookCopyMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(CookCopyExample example) {
        return cookCopyMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer ccid) {
        return cookCopyMapper.deleteByPrimaryKey(ccid);
    }

    @Override
    public int insert(CookCopy record) {
        return cookCopyMapper.insert(record);
    }

    @Override
    public int insertSelective(CookCopy record) {
        return cookCopyMapper.insertSelective(record);
    }

    @Override
    public List<CookCopy> selectByExample(CookCopyExample example) {
        return cookCopyMapper.selectByExample(example);
    }

    @Override
    public CookCopy selectByPrimaryKey(Integer ccid) {
        return cookCopyMapper.selectByPrimaryKey(ccid);
    }

    @Override
    public int updateByExampleSelective(CookCopy record, CookCopyExample example) {
        return cookCopyMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(CookCopy record, CookCopyExample example) {
        return cookCopyMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(CookCopy record) {
        return cookCopyMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CookCopy record) {
        return cookCopyMapper.updateByPrimaryKey(record);
    }
}
