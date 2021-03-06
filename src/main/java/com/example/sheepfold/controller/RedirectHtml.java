package com.example.sheepfold.controller;


import com.example.sheepfold.util.Const;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class RedirectHtml {
    public static final Logger logger=LoggerFactory.getLogger(RedirectHtml.class);

    @GetMapping("Index/index")
    public String IndexJsp(Model model,HttpServletRequest request){
        logger.info("Hello world was canceled");
        System.out.println("==========Index.JSP加载");
        HttpSession session = request.getSession();
        model.addAttribute("username",session.getAttribute(Const.SESSION_USERNAME));
        return "index";
    }

    @GetMapping("Index/survey")
    public String survey(){
        logger.info("==========Survey.JSP加载");
        return "survey";
    }

    @GetMapping("Index/manager")
    public String manager(){
        logger.info("==========Manager.JSP加载");
        return "manager";
    }


    @GetMapping("/login")
    public String login(){
        logger.info("==========login.JSP加载");
        return "login";
    }

    @GetMapping("Index/welcome")
    public String welcome(){
        logger.info("==========welcome.JSP加载");
        return "welcome";
    }

    @GetMapping("Index/account")
    public String account() {
        logger.info("==========account.JSP加载");
        return "account";
    }

    @GetMapping("Index/lion")
    public String lion() {
        logger.info("==========lion.JSP加载");
        return "lion";
    }

    @GetMapping("Index/scene")
    public String scene() {
        logger.info("==========scene.JSP加载");
        return "scene";
    }

    @GetMapping("Index/props")
    public String props() {
        logger.info("==========props.JSP加载");
        return "props";
    }

    @GetMapping("Index/task")
    public String task() {
        logger.info("==========task.JSP加载");
        return "task";
    }

    @GetMapping("Index/action")
    public String action() {
        logger.info("==========action.JSP加载");
        return "action";
    }

    @GetMapping("Index/discount")
    public String discount() {
        logger.info("==========discount.JSP加载");
        return "discount";
    }

    @GetMapping("Index/index1")
    public String index1() {
        logger.info("==========index1.JSP加载");
        return "index1";
    }

    @GetMapping("Index/yingxiao")
    public String yingxiao() {
        logger.info("==========yingxiao.JSP加载");
        return "yingxiao";
    }


    @GetMapping("Index/yonghushuxing")
    public String yonghushuxing() {
        logger.info("==========yonghushuxing.JSP加载");
        return "yonghushuxing";
    }
    //111
//
//    @Autowired
//    private UserService userService;
//
//
//    @GetMapping("/index")
//    public String findOneUser(Model model){
//        System.out.println("templates/userhtml");
//
//        List<User1> userlist=userService.findByNameAndPs();
//        //单值
//        model.addAttribute("message",userlist.get(0).getUsername());
//        //对象
//        model.addAttribute("userlist",userlist);
//        //数组
//        System.out.println(userlist.size());
//
//        return "index";
//       // return "redirect:/index.html" 跳转
//    }
}
