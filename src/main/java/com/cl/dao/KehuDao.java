package com.cl.dao;

import com.cl.entity.KehuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.KehuView;


/**
 * 客户
 * 
 * @author 
 * @email 
 * @date 2024-03-08 17:11:58
 */
public interface KehuDao extends BaseMapper<KehuEntity> {
	
	List<KehuView> selectListView(@Param("ew") Wrapper<KehuEntity> wrapper);

	List<KehuView> selectListView(Pagination page,@Param("ew") Wrapper<KehuEntity> wrapper);
	
	KehuView selectView(@Param("ew") Wrapper<KehuEntity> wrapper);
	

}
