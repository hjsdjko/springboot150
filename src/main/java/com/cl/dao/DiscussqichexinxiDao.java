package com.cl.dao;

import com.cl.entity.DiscussqichexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussqichexinxiView;


/**
 * 汽车信息评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-08 17:11:59
 */
public interface DiscussqichexinxiDao extends BaseMapper<DiscussqichexinxiEntity> {
	
	List<DiscussqichexinxiView> selectListView(@Param("ew") Wrapper<DiscussqichexinxiEntity> wrapper);

	List<DiscussqichexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussqichexinxiEntity> wrapper);
	
	DiscussqichexinxiView selectView(@Param("ew") Wrapper<DiscussqichexinxiEntity> wrapper);
	

}
