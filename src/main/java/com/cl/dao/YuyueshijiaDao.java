package com.cl.dao;

import com.cl.entity.YuyueshijiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YuyueshijiaView;


/**
 * 预约试驾
 * 
 * @author 
 * @email 
 * @date 2024-03-08 17:11:58
 */
public interface YuyueshijiaDao extends BaseMapper<YuyueshijiaEntity> {
	
	List<YuyueshijiaView> selectListView(@Param("ew") Wrapper<YuyueshijiaEntity> wrapper);

	List<YuyueshijiaView> selectListView(Pagination page,@Param("ew") Wrapper<YuyueshijiaEntity> wrapper);
	
	YuyueshijiaView selectView(@Param("ew") Wrapper<YuyueshijiaEntity> wrapper);
	

}
