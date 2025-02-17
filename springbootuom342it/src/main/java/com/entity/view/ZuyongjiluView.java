package com.entity.view;

import com.entity.ZuyongjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 租用记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-06-14 17:03:35
 */
@TableName("zuyongjilu")
public class ZuyongjiluView  extends ZuyongjiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZuyongjiluView(){
	}
 
 	public ZuyongjiluView(ZuyongjiluEntity zuyongjiluEntity){
 	try {
			BeanUtils.copyProperties(this, zuyongjiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
