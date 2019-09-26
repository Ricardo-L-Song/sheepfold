package com.example.sheepfold.dao;

import com.example.sheepfold.model.Discount;
import com.example.sheepfold.util.MyMapper;

import java.util.List;

public interface DiscountMapper extends MyMapper<Discount> {

    List<Discount> selectDiscountByType(Discount discount);
}