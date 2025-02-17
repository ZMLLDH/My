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
 * 租用记录
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-06-14 17:03:35
 */
@TableName("zuyongjilu")
public class ZuyongjiluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZuyongjiluEntity() {
		
	}
	
	public ZuyongjiluEntity(T t) {
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
	 * 不动产名称
	 */
					
	private String budongchanmingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
