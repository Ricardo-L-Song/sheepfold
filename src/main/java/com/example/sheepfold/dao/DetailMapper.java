package com.example.sheepfold.dao;




import com.example.sheepfold.model.Detail;

import java.util.List;

public interface DetailMapper {
    int deleteByPrimaryKey(String detailId);

    int deleteByQsnId(String qsnId);

    int insert(Detail record);

    int insertSelective(Detail record);

    Detail selectByPrimaryKey(String detailId);

    Detail selectByQsnId(String qsnId);

    List<Detail> selectOptionsByQsnId(String qsnId);

    int updateByPrimaryKeySelective(Detail record);

    int updateByPrimaryKey(Detail record);
}