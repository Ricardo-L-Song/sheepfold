package com.example.sheepfold.service;


import com.example.sheepfold.model.Detail;

import java.util.List;


public interface DetailService {
    public List<Detail> findOptionList(String qsnId);

    public Detail findAskAnswer(String qsnId);

    public int insertDetail(Detail detail);

    public int deleteOptionsByQsnId(String qsnId);
}
