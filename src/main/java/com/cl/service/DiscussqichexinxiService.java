package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscussqichexinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussqichexinxiView;


/**
 * 汽车信息评论表
 *
 * @author 
 * @email 
 * @date 2024-03-08 17:11:59
 */
public interface DiscussqichexinxiService extends IService<DiscussqichexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussqichexinxiView> selectListView(Wrapper<DiscussqichexinxiEntity> wrapper);
   	
   	DiscussqichexinxiView selectView(@Param("ew") Wrapper<DiscussqichexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussqichexinxiEntity> wrapper);
   	

}

