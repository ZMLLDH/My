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

import com.entity.BudongchandengjiEntity;
import com.entity.view.BudongchandengjiView;

import com.service.BudongchandengjiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 不动产登记
 * 后端接口
 * @author 
 * @email 
 * @date 2024-06-14 17:03:35
 */
@RestController
@RequestMapping("/budongchandengji")
public class BudongchandengjiController {
    @Autowired
    private BudongchandengjiService budongchandengjiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BudongchandengjiEntity budongchandengji,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			budongchandengji.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<BudongchandengjiEntity> ew = new EntityWrapper<BudongchandengjiEntity>();

		PageUtils page = budongchandengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, budongchandengji), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BudongchandengjiEntity budongchandengji, 
		HttpServletRequest request){
        EntityWrapper<BudongchandengjiEntity> ew = new EntityWrapper<BudongchandengjiEntity>();

		PageUtils page = budongchandengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, budongchandengji), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BudongchandengjiEntity budongchandengji){
       	EntityWrapper<BudongchandengjiEntity> ew = new EntityWrapper<BudongchandengjiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( budongchandengji, "budongchandengji")); 
        return R.ok().put("data", budongchandengjiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BudongchandengjiEntity budongchandengji){
        EntityWrapper< BudongchandengjiEntity> ew = new EntityWrapper< BudongchandengjiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( budongchandengji, "budongchandengji")); 
		BudongchandengjiView budongchandengjiView =  budongchandengjiService.selectView(ew);
		return R.ok("查询不动产登记成功").put("data", budongchandengjiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BudongchandengjiEntity budongchandengji = budongchandengjiService.selectById(id);
        return R.ok().put("data", budongchandengji);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BudongchandengjiEntity budongchandengji = budongchandengjiService.selectById(id);
        return R.ok().put("data", budongchandengji);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BudongchandengjiEntity budongchandengji, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(budongchandengji);
        budongchandengjiService.insert(budongchandengji);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BudongchandengjiEntity budongchandengji, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(budongchandengji);
        budongchandengjiService.insert(budongchandengji);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody BudongchandengjiEntity budongchandengji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(budongchandengji);
        budongchandengjiService.updateById(budongchandengji);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<BudongchandengjiEntity> list = new ArrayList<BudongchandengjiEntity>();
        for(Long id : ids) {
            BudongchandengjiEntity budongchandengji = budongchandengjiService.selectById(id);
            budongchandengji.setSfsh(sfsh);
            budongchandengji.setShhf(shhf);
            list.add(budongchandengji);
        }
        budongchandengjiService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        budongchandengjiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
