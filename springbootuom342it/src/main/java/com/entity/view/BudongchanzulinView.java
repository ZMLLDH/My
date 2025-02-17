package com.entity.view;

import com.entity.BudongchanzulinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 不动产租赁
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-06-14 17:03:35
 */
@TableName("budongchanzulin")
public class BudongchanzulinView  extends BudongchanzulinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BudongchanzulinView(){
	}
 
 	public BudongchanzulinView(BudongchanzulinEntity budongchanzulinEntity){
 	try {
			BeanUtils.copyProperties(this, budongchanzulinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
