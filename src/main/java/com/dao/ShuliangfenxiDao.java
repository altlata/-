package com.dao;

import com.entity.ShuliangfenxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShuliangfenxiVO;
import com.entity.view.ShuliangfenxiView;


/**
 * 数量分析
 * 
 * @author 
 * @email 
 * @date 2021-02-06 16:28:54
 */
public interface ShuliangfenxiDao extends BaseMapper<ShuliangfenxiEntity> {
	
	List<ShuliangfenxiVO> selectListVO(@Param("ew") Wrapper<ShuliangfenxiEntity> wrapper);
	
	ShuliangfenxiVO selectVO(@Param("ew") Wrapper<ShuliangfenxiEntity> wrapper);
	
	List<ShuliangfenxiView> selectListView(@Param("ew") Wrapper<ShuliangfenxiEntity> wrapper);

	List<ShuliangfenxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShuliangfenxiEntity> wrapper);
	
	ShuliangfenxiView selectView(@Param("ew") Wrapper<ShuliangfenxiEntity> wrapper);
	
}
