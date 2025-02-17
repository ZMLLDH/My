package com.entity.vo;

import com.entity.GuihaijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 归还记录
 * @author 
 * @email 
 * @date 2024-06-14 17:03:35
 */
public class GuihaijiluVO  implements Serializable {
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
	 * 归还时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date guihaishijian;
		
	/**
	 * 归还说明
	 */
	
	private String guihaishuoming;
		
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
	 * 设置：归还时间
	 */
	 
	public void setGuihaishijian(Date guihaishijian) {
		this.guihaishijian = guihaishijian;
	}
	
	/**
	 * 获取：归还时间
	 */
	public Date getGuihaishijian() {
		return guihaishijian;
	}
				
	
	/**
	 * 设置：归还说明
	 */
	 
	public void setGuihaishuoming(String guihaishuoming) {
		this.guihaishuoming = guihaishuoming;
	}
	
	/**
	 * 获取：归还说明
	 */
	public String getGuihaishuoming() {
		return guihaishuoming;
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
			
}
