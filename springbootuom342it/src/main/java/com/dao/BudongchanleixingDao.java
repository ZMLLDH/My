package com.dao;

import com.entity.BudongchanleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BudongchanleixingVO;
import com.entity.view.BudongchanleixingView;


/**
 * 不动产类型
 * 
 * @author 
 * @email 
 * @date 2024-06-14 17:03:35
 */
public interface BudongchanleixingDao extends BaseMapper<BudongchanleixingEntity> {
	
	List<BudongchanleixingVO> selectListVO(@Param("ew") Wrapper<BudongchanleixingEntity> wrapper);
	
	BudongchanleixingVO selectVO(@Param("ew") Wrapper<BudongchanleixingEntity> wrapper);
	
	List<BudongchanleixingView> selectListView(@Param("ew") Wrapper<BudongchanleixingEntity> wrapper);

	List<BudongchanleixingView> selectListView(Pagination page,@Param("ew") Wrapper<BudongchanleixingEntity> wrapper);

	
	BudongchanleixingView selectView(@Param("ew") Wrapper<BudongchanleixingEntity> wrapper);
	

}
