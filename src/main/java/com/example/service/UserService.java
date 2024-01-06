package com.example.service;

import com.example.mapper.MemberMapper;
import com.example.mapper.OrderMapper;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    private UserMapper userMapper; //代理对象，应该由Mybatis 产生

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private MemberMapper memberMapper;

    public void test() {
        System.out.println(userMapper);
        System.out.println(userMapper.getUserName());

        System.out.println(orderMapper);
        System.out.println(orderMapper.getOrderName());

        System.out.println(memberMapper);
        System.out.println(memberMapper.getMemberMapper());
    }
}
