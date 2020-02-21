package com.seed.seed_manage.controller;

import com.seed.seed_manage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author Hero
 * @description com.seed.seed_manage.controller
 * @date 2020/2/21
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> login(@RequestParam("userName") String userName, @RequestParam("password") String password) {
        return userService.login(userName, password);
    }
}
