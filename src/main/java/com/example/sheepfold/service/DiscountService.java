package com.example.sheepfold.service;

import com.example.sheepfold.model.Discount;

import java.util.List;

public interface DiscountService {
    public List<Discount> findModelByType(Discount discount);
}
