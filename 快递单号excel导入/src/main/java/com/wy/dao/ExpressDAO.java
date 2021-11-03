package com.wy.dao;

import com.wy.bean.Express;
import com.wy.bean.ExpressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExpressDAO {
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
}