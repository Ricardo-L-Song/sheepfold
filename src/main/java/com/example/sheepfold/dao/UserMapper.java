package com.example.sheepfold.dao;

import com.example.sheepfold.model.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(User record);

    User selectByPrimaryKey(String userId);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

    User selectByUnameAndPs(User record);
}