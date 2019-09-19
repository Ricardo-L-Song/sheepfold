package com.example.sheepfold.service;


import com.example.sheepfold.dao.ChooseMapper;
import com.example.sheepfold.model.Choose;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("chooseService")
@Transactional
public class ChooseServiceImpl implements ChooseService{

    @Resource
    private ChooseMapper chooseMapper;
    @Override
    public List<Choose> findChooseByModelId(String modelId) {
        return chooseMapper.selectByModelId(modelId);
    }

    @Override
    public List<Choose> countDataBy2Id(String qsnId, String detailId) {
        return chooseMapper.selectByQsnIdDetailId(qsnId,detailId);
    }

    @Override
    public int InsertChoose(Choose record) {
        return chooseMapper.insertSelective(record);
    }

    @Override
    public List<Choose> findByQsnId(String qsnId) {
        return chooseMapper.selectByQsnId(qsnId);
    }
}
