package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.YonghuEntity;
import com.entity.view.YonghuView;
import com.entity.vo.YonghuVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 用户
 * 
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
@Repository
public interface YonghuDao extends BaseMapper<YonghuEntity> {
	
	List<YonghuVO> selectListVO(@Param("ew") Wrapper<YonghuEntity> wrapper);
	
	YonghuVO selectVO(@Param("ew") Wrapper<YonghuEntity> wrapper);
	
	List<YonghuView> selectListView(@Param("ew") Wrapper<YonghuEntity> wrapper);

	List<YonghuView> selectListView(Pagination page,@Param("ew") Wrapper<YonghuEntity> wrapper);
	
	YonghuView selectView(@Param("ew") Wrapper<YonghuEntity> wrapper);
	

}
