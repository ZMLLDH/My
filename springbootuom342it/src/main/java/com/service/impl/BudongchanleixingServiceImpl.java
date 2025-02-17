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


import com.dao.BudongchanleixingDao;
import com.entity.BudongchanleixingEntity;
import com.service.BudongchanleixingService;
import com.entity.vo.BudongchanleixingVO;
import com.entity.view.BudongchanleixingView;

@Service("budongchanleixingService")
public class BudongchanleixingServiceImpl extends ServiceImpl<BudongchanleixingDao, BudongchanleixingEntity> implements BudongchanleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BudongchanleixingEntity> page = this.selectPage(
                new Query<BudongchanleixingEntity>(params).getPage(),
                new EntityWrapper<BudongchanleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BudongchanleixingEntity> wrapper) {
		  Page<BudongchanleixingView> page =new Query<BudongchanleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<BudongchanleixingVO> selectListVO(Wrapper<BudongchanleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BudongchanleixingVO selectVO(Wrapper<BudongchanleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BudongchanleixingView> selectListView(Wrapper<BudongchanleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BudongchanleixingView selectView(Wrapper<BudongchanleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
