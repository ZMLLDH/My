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


import com.dao.ZuyongjiluDao;
import com.entity.ZuyongjiluEntity;
import com.service.ZuyongjiluService;
import com.entity.vo.ZuyongjiluVO;
import com.entity.view.ZuyongjiluView;

@Service("zuyongjiluService")
public class ZuyongjiluServiceImpl extends ServiceImpl<ZuyongjiluDao, ZuyongjiluEntity> implements ZuyongjiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuyongjiluEntity> page = this.selectPage(
                new Query<ZuyongjiluEntity>(params).getPage(),
                new EntityWrapper<ZuyongjiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuyongjiluEntity> wrapper) {
		  Page<ZuyongjiluView> page =new Query<ZuyongjiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ZuyongjiluVO> selectListVO(Wrapper<ZuyongjiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuyongjiluVO selectVO(Wrapper<ZuyongjiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuyongjiluView> selectListView(Wrapper<ZuyongjiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuyongjiluView selectView(Wrapper<ZuyongjiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
