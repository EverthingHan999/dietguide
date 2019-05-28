package com.je1809.impl;

import com.je1809.mapper.MenuMapper;
import com.je1809.pojo.Menu;
import com.je1809.pojo.MenuExample;
import com.je1809.service.MenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MenuServiceImpl implements MenuService {
    @Resource
    private MenuMapper menuMapper;
    @Override
    public int countByExample(MenuExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(MenuExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer mid) {
        return 0;
    }

    @Override
    public int insert(Menu record) {
        return 0;
    }

    @Override
    public int insertSelective(Menu record) {
        return 0;
    }

    @Override
    public List<Menu> selectByExample(MenuExample example) {
        return menuMapper.selectByExample(example);
    }

    @Override
    public Menu selectByPrimaryKey(Integer mid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Menu record, MenuExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Menu record, MenuExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Menu record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Menu record) {
        return 0;
    }
}
