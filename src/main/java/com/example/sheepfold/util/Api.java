package com.example.sheepfold.util;


import com.example.sheepfold.model.Discount;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//code=1 success 2 fail 3 warning
public class Api {
    public Map<String,Object> returnJson(int code,String msg){
        Map map=new HashMap();
        map.put("code",code);
        map.put("msg",msg);
        return map;
    }

//    public Map<String,Object> returnJson(int code, String msg, List<Map> data){
//        Map map=new HashMap();
//        map.put("code",code);
//        map.put("msg",msg);
//        map.put("data",data);
//        return map;
//    }

    public Map<String, Object> returnJson(int code, String msg, Map data) {
        Map map=new HashMap();
        map.put("code",code);
        map.put("msg",msg);
        map.put("data",data);
        return map;
    }


    public Map<String, Object> returnJson(int code, String msg, String data) {
        Map map=new HashMap();
        map.put("code",code);
        map.put("msg",msg);
        map.put("data",data);
        return map;
    }


    /**
     * 根据类型查询优惠券的API
     *
     * @param i
     * @param findDiscountByType查询成功
     * @param discounts
     * @return
     */
    public Map<String, Object> returnJson(int i, String findDiscountByType查询成功, List<Discount> discounts) {
        Map map=new HashMap();
        map.put("code", i);
        map.put("msg", findDiscountByType查询成功);
        map.put("data", discounts);
        return map;
    }
}
