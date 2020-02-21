package com.seed.seed_manage.dao;

import com.seed.seed_manage.bean.ToSendmessage;

public interface ToSendmessageMapper {
    int deleteByPrimaryKey(Integer sendid);

    int insert(ToSendmessage record);

    int insertSelective(ToSendmessage record);

    ToSendmessage selectByPrimaryKey(Integer sendid);

    int updateByPrimaryKeySelective(ToSendmessage record);

    int updateByPrimaryKey(ToSendmessage record);
}