package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 变更登记
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-06-14 17:03:35
 */
@TableName("biangengdengji")
public class BiangengdengjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BiangengdengjiEntity() {
		
	}
	
	public BiangengdengjiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 业务编号
	 */
					
	private String yewubianhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：业务编号
	 */
	public void setYewubianhao(String yewubianhao) {
		this.yewubianhao = yewubianhao;
	}
	/**
	 * 获取：业务编号
	 */
	public String getYewubianhao() {
		return yewubianhao;
	}
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
