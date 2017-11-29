package com.datacruiser.beartask.mvc.controller;


import com.datacruiser.beartask.entity.User;
import com.datacruiser.beartask.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/user")
public class UserController {
    //注入Service  
    @Autowired
    private UserService userService;

    @RequestMapping("regist")
    public String regist(User user, Model model) throws Exception {

        System.out.println("用户注册："+user.getName()+user.getPwd());

        user.setLoginId(user.getLoginId());

        userService.add(user);

        model.addAttribute("msg", "注册成功");
        //注册成功后跳转success.jsp页面  
        return "success";
    }

    @RequestMapping("login")
    public String login(User user,Model model){

        System.out.println("用户登录："+user.getName()+user.getPwd());
          
        /*Map<String, String> map=new LinkedHashMap<String,String>(); 
         
        map.put("name", user.getName()); 
        map.put("password", user.getPassword());*/

        userService.login(name,password);

        model.addAttribute("msg", "登录成功");

        return "success";
    }
}  