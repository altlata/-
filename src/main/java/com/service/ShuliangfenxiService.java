package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShuliangfenxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShuliangfenxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShuliangfenxiView;


/**
 * 数量分析
 *
 * @author 
 * @email 
 * @date 2021-02-06 16:28:54
 */
public interface ShuliangfenxiService extends IService<ShuliangfenxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShuliangfenxiVO> selectListVO(Wrapper<ShuliangfenxiEntity> wrapper);
   	
   	ShuliangfenxiVO selectVO(@Param("ew") Wrapper<ShuliangfenxiEntity> wrapper);
   	
   	List<ShuliangfenxiView> selectListView(Wrapper<ShuliangfenxiEntity> wrapper);
   	
   	ShuliangfenxiView selectView(@Param("ew") Wrapper<ShuliangfenxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShuliangfenxiEntity> wrapper);
   	
}

