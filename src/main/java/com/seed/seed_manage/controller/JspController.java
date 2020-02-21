package com.seed.seed_manage.controller;

import com.seed.seed_manage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Classname:JspController
 * Package:com.seed.seed_manage.controller
 * Description:
 *
 * @DATE:2020/2/20 17:09
 * @Author:zhaozihan0823
 */
@Controller
public class JspController {

    @Autowired
    UserService userService;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/login")
    public String login(@RequestParam("userName") String userName, @RequestParam("userPassword") String userPassword) {
        Map<String, Object> resultMap = userService.login(userName, userPassword);
        ModelAndView modelAndView;
        return "index";
    }
}
