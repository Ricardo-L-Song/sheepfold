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


    @GetMapping("Index/brokenline")
    public String brokenline(){
        logger.info("==========brokenline.JSP加载");
        return "brokenline";
    }

    @GetMapping("Index/namecloud")
    public String namecloud(){
        logger.info("==========namecloud.JSP加载");
        return "namecloud";
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
