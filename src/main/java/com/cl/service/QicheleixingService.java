package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.QicheleixingEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.QicheleixingView;


/**
 * 汽车类型
 *
 * @author 
 * @email 
 * @date 2024-03-08 17:11:58
 */
public interface QicheleixingService extends IService<QicheleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QicheleixingView> selectListView(Wrapper<QicheleixingEntity> wrapper);
   	
   	QicheleixingView selectView(@Param("ew") Wrapper<QicheleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QicheleixingEntity> wrapper);
   	

}

