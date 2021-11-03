package com.wy.service;

import com.wy.bean.Express;
import com.wy.bean.ExpressExample;
import com.wy.dao.ExpressDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("expressService")
public class ExpressServiceImpl implements ExpressService{
	@Autowired(required = false)
	private ExpressDAO expressDAO;
	public long countByExample(ExpressExample example){
    	return expressDAO.countByExample(example);
    }

	public int deleteByExample(ExpressExample example){
    	return expressDAO.deleteByExample(example);
    }

	public int deleteByPrimaryKey(Integer id){
    	return expressDAO.deleteByPrimaryKey(id);
    }

	public int insert(Express record){
    	return expressDAO.insert(record);
    }

	public int insertSelective(Express record){
    	return expressDAO.insertSelective(record);
    }

	public List<Express> selectByExample(ExpressExample example){
    	return expressDAO.selectByExample(example);
    }

	public Express selectByPrimaryKey(Integer id){
    	return expressDAO.selectByPrimaryKey(id);
    }
  
	public int updateByExampleSelective(Express record, ExpressExample example){
    	return expressDAO.updateByExampleSelective(record, example);
    }

	public int updateByExample(Express record, ExpressExample example){
    	return expressDAO.updateByExample(record, example);
    }

	public int updateByPrimaryKeySelective(Express record){
    	return expressDAO.updateByPrimaryKeySelective(record);
    }

	public int updateByPrimaryKey(Express record){
    	return expressDAO.updateByPrimaryKey(record);
    }

	@Override
	//批量的插入 快递单号 日期
	public void addListExpress(ArrayList<Express> list) {
		for (Express setting : list) {
			//做校验
			expressDAO.insert(setting);
		}
	}


}
