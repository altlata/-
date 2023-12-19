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


import com.dao.ShuliangfenxiDao;
import com.entity.ShuliangfenxiEntity;
import com.service.ShuliangfenxiService;
import com.entity.vo.ShuliangfenxiVO;
import com.entity.view.ShuliangfenxiView;

@Service("shuliangfenxiService")
public class ShuliangfenxiServiceImpl extends ServiceImpl<ShuliangfenxiDao, ShuliangfenxiEntity> implements ShuliangfenxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShuliangfenxiEntity> page = this.selectPage(
                new Query<ShuliangfenxiEntity>(params).getPage(),
                new EntityWrapper<ShuliangfenxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShuliangfenxiEntity> wrapper) {
		  Page<ShuliangfenxiView> page =new Query<ShuliangfenxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShuliangfenxiVO> selectListVO(Wrapper<ShuliangfenxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShuliangfenxiVO selectVO(Wrapper<ShuliangfenxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShuliangfenxiView> selectListView(Wrapper<ShuliangfenxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShuliangfenxiView selectView(Wrapper<ShuliangfenxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
