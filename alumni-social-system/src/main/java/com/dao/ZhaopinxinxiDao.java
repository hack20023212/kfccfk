package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.ZhaopinxinxiEntity;
import com.entity.view.ZhaopinxinxiView;
import com.entity.vo.ZhaopinxinxiVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 招聘信息
 * 
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
@Repository
public interface ZhaopinxinxiDao extends BaseMapper<ZhaopinxinxiEntity> {
	
	List<ZhaopinxinxiVO> selectListVO(@Param("ew") Wrapper<ZhaopinxinxiEntity> wrapper);
	
	ZhaopinxinxiVO selectVO(@Param("ew") Wrapper<ZhaopinxinxiEntity> wrapper);
	
	List<ZhaopinxinxiView> selectListView(@Param("ew") Wrapper<ZhaopinxinxiEntity> wrapper);

	List<ZhaopinxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhaopinxinxiEntity> wrapper);
	
	ZhaopinxinxiView selectView(@Param("ew") Wrapper<ZhaopinxinxiEntity> wrapper);
	

}
