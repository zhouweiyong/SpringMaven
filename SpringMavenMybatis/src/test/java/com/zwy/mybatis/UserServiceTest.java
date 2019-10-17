package com.zwy.mybatis;

import com.oracle.tools.packager.Log;
import com.zwy.mybatis.pojo.User;
import com.zwy.mybatis.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceTest {


    @Test
    public void getAllTest(){
        UserService userService = new UserService();
        List<User> list = userService.getAll();
        Log.info("");
    }
}
