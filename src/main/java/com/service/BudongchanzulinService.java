package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BudongchanzulinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BudongchanzulinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BudongchanzulinView;


/**
 * 不动产租赁
 *
 * @author 
 * @email 
 * @date 2024-06-14 17:03:35
 */
public interface BudongchanzulinService extends IService<BudongchanzulinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BudongchanzulinVO> selectListVO(Wrapper<BudongchanzulinEntity> wrapper);
   	
   	BudongchanzulinVO selectVO(@Param("ew") Wrapper<BudongchanzulinEntity> wrapper);
   	
   	List<BudongchanzulinView> selectListView(Wrapper<BudongchanzulinEntity> wrapper);
   	
   	BudongchanzulinView selectView(@Param("ew") Wrapper<BudongchanzulinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BudongchanzulinEntity> wrapper);

   	

}

