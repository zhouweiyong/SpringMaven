package com.zwy.mybatis.service;

import com.zwy.mybatis.mapper.UserMapper;
import com.zwy.mybatis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> getAll(){
       return userMapper.selectAll();
    }

}
