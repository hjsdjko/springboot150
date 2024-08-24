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


import com.cl.dao.XiaoshourenyuanDao;
import com.cl.entity.XiaoshourenyuanEntity;
import com.cl.service.XiaoshourenyuanService;
import com.cl.entity.view.XiaoshourenyuanView;

@Service("xiaoshourenyuanService")
public class XiaoshourenyuanServiceImpl extends ServiceImpl<XiaoshourenyuanDao, XiaoshourenyuanEntity> implements XiaoshourenyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoshourenyuanEntity> page = this.selectPage(
                new Query<XiaoshourenyuanEntity>(params).getPage(),
                new EntityWrapper<XiaoshourenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoshourenyuanEntity> wrapper) {
		  Page<XiaoshourenyuanView> page =new Query<XiaoshourenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<XiaoshourenyuanView> selectListView(Wrapper<XiaoshourenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoshourenyuanView selectView(Wrapper<XiaoshourenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
