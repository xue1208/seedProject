package com.seed.seed_manage.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.seed.seed_manage.bean.TbEmp;
import com.seed.seed_manage.dao.TbEmpMapper;
import com.seed.seed_manage.service.SendMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.List;

@Controller
public class MessageCotroller {

    @Autowired
    SendMessageService sendMessageService;
    @RequestMapping("/sendxiaoxi")
    public String getPeple(HttpServletRequest request, HttpServletResponse response) throws IOException {


        String flag = request.getParameter("flag");
        HttpSession session = request.getSession();
        PrintWriter out = response.getWriter();
        switch (flag)
        {
            case "getpeople":
                List<TbEmp> list = sendMessageService.getAllemp(request.getSession());
                ObjectMapper mapper = new ObjectMapper();
                String json = mapper.writeValueAsString(list);
                out.println(json);
                break;
            case "发送":
                Timestamp ts = new Timestamp(System.currentTimeMillis());
                String messageTitle = request.getParameter("messageTitle");
                String receiver[] = request.getParameterValues("cbkname");
                String messageContent= request.getParameter("messageContent");


                break;
        }
     return "";
    }
}
