package com.seed.seed_manage.dao;

import com.seed.seed_manage.bean.TbUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TbUserMapper {
    int deleteByPrimaryKey(Integer userno);

    int insert(TbUser record);

    int insertSelective(TbUser record);

    TbUser selectByPrimaryKey(Integer userno);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);

    TbUser loginWithPass(@Param("userName") String userName, @Param("password") String password);

    List <TbUser> getAll();
}