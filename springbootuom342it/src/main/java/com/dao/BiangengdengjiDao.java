package com.dao;

import com.entity.BiangengdengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BiangengdengjiVO;
import com.entity.view.BiangengdengjiView;


/**
 * 变更登记
 * 
 * @author 
 * @email 
 * @date 2024-06-14 17:03:35
 */
public interface BiangengdengjiDao extends BaseMapper<BiangengdengjiEntity> {
	
	List<BiangengdengjiVO> selectListVO(@Param("ew") Wrapper<BiangengdengjiEntity> wrapper);
	
	BiangengdengjiVO selectVO(@Param("ew") Wrapper<BiangengdengjiEntity> wrapper);
	
	List<BiangengdengjiView> selectListView(@Param("ew") Wrapper<BiangengdengjiEntity> wrapper);

	List<BiangengdengjiView> selectListView(Pagination page,@Param("ew") Wrapper<BiangengdengjiEntity> wrapper);

	
	BiangengdengjiView selectView(@Param("ew") Wrapper<BiangengdengjiEntity> wrapper);
	

}
