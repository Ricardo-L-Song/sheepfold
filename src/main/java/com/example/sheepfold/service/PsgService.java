package com.example.sheepfold.service;

import com.example.sheepfold.model.Psg;


import java.util.List;

public interface PsgService {
    //用户登陆的时候验证用户名和密码
    public Psg findByNameAndPs(Psg psg);
    //用户注册的时候查询所有的用户
    public List<Psg> findAllPsgs();

    Psg findByName(String name);

    int insertPsg(Psg psg);
}
