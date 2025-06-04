package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.JiaruxiaoyouhuiEntity;
import com.entity.view.JiaruxiaoyouhuiView;
import com.entity.vo.JiaruxiaoyouhuiVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 加入校友会
 * 
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
@Repository
public interface JiaruxiaoyouhuiDao extends BaseMapper<JiaruxiaoyouhuiEntity> {
	
	List<JiaruxiaoyouhuiVO> selectListVO(@Param("ew") Wrapper<JiaruxiaoyouhuiEntity> wrapper);
	
	JiaruxiaoyouhuiVO selectVO(@Param("ew") Wrapper<JiaruxiaoyouhuiEntity> wrapper);
	
	List<JiaruxiaoyouhuiView> selectListView(@Param("ew") Wrapper<JiaruxiaoyouhuiEntity> wrapper);

	List<JiaruxiaoyouhuiView> selectListView(Pagination page,@Param("ew") Wrapper<JiaruxiaoyouhuiEntity> wrapper);
	
	JiaruxiaoyouhuiView selectView(@Param("ew") Wrapper<JiaruxiaoyouhuiEntity> wrapper);
	

}
