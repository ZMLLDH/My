package com.entity.model;

import com.entity.BudongchanzulinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 不动产租赁
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-06-14 17:03:35
 */
public class BudongchanzulinModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 不动产类型
	 */
	
	private String budongchanleixing;
		
	/**
	 * 不动产状态
	 */
	
	private String budongchanzhuangtai;
		
	/**
	 * 不动产情况
	 */
	
	private String budongchanqingkuang;
		
	/**
	 * 经度
	 */
	
	private Double longitude;
		
	/**
	 * 纬度
	 */
	
	private Double latitude;
		
	/**
	 * 地址
	 */
	
	private String fulladdress;
				
	
	/**
	 * 设置：不动产类型
	 */
	 
	public void setBudongchanleixing(String budongchanleixing) {
		this.budongchanleixing = budongchanleixing;
	}
	
	/**
	 * 获取：不动产类型
	 */
	public String getBudongchanleixing() {
		return budongchanleixing;
	}
				
	
	/**
	 * 设置：不动产状态
	 */
	 
	public void setBudongchanzhuangtai(String budongchanzhuangtai) {
		this.budongchanzhuangtai = budongchanzhuangtai;
	}
	
	/**
	 * 获取：不动产状态
	 */
	public String getBudongchanzhuangtai() {
		return budongchanzhuangtai;
	}
				
	
	/**
	 * 设置：不动产情况
	 */
	 
	public void setBudongchanqingkuang(String budongchanqingkuang) {
		this.budongchanqingkuang = budongchanqingkuang;
	}
	
	/**
	 * 获取：不动产情况
	 */
	public String getBudongchanqingkuang() {
		return budongchanqingkuang;
	}
				
	
	/**
	 * 设置：经度
	 */
	 
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	/**
	 * 获取：经度
	 */
	public Double getLongitude() {
		return longitude;
	}
				
	
	/**
	 * 设置：纬度
	 */
	 
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	
	/**
	 * 获取：纬度
	 */
	public Double getLatitude() {
		return latitude;
	}
				
	
	/**
	 * 设置：地址
	 */
	 
	public void setFulladdress(String fulladdress) {
		this.fulladdress = fulladdress;
	}
	
	/**
	 * 获取：地址
	 */
	public String getFulladdress() {
		return fulladdress;
	}
			
}
