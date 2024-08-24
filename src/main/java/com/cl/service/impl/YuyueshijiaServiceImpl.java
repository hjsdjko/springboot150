package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.YuyueshijiaDao;
import com.cl.entity.YuyueshijiaEntity;
import com.cl.service.YuyueshijiaService;
import com.cl.entity.view.YuyueshijiaView;

@Service("yuyueshijiaService")
public class YuyueshijiaServiceImpl extends ServiceImpl<YuyueshijiaDao, YuyueshijiaEntity> implements YuyueshijiaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuyueshijiaEntity> page = this.selectPage(
                new Query<YuyueshijiaEntity>(params).getPage(),
                new EntityWrapper<YuyueshijiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuyueshijiaEntity> wrapper) {
		  Page<YuyueshijiaView> page =new Query<YuyueshijiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<YuyueshijiaView> selectListView(Wrapper<YuyueshijiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuyueshijiaView selectView(Wrapper<YuyueshijiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
