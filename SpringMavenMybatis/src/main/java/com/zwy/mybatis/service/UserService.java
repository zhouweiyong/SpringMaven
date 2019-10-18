package com.zwy.mybatis.service;

import com.github.pagehelper.PageHelper;
import com.zwy.mybatis.mapper.UserMapper;
import com.zwy.mybatis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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

    /**
     * 使用事务
     * @param user
     */
    @Transactional
    public void add(User user) {
//        int id = userMapper.insert(user);
        userMapper.insertUseGeneratedKeys(user);
        user.setAge(41);
        int i = 1/0;
        userMapper.updateByPrimaryKeySelective(user);
    }

    public List<User> findUserPage(User user, int page, int pageSize){
        PageHelper.startPage(page,pageSize);
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        if (!user.getName().isEmpty()){
            criteria.andLike("name","%"+user.getName()+"%");
        }
        example.orderBy("id").desc();
        List<User> list = userMapper.selectByExample(example);
        return list;

    }

}
