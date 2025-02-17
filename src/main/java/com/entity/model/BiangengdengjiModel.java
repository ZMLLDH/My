package com.entity.model;

import com.entity.BiangengdengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 变更登记
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-06-14 17:03:35
 */
public class BiangengdengjiModel  implements Serializable {
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
	 * 变更情况
	 */
	
	private String biangengqingkuang;
		
	/**
	 * 变更证件
	 */
	
	private String biangengzhengjian;
		
	/**
	 * 变更时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date biangengshijian;
		
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
	 * 设置：变更情况
	 */
	 
	public void setBiangengqingkuang(String biangengqingkuang) {
		this.biangengqingkuang = biangengqingkuang;
	}
	
	/**
	 * 获取：变更情况
	 */
	public String getBiangengqingkuang() {
		return biangengqingkuang;
	}
				
	
	/**
	 * 设置：变更证件
	 */
	 
	public void setBiangengzhengjian(String biangengzhengjian) {
		this.biangengzhengjian = biangengzhengjian;
	}
	
	/**
	 * 获取：变更证件
	 */
	public String getBiangengzhengjian() {
		return biangengzhengjian;
	}
				
	
	/**
	 * 设置：变更时间
	 */
	 
	public void setBiangengshijian(Date biangengshijian) {
		this.biangengshijian = biangengshijian;
	}
	
	/**
	 * 获取：变更时间
	 */
	public Date getBiangengshijian() {
		return biangengshijian;
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
