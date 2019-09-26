package com.example.sheepfold.controller;


import com.example.sheepfold.model.Discount;
import com.example.sheepfold.service.DiscountService;
import com.example.sheepfold.util.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("Index/Discount")
public class DiscountController {
    public static final Logger logger = LoggerFactory.getLogger(DiscountController.class);

    @Autowired
    private DiscountService discountService;

    Api api = new Api();

    /**
     * 返回值为1则成功 2失败
     *
     * @param discount
     * @return
     */
    @RequestMapping(value = "/findDiscountByType")
    @ResponseBody
    public Map<String, Object> findDiscountByType(Discount discount) {
        if (discount.getDiscountType() == null) {
            return api.returnJson(2, "无法查找此类型优惠券");
        }
        logger.info("====findDiscountByType:前端传入的discount类型:" + discount.getDiscountType());
        List<Discount> discounts = new ArrayList<Discount>();
        discounts = discountService.findModelByType(discount);
        if (discounts.size() != 0) {
            logger.info("=====findDiscountByType查询成功");
            return api.returnJson(1, "查询成功", discounts);
        }
        return api.returnJson(3, "Error");
    }

}
