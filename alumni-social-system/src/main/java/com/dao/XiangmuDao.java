package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.XiangmuEntity;
import com.entity.view.XiangmuView;
import com.entity.vo.XiangmuVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 项目
 * 
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
@Repository
public interface XiangmuDao extends BaseMapper<XiangmuEntity> {
	
	List<XiangmuVO> selectListVO(@Param("ew") Wrapper<XiangmuEntity> wrapper);
	
	XiangmuVO selectVO(@Param("ew") Wrapper<XiangmuEntity> wrapper);
	
	List<XiangmuView> selectListView(@Param("ew") Wrapper<XiangmuEntity> wrapper);

	List<XiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<XiangmuEntity> wrapper);
	
	XiangmuView selectView(@Param("ew") Wrapper<XiangmuEntity> wrapper);
	

}
