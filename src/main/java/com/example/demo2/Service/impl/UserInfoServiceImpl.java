package com.example.demo2.Service.impl;

import com.example.demo2.Service.UserInfoService;
import com.example.demo2.mapper.user.UserInfoMapper;
import com.example.demo2.model.user.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public void insert(UserInfo userInfo){
        userInfoMapper.insert(userInfo);
    }

    @Override
    public void delete(int id) {
        userInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(UserInfo user) {
        userInfoMapper.updateByPrimaryKey(user);
    }

    @Override
    public UserInfo select(int id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UserInfo> selectAll() {
        return userInfoMapper.selectAll();
    }
}
