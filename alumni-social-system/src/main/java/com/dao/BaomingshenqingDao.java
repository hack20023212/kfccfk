package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.BaomingshenqingEntity;
import com.entity.view.BaomingshenqingView;
import com.entity.vo.BaomingshenqingVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 报名申请
 * 
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
@Repository
public interface BaomingshenqingDao extends BaseMapper<BaomingshenqingEntity> {
	
	List<BaomingshenqingVO> selectListVO(@Param("ew") Wrapper<BaomingshenqingEntity> wrapper);
	
	BaomingshenqingVO selectVO(@Param("ew") Wrapper<BaomingshenqingEntity> wrapper);
	
	List<BaomingshenqingView> selectListView(@Param("ew") Wrapper<BaomingshenqingEntity> wrapper);

	List<BaomingshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<BaomingshenqingEntity> wrapper);
	
	BaomingshenqingView selectView(@Param("ew") Wrapper<BaomingshenqingEntity> wrapper);
	

}
