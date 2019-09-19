package com.example.sheepfold.dao;

import com.example.sheepfold.model.Psg;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PsgMapper {
    int deleteByPrimaryKey(String psgId);

    int insert(Psg record);

    int insertSelective(Psg record);

    List<Psg> selectAllPsgs();

    Psg selectByNameAndPs(Psg record);

    Psg selectByPrimaryKey(String psgId);

    Psg selectByName(@Param("name") String name);

    int updateByPrimaryKeySelective(Psg record);

    int updateByPrimaryKey(Psg record);
}