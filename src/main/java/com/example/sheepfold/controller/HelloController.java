package com.example.sheepfold.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 技术总结SpringBoot,Thymeleaf,Redis,Druid,SuperSet的数据可视化:支持doucker容器化部署
 * 部署平台阿里云
 */
@Controller
public class HelloController {
    public static final Logger logger=LoggerFactory.getLogger(HelloController.class);


    @RequestMapping(value = "/customer/list.action")
    public ModelAndView hello(){
    logger.info("菜单加载完成");
    ModelAndView modelAndView=new ModelAndView();
    modelAndView.setViewName("/welcome.html");
//    modelAndView.addObject("message","hack the world");//请求给渲染的页面传参
    return modelAndView;
    }

    @RequestMapping(value="/nav_left")
    @ResponseBody
    public Map<String,Object> getList(){
        List<Map<String,Object>> totalList=new ArrayList();//存放一级标题
        List<Map<String,Object>> mapList=new ArrayList();//存放二级标题
        List<Map<String,Object>> mapList1=new ArrayList();//存放二级标题
        List<Map<String, Object>> mapList3 = new ArrayList();//存放二级标题
        List<Map<String, Object>> mapList4 = new ArrayList();//存放二级标题

        Map m2 = new HashMap();//游戏运营管理菜单
        m2.put("text", "游戏运营管理");
        m2.put("icon", "&#xe620;");
        m2.put("subset", mapList);
        Map m2_1=new HashMap();
        m2_1.put("text", "账户管理");
        m2_1.put("icon","&#xe621;");
        m2_1.put("href", "http://localhost:8777/Index/account");
        Map m2_2=new HashMap();
        m2_2.put("text", "宠物管理");
        m2_2.put("icon","&#xe621;");
        m2_2.put("href", "http://localhost:8777/Index/lion");
        Map m2_3=new HashMap();
        m2_3.put("text", "场景管理");
        m2_3.put("icon","&#xe621;");
        m2_3.put("href", "http://localhost:8777/Index/scene");
        Map m2_4=new HashMap();
        m2_4.put("text", "道具管理");
        m2_4.put("icon","&#xe621;");
        m2_4.put("href", "http://localhost:8777/Index/props");
        Map m2_5 = new HashMap();
        m2_5.put("text", "活动管理");
        m2_5.put("icon", "&#xe621;");
        m2_5.put("href", "http://localhost:8777/Index/task");
        Map m2_6 = new HashMap();
        m2_6.put("text", "用户行为记录查看");
        m2_6.put("icon", "&#xe621;");
        m2_6.put("href", "http://localhost:8777/Index/action");
        Map m2_7 = new HashMap();
        m2_7.put("text", "奖励管理");
        m2_7.put("icon", "&#xe621;");
        m2_7.put("href", "http://localhost:8777/Index/discount");
        Map m2_8 = new HashMap();
        m2_8.put("text", "用户分群");
        m2_8.put("icon", "&#xe621;");
        m2_8.put("href", "http://localhost:8777/Index/discount");
        Map m2_9 = new HashMap();
        m2_9.put("text", "任务管理");
        m2_9.put("icon", "&#xe621;");
        m2_9.put("href", "http://localhost:8777/Index/task");
        mapList.add(m2_1);
        mapList.add(m2_2);
        mapList.add(m2_3);
        mapList.add(m2_4);
        mapList.add(m2_5);
        mapList.add(m2_6);
        mapList.add(m2_7);
        mapList.add(m2_8);


        Map m1 = new HashMap();//用户行为数据分析菜单
        m1.put("text", "用户行为数据分析");
        m1.put("icon", "&#xe620;");
        m1.put("subset", mapList1);
        Map m1_1=new HashMap();
        m1_1.put("text", "留存分析");
        m1_1.put("icon","&#xe621;");
        m1_1.put("href", "http://localhost:8777/Index/welcome1");
        mapList1.add(m1_1);

        Map m1_2 = new HashMap();
        m1_2.put("text", "流量漏斗分析");
        m1_2.put("icon", "&#xe621;");
        m1_2.put("href", "http://localhost:8777/Index/welcome1");
        mapList1.add(m1_2);

        Map m1_3 = new HashMap();
        m1_3.put("text", "用户行为路径分析");
        m1_3.put("icon", "&#xe621;");
        m1_3.put("href", "http://localhost:8777/Index/welcome1");
        mapList1.add(m1_3);

        Map m1_4 = new HashMap();
        m1_4.put("text", "转化分析");
        m1_4.put("icon", "&#xe621;");
        m1_4.put("href", "http://localhost:8777/Index/welcome1");
        mapList1.add(m1_4);

        Map m1_5 = new HashMap();
        m1_5.put("text", "营销事件分析");
        m1_5.put("icon", "&#xe621;");
        m1_5.put("href", "http://localhost:8777/Index/welcome1");
        mapList1.add(m1_5);


        Map m3 = new HashMap();//数据指标概览菜单
        m3.put("text", "数据指标概览");
        m3.put("icon", "&#xe620;");
        m3.put("subset", mapList3);

        Map m3_1 = new HashMap();
        m3_1.put("text", "运营数据概览");
        m3_1.put("icon", "&#xe621;");
        m3_1.put("href", "http://localhost:8777/Index/welcome");
        mapList3.add(m3_1);

        Map m3_2 = new HashMap();
        m3_2.put("text", "营销数据概览");
        m3_2.put("icon", "&#xe621;");
        m3_2.put("href", "http://localhost:8777/Index/yingxiao");
        mapList3.add(m3_2);

        Map m3_3 = new HashMap();
        m3_3.put("text", "渠道数据概览");
        m3_3.put("icon", "&#xe621;");
        m3_3.put("href", "http://localhost:8777/Index/welcome1");
        mapList3.add(m3_3);


        Map m4 = new HashMap();//数据分析
        m4.put("text", "数据分析");
        m4.put("icon", "&#xe620;");
        m4.put("subset", mapList4);

        Map m4_1 = new HashMap();
        m4_1.put("text", "用户属性分析");
        m4_1.put("icon", "&#xe621;");
        m4_1.put("href", "http://localhost:8777/Index/yonghushuxing");
        mapList4.add(m4_1);

        Map m4_2 = new HashMap();
        m4_2.put("text", "流量漏斗分析");
        m4_2.put("icon", "&#xe621;");
        m4_2.put("href", "http://localhost:8777/Index/welcome1");
        mapList4.add(m4_2);

        Map m4_3 = new HashMap();
        m4_3.put("text", "留存分析");
        m4_3.put("icon", "&#xe621;");
        m4_3.put("href", "http://localhost:8777/Index/welcome1");
        mapList4.add(m4_3);

        Map m4_4 = new HashMap();
        m4_4.put("text", "用户行为路径分析");
        m4_4.put("icon", "&#xe621;");
        m4_4.put("href", "http://localhost:8777/Index/welcome1");
        mapList4.add(m4_4);

        Map m4_5 = new HashMap();
        m4_5.put("text", "营销事件分析");
        m4_5.put("icon", "&#xe621;");
        m4_5.put("href", "http://localhost:8777/Index/welcome1");
        mapList4.add(m4_5);



        totalList.add(m2);//组合一级标题
        totalList.add(m3);//组合一级标题
        totalList.add(m4);//组合一级标题
        // totalList.add(m1);//组合一级标题
        Map data=new HashMap();
        data.put("data",totalList);


       return data;
    }
}