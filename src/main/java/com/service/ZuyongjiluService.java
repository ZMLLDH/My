package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuyongjiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuyongjiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuyongjiluView;


/**
 * 租用记录
 *
 * @author 
 * @email 
 * @date 2024-06-14 17:03:35
 */
public interface ZuyongjiluService extends IService<ZuyongjiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuyongjiluVO> selectListVO(Wrapper<ZuyongjiluEntity> wrapper);
   	
   	ZuyongjiluVO selectVO(@Param("ew") Wrapper<ZuyongjiluEntity> wrapper);
   	
   	List<ZuyongjiluView> selectListView(Wrapper<ZuyongjiluEntity> wrapper);
   	
   	ZuyongjiluView selectView(@Param("ew") Wrapper<ZuyongjiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuyongjiluEntity> wrapper);

   	

}

