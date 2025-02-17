package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BiangengdengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BiangengdengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BiangengdengjiView;


/**
 * 变更登记
 *
 * @author 
 * @email 
 * @date 2024-06-14 17:03:35
 */
public interface BiangengdengjiService extends IService<BiangengdengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BiangengdengjiVO> selectListVO(Wrapper<BiangengdengjiEntity> wrapper);
   	
   	BiangengdengjiVO selectVO(@Param("ew") Wrapper<BiangengdengjiEntity> wrapper);
   	
   	List<BiangengdengjiView> selectListView(Wrapper<BiangengdengjiEntity> wrapper);
   	
   	BiangengdengjiView selectView(@Param("ew") Wrapper<BiangengdengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BiangengdengjiEntity> wrapper);

   	

}

