package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.QichexinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.QichexinxiView;


/**
 * 汽车信息
 *
 * @author 
 * @email 
 * @date 2024-03-08 17:11:58
 */
public interface QichexinxiService extends IService<QichexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QichexinxiView> selectListView(Wrapper<QichexinxiEntity> wrapper);
   	
   	QichexinxiView selectView(@Param("ew") Wrapper<QichexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QichexinxiEntity> wrapper);
   	

}

