package com.zwy.mybatis.controller;

import com.zwy.mybatis.pojo.User;
import com.zwy.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 使用事务注意：
 * 1.mysql表必须支持事务：引擎为INNODB
 * 2.SpringBoot启动事务@@EnableTransactionManagement
 * 3.方法上加注解@Transactional//默认只对RuntimeException起作用,可修改
 * 4.方法必须为public修饰
 * 5.同类中事务的方法不能嵌套在其他方法中，
 * 	QQQ类中A方法调用B方法，B方法开启事务注解，B方法中事务不会生效。
 * 	将A方法放到其他类中，B方法为QQQ类中的一级方法并加注解，事务就会生效。
 */
@RestController
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping("/all")
    public Object findAll() {
        List<User> list = service.getAll();
        return list;
    }

    @RequestMapping("/getOne")
    public User findOne(int id) {
        return service.getUser(id);
    }

    @RequestMapping("/insert")
    public String insert() {
        for (int i = 0; i < 20; i++) {
            User user = new User();
            user.setName("jack" + i);
            user.setAge(20 + i);
            service.insert(user);
        }
        return "insert success!";
    }

    @RequestMapping("/update")
    public void update() {
        User user = service.getUser(2);
        user.setName("jackkk");
        user.setAge(39);
        service.update(user);
    }

    @RequestMapping("/addOne")
    public void addOne(){
        User user = new User();
        user.setAge(18);
        user.setName("Enzo");
        service.add(user);
    }

    /**
     * 分页
     * @param page
     */
    @RequestMapping("/findUser")
    public List<User> findUser(int page){
        int pageSize = 5;
        User user = new User();
        user.setName("o");
        List<User> list = service.findUserPage(user, page, pageSize);
        return list;
    }
}
