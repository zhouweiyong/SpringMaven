package com.zwy.mybatis.service;

import com.zwy.mybatis.mapper.UserCustomMapper;
import com.zwy.mybatis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCustomService {
    @Autowired
    private UserCustomMapper customMapper;

    public List<User> findAll(){
        return  customMapper.findAll();
    }
}
