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

import com.entity.GuihaijiluEntity;
import com.entity.view.GuihaijiluView;

import com.service.GuihaijiluService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 归还记录
 * 后端接口
 * @author 
 * @email 
 * @date 2024-06-14 17:03:35
 */
@RestController
@RequestMapping("/guihaijilu")
public class GuihaijiluController {
    @Autowired
    private GuihaijiluService guihaijiluService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GuihaijiluEntity guihaijilu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			guihaijilu.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<GuihaijiluEntity> ew = new EntityWrapper<GuihaijiluEntity>();

		PageUtils page = guihaijiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, guihaijilu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GuihaijiluEntity guihaijilu, 
		HttpServletRequest request){
        EntityWrapper<GuihaijiluEntity> ew = new EntityWrapper<GuihaijiluEntity>();

		PageUtils page = guihaijiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, guihaijilu), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GuihaijiluEntity guihaijilu){
       	EntityWrapper<GuihaijiluEntity> ew = new EntityWrapper<GuihaijiluEntity>();
      	ew.allEq(MPUtil.allEQMapPre( guihaijilu, "guihaijilu")); 
        return R.ok().put("data", guihaijiluService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GuihaijiluEntity guihaijilu){
        EntityWrapper< GuihaijiluEntity> ew = new EntityWrapper< GuihaijiluEntity>();
 		ew.allEq(MPUtil.allEQMapPre( guihaijilu, "guihaijilu")); 
		GuihaijiluView guihaijiluView =  guihaijiluService.selectView(ew);
		return R.ok("查询归还记录成功").put("data", guihaijiluView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GuihaijiluEntity guihaijilu = guihaijiluService.selectById(id);
        return R.ok().put("data", guihaijilu);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GuihaijiluEntity guihaijilu = guihaijiluService.selectById(id);
        return R.ok().put("data", guihaijilu);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GuihaijiluEntity guihaijilu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(guihaijilu);
        guihaijiluService.insert(guihaijilu);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GuihaijiluEntity guihaijilu, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(guihaijilu);
        guihaijiluService.insert(guihaijilu);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody GuihaijiluEntity guihaijilu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(guihaijilu);
        guihaijiluService.updateById(guihaijilu);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<GuihaijiluEntity> list = new ArrayList<GuihaijiluEntity>();
        for(Long id : ids) {
            GuihaijiluEntity guihaijilu = guihaijiluService.selectById(id);
            guihaijilu.setSfsh(sfsh);
            guihaijilu.setShhf(shhf);
            list.add(guihaijilu);
        }
        guihaijiluService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        guihaijiluService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
