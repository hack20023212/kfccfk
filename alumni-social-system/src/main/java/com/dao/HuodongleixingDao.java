package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.HuodongleixingEntity;
import com.entity.view.HuodongleixingView;
import com.entity.vo.HuodongleixingVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 活动类型
 * 
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
@Repository
public interface HuodongleixingDao extends BaseMapper<HuodongleixingEntity> {
	
	List<HuodongleixingVO> selectListVO(@Param("ew") Wrapper<HuodongleixingEntity> wrapper);
	
	HuodongleixingVO selectVO(@Param("ew") Wrapper<HuodongleixingEntity> wrapper);
	
	List<HuodongleixingView> selectListView(@Param("ew") Wrapper<HuodongleixingEntity> wrapper);

	List<HuodongleixingView> selectListView(Pagination page,@Param("ew") Wrapper<HuodongleixingEntity> wrapper);
	
	HuodongleixingView selectView(@Param("ew") Wrapper<HuodongleixingEntity> wrapper);
	

}
