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


import com.dao.BiangengdengjiDao;
import com.entity.BiangengdengjiEntity;
import com.service.BiangengdengjiService;
import com.entity.vo.BiangengdengjiVO;
import com.entity.view.BiangengdengjiView;

@Service("biangengdengjiService")
public class BiangengdengjiServiceImpl extends ServiceImpl<BiangengdengjiDao, BiangengdengjiEntity> implements BiangengdengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BiangengdengjiEntity> page = this.selectPage(
                new Query<BiangengdengjiEntity>(params).getPage(),
                new EntityWrapper<BiangengdengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BiangengdengjiEntity> wrapper) {
		  Page<BiangengdengjiView> page =new Query<BiangengdengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<BiangengdengjiVO> selectListVO(Wrapper<BiangengdengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BiangengdengjiVO selectVO(Wrapper<BiangengdengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BiangengdengjiView> selectListView(Wrapper<BiangengdengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BiangengdengjiView selectView(Wrapper<BiangengdengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
