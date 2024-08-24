package com.cl.dao;

import com.cl.entity.QichexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.QichexinxiView;


/**
 * 汽车信息
 * 
 * @author 
 * @email 
 * @date 2024-03-08 17:11:58
 */
public interface QichexinxiDao extends BaseMapper<QichexinxiEntity> {
	
	List<QichexinxiView> selectListView(@Param("ew") Wrapper<QichexinxiEntity> wrapper);

	List<QichexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<QichexinxiEntity> wrapper);
	
	QichexinxiView selectView(@Param("ew") Wrapper<QichexinxiEntity> wrapper);
	

}
