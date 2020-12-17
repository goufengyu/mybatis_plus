package com.example.mybatis_plus_demo.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatis_plus_demo.dao.UserMapper;
import com.example.mybatis_plus_demo.entity.User;
import com.example.mybatis_plus_demo.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>  implements IUserService {
}
