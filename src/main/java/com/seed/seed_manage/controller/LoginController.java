package com.seed.seed_manage.controller;

import com.seed.seed_manage.bean.TbEmp;
import com.seed.seed_manage.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/seedproject")

public class LoginController {

    @Autowired
    TbEmp tbEmp;

    @Autowired
    LoginService loginService;

    @Autowired
    HttpSession session;

    @RequestMapping(value = "/login" , method = RequestMethod.POST)
    @ResponseBody

    public String Login(@RequestParam("empno") String empno, @RequestParam("password") String password)
    {
        tbEmp = loginService.get(empno,password);
        if (tbEmp != null)
        {
         session.setAttribute("empno",empno);
         ModelAndView modelAndView;
         return "index";
        }
        return "";
    }



}
