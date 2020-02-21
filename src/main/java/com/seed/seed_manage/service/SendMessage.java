package com.seed.seed_manage.service;

import com.seed.seed_manage.bean.TbEmp;
import com.seed.seed_manage.dao.TbEmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class SendMessage {
    @Autowired
    TbEmp tbEmp;
    @Autowired
    TbEmpMapper tbEmpMapper ;
    @Autowired
    HttpSession session;
    public List<TbEmp> getAllemp()
    {
        List<TbEmp> list = tbEmpMapper.getAll();
        list.remove(session.getAttribute("empno"));
    }
}
