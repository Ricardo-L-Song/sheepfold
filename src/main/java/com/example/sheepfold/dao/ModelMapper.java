package com.example.sheepfold.dao;

import com.example.sheepfold.model.Model;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface ModelMapper {
    int deleteByPrimaryKey(String modelId);

    int deleteByIds(String[] list);

    int insert(Model record);

    int insertSelective(Model record);

    Model selectByPrimaryKey(String modelId);

    List<Model> selectAllModel();

    List<Model> selectByTime(@Param("time") Date date);

    int updateByPrimaryKeySelective(Model record);

    int updateByPrimaryKey(Model record);
}