package com.cl.dao;

import com.cl.entity.XiaoshourenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XiaoshourenyuanView;


/**
 * 销售人员
 * 
 * @author 
 * @email 
 * @date 2024-03-08 17:11:58
 */
public interface XiaoshourenyuanDao extends BaseMapper<XiaoshourenyuanEntity> {
	
	List<XiaoshourenyuanView> selectListView(@Param("ew") Wrapper<XiaoshourenyuanEntity> wrapper);

	List<XiaoshourenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoshourenyuanEntity> wrapper);
	
	XiaoshourenyuanView selectView(@Param("ew") Wrapper<XiaoshourenyuanEntity> wrapper);
	

}
