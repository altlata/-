package com.dao;

import com.entity.NianlingtongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NianlingtongjiVO;
import com.entity.view.NianlingtongjiView;


/**
 * 年龄统计
 * 
 * @author 
 * @email 
 * @date 2021-02-06 16:28:54
 */
public interface NianlingtongjiDao extends BaseMapper<NianlingtongjiEntity> {
	
	List<NianlingtongjiVO> selectListVO(@Param("ew") Wrapper<NianlingtongjiEntity> wrapper);
	
	NianlingtongjiVO selectVO(@Param("ew") Wrapper<NianlingtongjiEntity> wrapper);
	
	List<NianlingtongjiView> selectListView(@Param("ew") Wrapper<NianlingtongjiEntity> wrapper);

	List<NianlingtongjiView> selectListView(Pagination page,@Param("ew") Wrapper<NianlingtongjiEntity> wrapper);
	
	NianlingtongjiView selectView(@Param("ew") Wrapper<NianlingtongjiEntity> wrapper);
	
}
