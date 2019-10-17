package com.zwy.mybatis.mapper;

import com.zwy.mybatis.pojo.User;

import java.util.List;

public interface UserCustomMapper {

    public List<User> findAll();
}
