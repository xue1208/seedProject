package com.seed.seed_manage.service;

import com.seed.seed_manage.bean.TbEmp;
import com.seed.seed_manage.dao.TbEmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class SendMessageService {

    @Autowired
    TbEmpMapper tbEmpMapper ;


    public List<TbEmp> getAllemp(HttpSession session )
    {
        TbEmp tbEmp;
        List<TbEmp> list = tbEmpMapper.getAll();
        String password = (String) session.getAttribute("password");
        String empno = (String) session.getAttribute("empno");
        TbEmp emp = tbEmpMapper.get(empno,password);
        int id = emp.getEmpid();
        list.remove(id);
        return  list;

    }

}
