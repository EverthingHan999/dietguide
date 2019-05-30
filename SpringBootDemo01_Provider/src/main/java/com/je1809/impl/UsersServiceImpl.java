package com.je1809.impl;

import com.je1809.mapper.UsersMapper;
import com.je1809.pojo.Users;
import com.je1809.pojo.UsersExample;
import com.je1809.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Resource
    private UsersMapper usersMapper;

    @Override
    public int countByExample(UsersExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(UsersExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer uid) {
        return 0;
    }

    @Override
    public int insert(Users record) {
        return 0;
    }

    @Override
    public int insertSelective(Users record) {
        return 0;
    }

    @Override
    public List<Users> selectByExample(UsersExample example) {
        return usersMapper.selectByExample(example);
    }

    @Override
    public Users selectByPrimaryKey(Integer uid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Users record, UsersExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Users record, UsersExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Users record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Users record) {
        return 0;
    }

    @Override
    public Users selectIndexByUserName(String uname) {
        return usersMapper.selectIndexByUserName(uname);
    }
}
