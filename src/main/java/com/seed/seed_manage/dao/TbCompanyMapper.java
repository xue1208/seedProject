package com.seed.seed_manage.dao;

import com.seed.seed_manage.bean.TbCompany;

public interface TbCompanyMapper {
    int deleteByPrimaryKey(Integer companyid);

    int insert(TbCompany record);

    int insertSelective(TbCompany record);

    TbCompany selectByPrimaryKey(Integer companyid);

    int updateByPrimaryKeySelective(TbCompany record);

    int updateByPrimaryKey(TbCompany record);
}