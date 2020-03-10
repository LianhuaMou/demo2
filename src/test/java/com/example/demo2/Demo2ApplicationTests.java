package com.example.demo2;

import com.example.demo2.mapper.user.UserInfoMapper;
import com.example.demo2.model.user.UserInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class Demo2ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Test
    public void Test1(){
        List<UserInfo> userInfoList=userInfoMapper.selectAll();
        System.out.println("userInfoList  "+userInfoList.size());
    }

}
