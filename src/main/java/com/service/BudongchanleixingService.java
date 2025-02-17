package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BudongchanleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BudongchanleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BudongchanleixingView;


/**
 * 不动产类型
 *
 * @author 
 * @email 
 * @date 2024-06-14 17:03:35
 */
public interface BudongchanleixingService extends IService<BudongchanleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BudongchanleixingVO> selectListVO(Wrapper<BudongchanleixingEntity> wrapper);
   	
   	BudongchanleixingVO selectVO(@Param("ew") Wrapper<BudongchanleixingEntity> wrapper);
   	
   	List<BudongchanleixingView> selectListView(Wrapper<BudongchanleixingEntity> wrapper);
   	
   	BudongchanleixingView selectView(@Param("ew") Wrapper<BudongchanleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BudongchanleixingEntity> wrapper);

   	

}

