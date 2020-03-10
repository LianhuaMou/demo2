package com.example.demo2.Service;

import com.example.demo2.model.user.UserInfo;

import java.util.List;

public interface UserInfoService {
    public void insert(UserInfo userInfo);

    public void delete(int id);

    public void update(UserInfo user);

    public UserInfo select(int id);

    public List<UserInfo> selectAll();
}
