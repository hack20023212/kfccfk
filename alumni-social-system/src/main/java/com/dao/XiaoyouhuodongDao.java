package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.XiaoyouhuodongEntity;
import com.entity.view.XiaoyouhuodongView;
import com.entity.vo.XiaoyouhuodongVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 校友活动
 * 
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
@Repository
public interface XiaoyouhuodongDao extends BaseMapper<XiaoyouhuodongEntity> {
	
	List<XiaoyouhuodongVO> selectListVO(@Param("ew") Wrapper<XiaoyouhuodongEntity> wrapper);
	
	XiaoyouhuodongVO selectVO(@Param("ew") Wrapper<XiaoyouhuodongEntity> wrapper);
	
	List<XiaoyouhuodongView> selectListView(@Param("ew") Wrapper<XiaoyouhuodongEntity> wrapper);

	List<XiaoyouhuodongView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoyouhuodongEntity> wrapper);
	
	XiaoyouhuodongView selectView(@Param("ew") Wrapper<XiaoyouhuodongEntity> wrapper);
	

}
