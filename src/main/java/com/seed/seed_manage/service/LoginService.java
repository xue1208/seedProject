package com.seed.seed_manage.service;

import com.seed.seed_manage.bean.TbEmp;
import com.seed.seed_manage.dao.TbEmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    TbEmpMapper tbEmpMapper;

    public TbEmp get(String empno, String password)
    {
        TbEmp tbEmp = tbEmpMapper.get(empno,password);
        return  tbEmp;
    }
}
