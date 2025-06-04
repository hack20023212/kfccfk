package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.ForumEntity;
import com.entity.view.ForumView;
import com.entity.vo.ForumVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 论坛中心
 * 
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
@Repository
public interface ForumDao extends BaseMapper<ForumEntity> {
	
	List<ForumVO> selectListVO(@Param("ew") Wrapper<ForumEntity> wrapper);
	
	ForumVO selectVO(@Param("ew") Wrapper<ForumEntity> wrapper);
	
	List<ForumView> selectListView(@Param("ew") Wrapper<ForumEntity> wrapper);

	List<ForumView> selectListView(Pagination page,@Param("ew") Wrapper<ForumEntity> wrapper);
	
	ForumView selectView(@Param("ew") Wrapper<ForumEntity> wrapper);
	

}
