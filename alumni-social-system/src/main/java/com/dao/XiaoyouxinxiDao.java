package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.XiaoyouxinxiEntity;
import com.entity.view.XiaoyouxinxiView;
import com.entity.vo.XiaoyouxinxiVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 校友信息
 * 
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
@Repository
public interface XiaoyouxinxiDao extends BaseMapper<XiaoyouxinxiEntity> {
	
	List<XiaoyouxinxiVO> selectListVO(@Param("ew") Wrapper<XiaoyouxinxiEntity> wrapper);
	
	XiaoyouxinxiVO selectVO(@Param("ew") Wrapper<XiaoyouxinxiEntity> wrapper);
	
	List<XiaoyouxinxiView> selectListView(@Param("ew") Wrapper<XiaoyouxinxiEntity> wrapper);

	List<XiaoyouxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoyouxinxiEntity> wrapper);
	
	XiaoyouxinxiView selectView(@Param("ew") Wrapper<XiaoyouxinxiEntity> wrapper);
	

}
