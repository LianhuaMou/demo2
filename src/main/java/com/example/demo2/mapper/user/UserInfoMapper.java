package com.example.demo2.mapper.user;

import com.example.demo2.model.user.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserInfoMapper {
    int deleteByPrimaryKey(int username);

    int insert(UserInfo record);

    UserInfo selectByPrimaryKey(int username);

    List<UserInfo> selectAll();

    int updateByPrimaryKey(UserInfo record);
}