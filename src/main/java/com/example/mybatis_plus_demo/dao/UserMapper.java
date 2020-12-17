package com.example.mybatis_plus_demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatis_plus_demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    User selectById(String id);


}
