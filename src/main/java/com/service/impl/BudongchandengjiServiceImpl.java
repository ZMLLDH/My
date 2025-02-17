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


import com.dao.BudongchandengjiDao;
import com.entity.BudongchandengjiEntity;
import com.service.BudongchandengjiService;
import com.entity.vo.BudongchandengjiVO;
import com.entity.view.BudongchandengjiView;

@Service("budongchandengjiService")
public class BudongchandengjiServiceImpl extends ServiceImpl<BudongchandengjiDao, BudongchandengjiEntity> implements BudongchandengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BudongchandengjiEntity> page = this.selectPage(
                new Query<BudongchandengjiEntity>(params).getPage(),
                new EntityWrapper<BudongchandengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BudongchandengjiEntity> wrapper) {
		  Page<BudongchandengjiView> page =new Query<BudongchandengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<BudongchandengjiVO> selectListVO(Wrapper<BudongchandengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BudongchandengjiVO selectVO(Wrapper<BudongchandengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BudongchandengjiView> selectListView(Wrapper<BudongchandengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BudongchandengjiView selectView(Wrapper<BudongchandengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
