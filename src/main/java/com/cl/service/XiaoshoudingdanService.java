package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.XiaoshoudingdanEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XiaoshoudingdanView;


/**
 * 销售订单
 *
 * @author 
 * @email 
 * @date 2024-03-08 17:11:58
 */
public interface XiaoshoudingdanService extends IService<XiaoshoudingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoshoudingdanView> selectListView(Wrapper<XiaoshoudingdanEntity> wrapper);
   	
   	XiaoshoudingdanView selectView(@Param("ew") Wrapper<XiaoshoudingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoshoudingdanEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<XiaoshoudingdanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<XiaoshoudingdanEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<XiaoshoudingdanEntity> wrapper);



}

