package com.je1809.impl;

import com.je1809.mapper.MenuCookMapper;
import com.je1809.pojo.MenuCook;
import com.je1809.pojo.MenuCookExample;
import com.je1809.service.MenuCookService;
import com.je1809.service.MenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MenuCookServiceImpl implements MenuCookService {
    @Resource
    private MenuCookMapper menuCookMapper;
    @Override
    public int countByExample(MenuCookExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(MenuCookExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer mcid) {
        return 0;
    }

    @Override
    public int insert(MenuCook record) {
        return 0;
    }

    @Override
    public int insertSelective(MenuCook record) {
        return 0;
    }

    @Override
    public List<MenuCook> selectByExample(MenuCookExample example) {
        return menuCookMapper.selectByExample(example);
    }

    @Override
    public MenuCook selectByPrimaryKey(Integer mcid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(MenuCook record, MenuCookExample example) {
        return 0;
    }

    @Override
    public int updateByExample(MenuCook record, MenuCookExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(MenuCook record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(MenuCook record) {
        return 0;
    }
}
