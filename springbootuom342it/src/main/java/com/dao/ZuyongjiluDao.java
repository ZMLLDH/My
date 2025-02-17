package com.dao;

import com.entity.ZuyongjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuyongjiluVO;
import com.entity.view.ZuyongjiluView;


/**
 * 租用记录
 * 
 * @author 
 * @email 
 * @date 2024-06-14 17:03:35
 */
public interface ZuyongjiluDao extends BaseMapper<ZuyongjiluEntity> {
	
	List<ZuyongjiluVO> selectListVO(@Param("ew") Wrapper<ZuyongjiluEntity> wrapper);
	
	ZuyongjiluVO selectVO(@Param("ew") Wrapper<ZuyongjiluEntity> wrapper);
	
	List<ZuyongjiluView> selectListView(@Param("ew") Wrapper<ZuyongjiluEntity> wrapper);

	List<ZuyongjiluView> selectListView(Pagination page,@Param("ew") Wrapper<ZuyongjiluEntity> wrapper);

	
	ZuyongjiluView selectView(@Param("ew") Wrapper<ZuyongjiluEntity> wrapper);
	

}
