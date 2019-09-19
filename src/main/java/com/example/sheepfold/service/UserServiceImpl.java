package com.example.sheepfold.service;


import com.example.sheepfold.dao.UserMapper;
import com.example.sheepfold.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("userService")
@Transactional
public class UserServiceImpl  implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public User findByNameAndPs(User user) {
        return userMapper.selectByUnameAndPs(user);
    }
}
