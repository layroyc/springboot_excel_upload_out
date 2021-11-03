package com.wy.service;

import com.wy.bean.Express;
import com.wy.bean.ExpressExample;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

public interface ExpressService {
   
    long countByExample(ExpressExample example);

    int deleteByExample(ExpressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Express record);

    int insertSelective(Express record);

    List<Express> selectByExample(ExpressExample example);

    Express selectByPrimaryKey(Integer id);
  
    int updateByExampleSelective(@Param("record") Express record, @Param("example") ExpressExample example);

    int updateByExample(@Param("record") Express record, @Param("example") ExpressExample example);

    int updateByPrimaryKeySelective(Express record);

    int updateByPrimaryKey(Express record);

    //批量的插入 快递单号 日期
    void addListExpress(ArrayList<Express> data);
}
