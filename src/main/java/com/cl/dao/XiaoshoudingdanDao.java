package com.cl.dao;

import com.cl.entity.XiaoshoudingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XiaoshoudingdanView;


/**
 * 销售订单
 * 
 * @author 
 * @email 
 * @date 2024-03-08 17:11:58
 */
public interface XiaoshoudingdanDao extends BaseMapper<XiaoshoudingdanEntity> {
	
	List<XiaoshoudingdanView> selectListView(@Param("ew") Wrapper<XiaoshoudingdanEntity> wrapper);

	List<XiaoshoudingdanView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoshoudingdanEntity> wrapper);
	
	XiaoshoudingdanView selectView(@Param("ew") Wrapper<XiaoshoudingdanEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XiaoshoudingdanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XiaoshoudingdanEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XiaoshoudingdanEntity> wrapper);



}
