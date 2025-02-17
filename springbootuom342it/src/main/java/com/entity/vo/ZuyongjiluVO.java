package com.entity.vo;

import com.entity.ZuyongjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 租用记录
 * @author 
 * @email 
 * @date 2024-06-14 17:03:35
 */
public class ZuyongjiluVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 不动产类型
	 */
	
	private String budongchanleixing;
		
	/**
	 * 不动产情况
	 */
	
	private String budongchanqingkuang;
		
	/**
	 * 租用时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date zuyongshijian;
		
	/**
	 * 租用说明
	 */
	
	private String zuyongshuoming;
		
	/**
	 * 归还状态
	 */
	
	private String guihaizhuangtai;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
				
	
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
	 * 设置：租用时间
	 */
	 
	public void setZuyongshijian(Date zuyongshijian) {
		this.zuyongshijian = zuyongshijian;
	}
	
	/**
	 * 获取：租用时间
	 */
	public Date getZuyongshijian() {
		return zuyongshijian;
	}
				
	
	/**
	 * 设置：租用说明
	 */
	 
	public void setZuyongshuoming(String zuyongshuoming) {
		this.zuyongshuoming = zuyongshuoming;
	}
	
	/**
	 * 获取：租用说明
	 */
	public String getZuyongshuoming() {
		return zuyongshuoming;
	}
				
	
	/**
	 * 设置：归还状态
	 */
	 
	public void setGuihaizhuangtai(String guihaizhuangtai) {
		this.guihaizhuangtai = guihaizhuangtai;
	}
	
	/**
	 * 获取：归还状态
	 */
	public String getGuihaizhuangtai() {
		return guihaizhuangtai;
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
			
}
