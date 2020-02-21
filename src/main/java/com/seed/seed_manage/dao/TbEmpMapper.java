package com.seed.seed_manage.dao;

import com.seed.seed_manage.bean.TbEmp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TbEmpMapper {
    int deleteByPrimaryKey(Integer empid);

    int insert(TbEmp record);

    int insertSelective(TbEmp record);

    TbEmp selectByPrimaryKey(Integer empid);

    int updateByPrimaryKeySelective(TbEmp record);

    int updateByPrimaryKey(TbEmp record);

    TbEmp get(@Param("empno") String empno,@Param("password") String password);

    List<TbEmp> getAll();
}