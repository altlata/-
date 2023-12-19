package com.entity.view;

import com.entity.ShuliangfenxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 数量分析
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-06 16:28:54
 */
@TableName("shuliangfenxi")
public class ShuliangfenxiView  extends ShuliangfenxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShuliangfenxiView(){
	}
 
 	public ShuliangfenxiView(ShuliangfenxiEntity shuliangfenxiEntity){
 	try {
			BeanUtils.copyProperties(this, shuliangfenxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
