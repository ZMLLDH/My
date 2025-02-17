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

import com.entity.BudongchanleixingEntity;
import com.entity.view.BudongchanleixingView;

import com.service.BudongchanleixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 不动产类型
 * 后端接口
 * @author 
 * @email 
 * @date 2024-06-14 17:03:35
 */
@RestController
@RequestMapping("/budongchanleixing")
public class BudongchanleixingController {
    @Autowired
    private BudongchanleixingService budongchanleixingService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BudongchanleixingEntity budongchanleixing,
		HttpServletRequest request){
        EntityWrapper<BudongchanleixingEntity> ew = new EntityWrapper<BudongchanleixingEntity>();

		PageUtils page = budongchanleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, budongchanleixing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BudongchanleixingEntity budongchanleixing, 
		HttpServletRequest request){
        EntityWrapper<BudongchanleixingEntity> ew = new EntityWrapper<BudongchanleixingEntity>();

		PageUtils page = budongchanleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, budongchanleixing), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BudongchanleixingEntity budongchanleixing){
       	EntityWrapper<BudongchanleixingEntity> ew = new EntityWrapper<BudongchanleixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( budongchanleixing, "budongchanleixing")); 
        return R.ok().put("data", budongchanleixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BudongchanleixingEntity budongchanleixing){
        EntityWrapper< BudongchanleixingEntity> ew = new EntityWrapper< BudongchanleixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( budongchanleixing, "budongchanleixing")); 
		BudongchanleixingView budongchanleixingView =  budongchanleixingService.selectView(ew);
		return R.ok("查询不动产类型成功").put("data", budongchanleixingView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BudongchanleixingEntity budongchanleixing = budongchanleixingService.selectById(id);
        return R.ok().put("data", budongchanleixing);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BudongchanleixingEntity budongchanleixing = budongchanleixingService.selectById(id);
        return R.ok().put("data", budongchanleixing);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BudongchanleixingEntity budongchanleixing, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(budongchanleixing);
        budongchanleixingService.insert(budongchanleixing);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BudongchanleixingEntity budongchanleixing, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(budongchanleixing);
        budongchanleixingService.insert(budongchanleixing);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody BudongchanleixingEntity budongchanleixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(budongchanleixing);
        budongchanleixingService.updateById(budongchanleixing);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        budongchanleixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
