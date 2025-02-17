package com.dao;

import com.entity.BudongchanzulinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BudongchanzulinVO;
import com.entity.view.BudongchanzulinView;


/**
 * 不动产租赁
 * 
 * @author 
 * @email 
 * @date 2024-06-14 17:03:35
 */
public interface BudongchanzulinDao extends BaseMapper<BudongchanzulinEntity> {
	
	List<BudongchanzulinVO> selectListVO(@Param("ew") Wrapper<BudongchanzulinEntity> wrapper);
	
	BudongchanzulinVO selectVO(@Param("ew") Wrapper<BudongchanzulinEntity> wrapper);
	
	List<BudongchanzulinView> selectListView(@Param("ew") Wrapper<BudongchanzulinEntity> wrapper);

	List<BudongchanzulinView> selectListView(Pagination page,@Param("ew") Wrapper<BudongchanzulinEntity> wrapper);

	
	BudongchanzulinView selectView(@Param("ew") Wrapper<BudongchanzulinEntity> wrapper);
	

}
