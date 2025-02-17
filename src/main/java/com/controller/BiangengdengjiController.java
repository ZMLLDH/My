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

import com.entity.BiangengdengjiEntity;
import com.entity.view.BiangengdengjiView;

import com.service.BiangengdengjiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 变更登记
 * 后端接口
 * @author 
 * @email 
 * @date 2024-06-14 17:03:35
 */
@RestController
@RequestMapping("/biangengdengji")
public class BiangengdengjiController {
    @Autowired
    private BiangengdengjiService biangengdengjiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BiangengdengjiEntity biangengdengji,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			biangengdengji.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<BiangengdengjiEntity> ew = new EntityWrapper<BiangengdengjiEntity>();

		PageUtils page = biangengdengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, biangengdengji), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BiangengdengjiEntity biangengdengji, 
		HttpServletRequest request){
        EntityWrapper<BiangengdengjiEntity> ew = new EntityWrapper<BiangengdengjiEntity>();

		PageUtils page = biangengdengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, biangengdengji), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BiangengdengjiEntity biangengdengji){
       	EntityWrapper<BiangengdengjiEntity> ew = new EntityWrapper<BiangengdengjiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( biangengdengji, "biangengdengji")); 
        return R.ok().put("data", biangengdengjiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BiangengdengjiEntity biangengdengji){
        EntityWrapper< BiangengdengjiEntity> ew = new EntityWrapper< BiangengdengjiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( biangengdengji, "biangengdengji")); 
		BiangengdengjiView biangengdengjiView =  biangengdengjiService.selectView(ew);
		return R.ok("查询变更登记成功").put("data", biangengdengjiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BiangengdengjiEntity biangengdengji = biangengdengjiService.selectById(id);
        return R.ok().put("data", biangengdengji);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BiangengdengjiEntity biangengdengji = biangengdengjiService.selectById(id);
        return R.ok().put("data", biangengdengji);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BiangengdengjiEntity biangengdengji, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(biangengdengji);
        biangengdengjiService.insert(biangengdengji);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BiangengdengjiEntity biangengdengji, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(biangengdengji);
        biangengdengjiService.insert(biangengdengji);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody BiangengdengjiEntity biangengdengji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(biangengdengji);
        biangengdengjiService.updateById(biangengdengji);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<BiangengdengjiEntity> list = new ArrayList<BiangengdengjiEntity>();
        for(Long id : ids) {
            BiangengdengjiEntity biangengdengji = biangengdengjiService.selectById(id);
            biangengdengji.setSfsh(sfsh);
            biangengdengji.setShhf(shhf);
            list.add(biangengdengji);
        }
        biangengdengjiService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        biangengdengjiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
