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


import com.dao.ShangpinpingjiaDao;
import com.entity.ShangpinpingjiaEntity;
import com.service.ShangpinpingjiaService;
import com.entity.vo.ShangpinpingjiaVO;
import com.entity.view.ShangpinpingjiaView;

@Service("shangpinpingjiaService")
public class ShangpinpingjiaServiceImpl extends ServiceImpl<ShangpinpingjiaDao, ShangpinpingjiaEntity> implements ShangpinpingjiaService {


	@Override
	public PageUtils queryPage(Map<String,Object> params) {
		if(params != null && (params.get("limit") == null || params.get("page") == null)){
			params.put("page","1");
			params.put("limit","10");
		}
		Page<ShangpinpingjiaView> page =new Query<ShangpinpingjiaView>(params).getPage();
		page.setRecords(baseMapper.selectListView(page,params));
		return new PageUtils(page);
	}
    

    @Override
	public List<ShangpinpingjiaVO> selectListVO(Wrapper<ShangpinpingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangpinpingjiaVO selectVO(Wrapper<ShangpinpingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangpinpingjiaView> selectListView(Wrapper<ShangpinpingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangpinpingjiaView selectView(Wrapper<ShangpinpingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
