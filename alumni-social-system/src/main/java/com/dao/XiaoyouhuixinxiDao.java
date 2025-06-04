package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.XiaoyouhuixinxiEntity;
import com.entity.view.XiaoyouhuixinxiView;
import com.entity.vo.XiaoyouhuixinxiVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 校友会信息
 * 
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
@Repository
public interface XiaoyouhuixinxiDao extends BaseMapper<XiaoyouhuixinxiEntity> {
	
	List<XiaoyouhuixinxiVO> selectListVO(@Param("ew") Wrapper<XiaoyouhuixinxiEntity> wrapper);
	
	XiaoyouhuixinxiVO selectVO(@Param("ew") Wrapper<XiaoyouhuixinxiEntity> wrapper);
	
	List<XiaoyouhuixinxiView> selectListView(@Param("ew") Wrapper<XiaoyouhuixinxiEntity> wrapper);

	List<XiaoyouhuixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoyouhuixinxiEntity> wrapper);
	
	XiaoyouhuixinxiView selectView(@Param("ew") Wrapper<XiaoyouhuixinxiEntity> wrapper);
	

}
