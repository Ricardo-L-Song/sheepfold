package com.example.sheepfold.service;

import com.example.sheepfold.dao.ModelMapper;
import com.example.sheepfold.model.Model;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service("modelService")
@Transactional
public class ModelServiceImpl implements ModelService{

    @Resource
    private ModelMapper modelMapper;

    @Override
    public List<Model> findAllModel() {
        return modelMapper.selectAllModel();
    }

    @Override
    public int deleteModelById(String modelId) {
        return modelMapper.deleteByPrimaryKey(modelId);
    }

    @Override
    public int deleteModelByIds(String[] arr) {
        return modelMapper.deleteByIds(arr);
    }

    @Override
    public int InsertModel(Model model) {
        return modelMapper.insertSelective(model);
    }

    @Override
    public Model selectModelById(String modelId) {
        return modelMapper.selectByPrimaryKey(modelId);
    }

    @Override
    public List<Model> findModelByTime(Date date) {
        return modelMapper.selectByTime(date);
    }
}
