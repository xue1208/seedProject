package com.seed.seed_manage.dao;

import com.seed.seed_manage.bean.TbDuty;

public interface TbDutyMapper {
    int deleteByPrimaryKey(Integer dutyid);

    int insert(TbDuty record);

    int insertSelective(TbDuty record);

    TbDuty selectByPrimaryKey(Integer dutyid);

    int updateByPrimaryKeySelective(TbDuty record);

    int updateByPrimaryKey(TbDuty record);
}