package com.seed.seed_manage.dao;

import com.seed.seed_manage.bean.ToReceivemessage;

public interface ToReceivemessageMapper {
    int deleteByPrimaryKey(Integer receiveid);

    int insert(ToReceivemessage record);

    int insertSelective(ToReceivemessage record);

    ToReceivemessage selectByPrimaryKey(Integer receiveid);

    int updateByPrimaryKeySelective(ToReceivemessage record);

    int updateByPrimaryKey(ToReceivemessage record);
}