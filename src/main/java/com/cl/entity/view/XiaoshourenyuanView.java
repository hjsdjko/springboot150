package com.cl.entity.view;

import com.cl.entity.XiaoshourenyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 销售人员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-08 17:11:58
 */
@TableName("xiaoshourenyuan")
public class XiaoshourenyuanView  extends XiaoshourenyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoshourenyuanView(){
	}
 
 	public XiaoshourenyuanView(XiaoshourenyuanEntity xiaoshourenyuanEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoshourenyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
