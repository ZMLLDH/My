package com.entity.vo;

import com.entity.BudongchandengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 不动产登记
 * @author 
 * @email 
 * @date 2024-06-14 17:03:35
 */
public class BudongchandengjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 不动产名称
	 */
	
	private String budongchanmingcheng;
		
	/**
	 * 不动产类型
	 */
	
	private String budongchanleixing;
		
	/**
	 * 所属权
	 */
	
	private String suoshuquan;
		
	/**
	 * 不动产情况
	 */
	
	private String budongchanqingkuang;
		
	/**
	 * 相关证件
	 */
	
	private String xiangguanzhengjian;
		
	/**
	 * 是否出租
	 */
	
	private String shifouchuzu;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
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
	 * 设置：不动产名称
	 */
	 
	public void setBudongchanmingcheng(String budongchanmingcheng) {
		this.budongchanmingcheng = budongchanmingcheng;
	}
	
	/**
	 * 获取：不动产名称
	 */
	public String getBudongchanmingcheng() {
		return budongchanmingcheng;
	}
				
	
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
	 * 设置：所属权
	 */
	 
	public void setSuoshuquan(String suoshuquan) {
		this.suoshuquan = suoshuquan;
	}
	
	/**
	 * 获取：所属权
	 */
	public String getSuoshuquan() {
		return suoshuquan;
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
	 * 设置：相关证件
	 */
	 
	public void setXiangguanzhengjian(String xiangguanzhengjian) {
		this.xiangguanzhengjian = xiangguanzhengjian;
	}
	
	/**
	 * 获取：相关证件
	 */
	public String getXiangguanzhengjian() {
		return xiangguanzhengjian;
	}
				
	
	/**
	 * 设置：是否出租
	 */
	 
	public void setShifouchuzu(String shifouchuzu) {
		this.shifouchuzu = shifouchuzu;
	}
	
	/**
	 * 获取：是否出租
	 */
	public String getShifouchuzu() {
		return shifouchuzu;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
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
