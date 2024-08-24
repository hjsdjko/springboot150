package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.YuyueshijiaEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YuyueshijiaView;


/**
 * 预约试驾
 *
 * @author 
 * @email 
 * @date 2024-03-08 17:11:58
 */
public interface YuyueshijiaService extends IService<YuyueshijiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuyueshijiaView> selectListView(Wrapper<YuyueshijiaEntity> wrapper);
   	
   	YuyueshijiaView selectView(@Param("ew") Wrapper<YuyueshijiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuyueshijiaEntity> wrapper);
   	

}

