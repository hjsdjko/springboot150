package com.cl.dao;

import com.cl.entity.QicheleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.QicheleixingView;


/**
 * 汽车类型
 * 
 * @author 
 * @email 
 * @date 2024-03-08 17:11:58
 */
public interface QicheleixingDao extends BaseMapper<QicheleixingEntity> {
	
	List<QicheleixingView> selectListView(@Param("ew") Wrapper<QicheleixingEntity> wrapper);

	List<QicheleixingView> selectListView(Pagination page,@Param("ew") Wrapper<QicheleixingEntity> wrapper);
	
	QicheleixingView selectView(@Param("ew") Wrapper<QicheleixingEntity> wrapper);
	

}
