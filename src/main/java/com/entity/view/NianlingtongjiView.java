package com.entity.view;

import com.entity.NianlingtongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 年龄统计
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-06 16:28:54
 */
@TableName("nianlingtongji")
public class NianlingtongjiView  extends NianlingtongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public NianlingtongjiView(){
	}
 
 	public NianlingtongjiView(NianlingtongjiEntity nianlingtongjiEntity){
 	try {
			BeanUtils.copyProperties(this, nianlingtongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
