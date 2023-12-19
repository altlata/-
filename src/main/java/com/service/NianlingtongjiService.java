package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NianlingtongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NianlingtongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NianlingtongjiView;


/**
 * 年龄统计
 *
 * @author 
 * @email 
 * @date 2021-02-06 16:28:54
 */
public interface NianlingtongjiService extends IService<NianlingtongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NianlingtongjiVO> selectListVO(Wrapper<NianlingtongjiEntity> wrapper);
   	
   	NianlingtongjiVO selectVO(@Param("ew") Wrapper<NianlingtongjiEntity> wrapper);
   	
   	List<NianlingtongjiView> selectListView(Wrapper<NianlingtongjiEntity> wrapper);
   	
   	NianlingtongjiView selectView(@Param("ew") Wrapper<NianlingtongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NianlingtongjiEntity> wrapper);
   	
}

