package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.BudongchanzulinDao;
import com.entity.BudongchanzulinEntity;
import com.service.BudongchanzulinService;
import com.entity.vo.BudongchanzulinVO;
import com.entity.view.BudongchanzulinView;

@Service("budongchanzulinService")
public class BudongchanzulinServiceImpl extends ServiceImpl<BudongchanzulinDao, BudongchanzulinEntity> implements BudongchanzulinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BudongchanzulinEntity> page = this.selectPage(
                new Query<BudongchanzulinEntity>(params).getPage(),
                new EntityWrapper<BudongchanzulinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BudongchanzulinEntity> wrapper) {
		  Page<BudongchanzulinView> page =new Query<BudongchanzulinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<BudongchanzulinVO> selectListVO(Wrapper<BudongchanzulinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BudongchanzulinVO selectVO(Wrapper<BudongchanzulinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BudongchanzulinView> selectListView(Wrapper<BudongchanzulinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BudongchanzulinView selectView(Wrapper<BudongchanzulinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
