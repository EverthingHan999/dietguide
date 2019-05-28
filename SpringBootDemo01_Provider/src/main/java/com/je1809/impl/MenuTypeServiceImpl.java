package com.je1809.impl;

import com.je1809.mapper.MenuTypeMapper;
import com.je1809.pojo.MenuType;
import com.je1809.pojo.MenuTypeExample;
import com.je1809.service.MenuTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MenuTypeServiceImpl implements MenuTypeService {
    @Resource
    private MenuTypeMapper menuTypeMapper;

    @Override
    public int countByExample(MenuTypeExample example) {
        return menuTypeMapper.countByExample (example);
    }

    @Override
    public int deleteByExample(MenuTypeExample example) {
        return menuTypeMapper.deleteByExample (example);
    }

    @Override
    public int deleteByPrimaryKey(Integer mtid) {
        return menuTypeMapper.deleteByPrimaryKey (mtid);
    }

    @Override
    public int insert(MenuType record) {
        return menuTypeMapper.insert (record);
    }

    @Override
    public int insertSelective(MenuType record) {
        return menuTypeMapper.insertSelective (record);
    }

    @Override
    public List<MenuType> selectByExample(MenuTypeExample example) {
        return menuTypeMapper.selectByExample (example);
    }

    @Override
    public MenuType selectByPrimaryKey(Integer mtid) {
        return menuTypeMapper.selectByPrimaryKey (mtid);
    }

    @Override
    public int updateByExampleSelective(MenuType record, MenuTypeExample example) {
        return 0;
    }

    @Override
    public int updateByExample(MenuType record, MenuTypeExample example) {
        return menuTypeMapper.updateByExample (record ,example);
    }

    @Override
    public int updateByPrimaryKeySelective(MenuType record) {
        return menuTypeMapper.updateByPrimaryKeySelective (record);
    }

    @Override
    public int updateByPrimaryKey(MenuType record) {
        return menuTypeMapper.updateByPrimaryKey (record);
    }
}
