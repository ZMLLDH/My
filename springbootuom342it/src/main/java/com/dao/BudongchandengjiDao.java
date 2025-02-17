package com.dao;

import com.entity.BudongchandengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BudongchandengjiVO;
import com.entity.view.BudongchandengjiView;


/**
 * 不动产登记
 * 
 * @author 
 * @email 
 * @date 2024-06-14 17:03:35
 */
public interface BudongchandengjiDao extends BaseMapper<BudongchandengjiEntity> {
	
	List<BudongchandengjiVO> selectListVO(@Param("ew") Wrapper<BudongchandengjiEntity> wrapper);
	
	BudongchandengjiVO selectVO(@Param("ew") Wrapper<BudongchandengjiEntity> wrapper);
	
	List<BudongchandengjiView> selectListView(@Param("ew") Wrapper<BudongchandengjiEntity> wrapper);

	List<BudongchandengjiView> selectListView(Pagination page,@Param("ew") Wrapper<BudongchandengjiEntity> wrapper);

	
	BudongchandengjiView selectView(@Param("ew") Wrapper<BudongchandengjiEntity> wrapper);
	

}
