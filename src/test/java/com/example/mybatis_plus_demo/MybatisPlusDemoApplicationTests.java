package com.example.mybatis_plus_demo;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatis_plus_demo.dao.UserMapper;
import com.example.mybatis_plus_demo.entity.User;
import com.example.mybatis_plus_demo.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class MybatisPlusDemoApplicationTests {

    @Autowired
    IUserService userService;
    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        User user = userMapper.selectById("2");
        System.out.println(user);
    }

    @Test
    void testSave() {
        User user1 = new User();
        user1.setId("3");
        user1.setName("王五");
        user1.setAge("44");
        user1.setCreatetime(new Date());
        userService.save(user1);
    }

    @Test
    void testPage(){
        Page<User> userPage = new Page<>(2,2);
        QueryWrapper<User> query = new QueryWrapper<>();
        User user = new User();
        user.setAge("44");
        query.setEntity(user);
        Page<User> page = userMapper.selectPage(userPage, query);
        System.out.println(page.getRecords());
    }


}
