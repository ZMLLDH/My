package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BudongchandengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BudongchandengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BudongchandengjiView;


/**
 * 不动产登记
 *
 * @author 
 * @email 
 * @date 2024-06-14 17:03:35
 */
public interface BudongchandengjiService extends IService<BudongchandengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BudongchandengjiVO> selectListVO(Wrapper<BudongchandengjiEntity> wrapper);
   	
   	BudongchandengjiVO selectVO(@Param("ew") Wrapper<BudongchandengjiEntity> wrapper);
   	
   	List<BudongchandengjiView> selectListView(Wrapper<BudongchandengjiEntity> wrapper);
   	
   	BudongchandengjiView selectView(@Param("ew") Wrapper<BudongchandengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BudongchandengjiEntity> wrapper);

   	

}

