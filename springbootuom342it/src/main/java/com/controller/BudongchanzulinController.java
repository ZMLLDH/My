package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.BudongchanzulinEntity;
import com.entity.view.BudongchanzulinView;

import com.service.BudongchanzulinService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 不动产租赁
 * 后端接口
 * @author 
 * @email 
 * @date 2024-06-14 17:03:35
 */
@RestController
@RequestMapping("/budongchanzulin")
public class BudongchanzulinController {
    @Autowired
    private BudongchanzulinService budongchanzulinService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BudongchanzulinEntity budongchanzulin,
		HttpServletRequest request){
        EntityWrapper<BudongchanzulinEntity> ew = new EntityWrapper<BudongchanzulinEntity>();

		PageUtils page = budongchanzulinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, budongchanzulin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BudongchanzulinEntity budongchanzulin, 
		HttpServletRequest request){
        EntityWrapper<BudongchanzulinEntity> ew = new EntityWrapper<BudongchanzulinEntity>();

		PageUtils page = budongchanzulinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, budongchanzulin), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BudongchanzulinEntity budongchanzulin){
       	EntityWrapper<BudongchanzulinEntity> ew = new EntityWrapper<BudongchanzulinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( budongchanzulin, "budongchanzulin")); 
        return R.ok().put("data", budongchanzulinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BudongchanzulinEntity budongchanzulin){
        EntityWrapper< BudongchanzulinEntity> ew = new EntityWrapper< BudongchanzulinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( budongchanzulin, "budongchanzulin")); 
		BudongchanzulinView budongchanzulinView =  budongchanzulinService.selectView(ew);
		return R.ok("查询不动产租赁成功").put("data", budongchanzulinView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BudongchanzulinEntity budongchanzulin = budongchanzulinService.selectById(id);
        return R.ok().put("data", budongchanzulin);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BudongchanzulinEntity budongchanzulin = budongchanzulinService.selectById(id);
        return R.ok().put("data", budongchanzulin);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BudongchanzulinEntity budongchanzulin, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(budongchanzulin);
        budongchanzulinService.insert(budongchanzulin);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BudongchanzulinEntity budongchanzulin, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(budongchanzulin);
        budongchanzulinService.insert(budongchanzulin);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody BudongchanzulinEntity budongchanzulin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(budongchanzulin);
        budongchanzulinService.updateById(budongchanzulin);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        budongchanzulinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
