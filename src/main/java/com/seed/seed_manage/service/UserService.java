package com.seed.seed_manage.service;

import com.seed.seed_manage.bean.TbUser;
import com.seed.seed_manage.dao.TbEmpMapper;
import com.seed.seed_manage.dao.TbUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Hero
 * @description com.seed.seed_manage.service
 * @date 2020/2/21
 */
@Service
public class UserService {

    @Autowired
    TbUserMapper tbUserMapper;



    @Autowired
    TbEmpMapper tbEmpMapper;

    public Map<String, Object> login(String userName, String userPassword) {
        Map<String, Object> map = new HashMap<>();
        TbUser tbUser = tbUserMapper.selectByPrimaryKey(1212);
        //tbEmpMapper.deleteByPrimaryKey(12346);
        map.put("tbUser", tbUser);
        return map;
    }
}
