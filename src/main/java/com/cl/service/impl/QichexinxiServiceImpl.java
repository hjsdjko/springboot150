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


import com.cl.dao.QichexinxiDao;
import com.cl.entity.QichexinxiEntity;
import com.cl.service.QichexinxiService;
import com.cl.entity.view.QichexinxiView;

@Service("qichexinxiService")
public class QichexinxiServiceImpl extends ServiceImpl<QichexinxiDao, QichexinxiEntity> implements QichexinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QichexinxiEntity> page = this.selectPage(
                new Query<QichexinxiEntity>(params).getPage(),
                new EntityWrapper<QichexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QichexinxiEntity> wrapper) {
		  Page<QichexinxiView> page =new Query<QichexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<QichexinxiView> selectListView(Wrapper<QichexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QichexinxiView selectView(Wrapper<QichexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
