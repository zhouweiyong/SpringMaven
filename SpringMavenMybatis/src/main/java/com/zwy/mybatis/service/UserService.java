package com.zwy.mybatis.service;

import com.zwy.mybatis.mapper.UserMapper;
import com.zwy.mybatis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> getAll() {
        return userMapper.selectAll();
    }

    public User getUser(int id) {
        Example example = new Example(User.class);
        example.createCriteria().andEqualTo("id", id);
        return userMapper.selectOneByExample(example);
    }

    public void insert(User user) {
        userMapper.insert(user);
    }

    public List<User> findAllUser() {
        return userMapper.selectAll();
    }

    public void update(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    public void delete(User user) {
        userMapper.delete(user);
    }

    public void add(User user) {
//        int id = userMapper.insert(user);
        userMapper.insertUseGeneratedKeys(user);
        user.setAge(38);
        userMapper.updateByPrimaryKeySelective(user);
    }

}
