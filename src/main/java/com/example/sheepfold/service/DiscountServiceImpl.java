package com.example.sheepfold.service;

import com.example.sheepfold.dao.DiscountMapper;
import com.example.sheepfold.model.Discount;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("discountService")
@Transactional
public class DiscountServiceImpl implements DiscountService {

    @Resource
    private DiscountMapper discountMapper;

    @Override
    public List<Discount> findModelByType(Discount discount) {
        return discountMapper.selectDiscountByType(discount);
    }
}
