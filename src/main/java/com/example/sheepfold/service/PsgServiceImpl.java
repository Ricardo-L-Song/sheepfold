package com.example.sheepfold.service;

import com.example.sheepfold.dao.PsgMapper;
import com.example.sheepfold.model.Psg;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("psgService")
@Transactional
public class PsgServiceImpl implements PsgService{

    @Resource
    private PsgMapper psgMapper;

    @Override
    public Psg findByNameAndPs(Psg psg) {
        return psgMapper.selectByNameAndPs(psg);
    }

    @Override
    public List<Psg> findAllPsgs() {
        return psgMapper.selectAllPsgs();
    }

    @Override
    public Psg findByName(String name) {
        return psgMapper.selectByName(name);
    }

    @Override
    public int insertPsg(Psg psg) {
        return psgMapper.insert(psg);
    }
}
