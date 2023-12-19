package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.NianlingtongjiDao;
import com.entity.NianlingtongjiEntity;
import com.service.NianlingtongjiService;
import com.entity.vo.NianlingtongjiVO;
import com.entity.view.NianlingtongjiView;

@Service("nianlingtongjiService")
public class NianlingtongjiServiceImpl extends ServiceImpl<NianlingtongjiDao, NianlingtongjiEntity> implements NianlingtongjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NianlingtongjiEntity> page = this.selectPage(
                new Query<NianlingtongjiEntity>(params).getPage(),
                new EntityWrapper<NianlingtongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NianlingtongjiEntity> wrapper) {
		  Page<NianlingtongjiView> page =new Query<NianlingtongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NianlingtongjiVO> selectListVO(Wrapper<NianlingtongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NianlingtongjiVO selectVO(Wrapper<NianlingtongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NianlingtongjiView> selectListView(Wrapper<NianlingtongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NianlingtongjiView selectView(Wrapper<NianlingtongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
