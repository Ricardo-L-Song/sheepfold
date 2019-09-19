package com.example.sheepfold.controller;



import com.example.sheepfold.model.Psg;
import com.example.sheepfold.model.User;
import com.example.sheepfold.service.PsgService;
import com.example.sheepfold.service.UserService;
import com.example.sheepfold.util.Api;
import com.example.sheepfold.util.Const;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

@RestController
@RequestMapping("/Login")
public class LoginController {
    public static final Logger logger=LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private PsgService psgService;

    Api api=new Api();

    //用户登陆
    @RequestMapping(value="/user/login")
    @ResponseBody
    public Map<String,Object> userlogin(HttpServletRequest request){
        String username = request.getParameter("name");
        String password = request.getParameter("password");
        if ("".equals(username)){
            return api.returnJson(2,"登陆失败,账号密码不能为空");
        }
        Psg psg=new Psg();
        psg.setName(username);
        psg.setPassword(password);
        System.out.println(username);
        System.out.println(password);
        List<Psg>list=new ArrayList<>();
        list.add(psg);
        Psg psg1=new Psg();
        psg1=psgService.findByNameAndPs(psg);
        list.add(psg1);
        if (psg1!=null) {
//            HttpSession session = request.getSession();
//            session.setAttribute(Const.SESSION_USERNAME, user1.getUsername());
//            session.setAttribute(Const.SESSION_ID, user1.getUserId());
//            session.setAttribute(Const.SESSION_USERPASSWORD, user1.getPassword());
            return api.returnJson(1,"登陆成功",psg1.getPsgId());
        }
        return api.returnJson1(2,"登陆失败",list);
    }
    //用户注册 先做成返回所有用户
    @RequestMapping(value="/user/getpsglist")
    @ResponseBody
    public Map<String,Object> getPsgList(HttpServletRequest request){
        UUID uuid=UUID.randomUUID();
        String psgId=uuid.toString();
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String eamil=request.getParameter("email");
        String phone=request.getParameter("phone");
        if("".equals(name)||"".equals(password)){
            return api.returnJson(2,"注册失败,账号密码不能为空");
        }
        Psg psg=new Psg();
        psg=psgService.findByName(name);
        if(psg!=null){
            return api.returnJson(2,"注册失败,账号已存在");
        }
        Psg psg1=new Psg();
        psg1.setName(name);
        psg1.setPassword(password);
        psg1.setPsgId(psgId);
        psg1.setEmail(eamil);
        psg1.setPhone(phone);

        int isInsert=psgService.insertPsg(psg1);
        if (isInsert!=0){
            return api.returnJson(1,"注册成功");
        }
        return api.returnJson(2,"注册失败",psg1);
    }


    //管理员登陆
    @RequestMapping(value="/login")
    @ResponseBody
    public ModelAndView login(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("/login.html");
        return modelAndView;
    }

    //管理员登出
    @RequestMapping(value="/dologin")
    @ResponseBody
    public Map<String,Object> dologin(User userIn,HttpServletRequest request){
        logger.info("==========dologin方法执行");

        String username =userIn.getUsername();
        String password = userIn.getPassword();
        if ("".equals(username)){
            return api.returnJson(2,"登陆失败,账号密码不能为空");
        }
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);

        User user1=new User();
        user1=userService.findByNameAndPs(user);
        if (user1!=null) {
            HttpSession session = request.getSession();
            logger.info("========session中的username被存储了"+user1.getUsername());
            session.setAttribute(Const.SESSION_USERNAME, user1.getUsername());
            session.setAttribute(Const.SESSION_ID, user1.getUserId());
            session.setAttribute(Const.SESSION_USERPASSWORD, user1.getPassword());
            return api.returnJson(1,"登陆成功");
        }
        return api.returnJson(2,"登陆失败");
    }

    @RequestMapping(value="/outlogin")
    @ResponseBody
    public Map<String,Object> outlogin(HttpServletRequest request){
        Map<String, Object> map = new HashMap<String, Object>();
        HttpSession session = request.getSession(false);
        if (session == null) {
            return api.returnJson(1,"无session,登出成功");
        }

        session.removeAttribute(Const.SESSION_USERNAME);
        session.removeAttribute(Const.SESSION_USERPASSWORD);
        session.removeAttribute(Const.SESSION_ID);


        return api.returnJson(1,"删除session,登出成功");
    }
}
