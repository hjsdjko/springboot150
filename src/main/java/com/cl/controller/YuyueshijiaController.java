package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.YuyueshijiaEntity;
import com.cl.entity.view.YuyueshijiaView;

import com.cl.service.YuyueshijiaService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 预约试驾
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-08 17:11:58
 */
@RestController
@RequestMapping("/yuyueshijia")
public class YuyueshijiaController {
    @Autowired
    private YuyueshijiaService yuyueshijiaService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YuyueshijiaEntity yuyueshijia,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("kehu")) {
			yuyueshijia.setKehuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xiaoshourenyuan")) {
			yuyueshijia.setXiaoshouzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YuyueshijiaEntity> ew = new EntityWrapper<YuyueshijiaEntity>();

		PageUtils page = yuyueshijiaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuyueshijia), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YuyueshijiaEntity yuyueshijia, 
		HttpServletRequest request){
        EntityWrapper<YuyueshijiaEntity> ew = new EntityWrapper<YuyueshijiaEntity>();

		PageUtils page = yuyueshijiaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuyueshijia), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YuyueshijiaEntity yuyueshijia){
       	EntityWrapper<YuyueshijiaEntity> ew = new EntityWrapper<YuyueshijiaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yuyueshijia, "yuyueshijia")); 
        return R.ok().put("data", yuyueshijiaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YuyueshijiaEntity yuyueshijia){
        EntityWrapper< YuyueshijiaEntity> ew = new EntityWrapper< YuyueshijiaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yuyueshijia, "yuyueshijia")); 
		YuyueshijiaView yuyueshijiaView =  yuyueshijiaService.selectView(ew);
		return R.ok("查询预约试驾成功").put("data", yuyueshijiaView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YuyueshijiaEntity yuyueshijia = yuyueshijiaService.selectById(id);
		yuyueshijia = yuyueshijiaService.selectView(new EntityWrapper<YuyueshijiaEntity>().eq("id", id));
        return R.ok().put("data", yuyueshijia);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YuyueshijiaEntity yuyueshijia = yuyueshijiaService.selectById(id);
		yuyueshijia = yuyueshijiaService.selectView(new EntityWrapper<YuyueshijiaEntity>().eq("id", id));
        return R.ok().put("data", yuyueshijia);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YuyueshijiaEntity yuyueshijia, HttpServletRequest request){
    	yuyueshijia.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yuyueshijia);
        yuyueshijiaService.insert(yuyueshijia);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YuyueshijiaEntity yuyueshijia, HttpServletRequest request){
    	yuyueshijia.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yuyueshijia);
        yuyueshijiaService.insert(yuyueshijia);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YuyueshijiaEntity yuyueshijia, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yuyueshijia);
        yuyueshijiaService.updateById(yuyueshijia);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<YuyueshijiaEntity> list = new ArrayList<YuyueshijiaEntity>();
        for(Long id : ids) {
            YuyueshijiaEntity yuyueshijia = yuyueshijiaService.selectById(id);
            yuyueshijia.setSfsh(sfsh);
            yuyueshijia.setShhf(shhf);
            list.add(yuyueshijia);
        }
        yuyueshijiaService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yuyueshijiaService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
