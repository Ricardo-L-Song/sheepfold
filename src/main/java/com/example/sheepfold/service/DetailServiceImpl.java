package com.example.sheepfold.service;

import com.example.sheepfold.dao.DetailMapper;
import com.example.sheepfold.model.Detail;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("detailService")
@Transactional
public class DetailServiceImpl implements DetailService {

    @Resource
    private DetailMapper detailMapper;
    @Override
    public List<Detail> findOptionList(String qsnId) {
        return detailMapper.selectOptionsByQsnId(qsnId);
    }

    @Override
    public Detail findAskAnswer(String qsnId) {
        return detailMapper.selectByQsnId(qsnId);
    }

    @Override
    public int insertDetail(Detail detail) {
        return detailMapper.insertSelective(detail);
    }

    @Override
    public int deleteOptionsByQsnId(String qsnId) {
        return detailMapper.deleteByQsnId(qsnId);
    }
}
