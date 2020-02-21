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

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@RequestMapping("/seedproject")

public class LoginController {

    // todo 这种model一般不用autowired，哪里需要用哪里
    /*@Autowired
    TbEmp tbEmp;*/

    @Autowired
    LoginService loginService;

    @Autowired
    HttpSession session;

    @RequestMapping(value = "/login" , method = RequestMethod.POST)
    public String Login(@RequestParam("empno") String empno, @RequestParam("password") String password,
                        HttpServletResponse response) {
        TbEmp tbEmp = loginService.get(empno,password);
        if (tbEmp != null)
        {
         session.setAttribute("empno",empno);
         ModelAndView modelAndView;
         return "index";
        }
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        try (PrintWriter pw = response.getWriter()) {
            pw.write("用户不存在");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }



}
