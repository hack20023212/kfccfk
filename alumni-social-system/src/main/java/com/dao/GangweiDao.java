package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.GangweiEntity;
import com.entity.view.GangweiView;
import com.entity.vo.GangweiVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 岗位
 * 
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
@Repository
public interface GangweiDao extends BaseMapper<GangweiEntity> {
	
	List<GangweiVO> selectListVO(@Param("ew") Wrapper<GangweiEntity> wrapper);
	
	GangweiVO selectVO(@Param("ew") Wrapper<GangweiEntity> wrapper);
	
	List<GangweiView> selectListView(@Param("ew") Wrapper<GangweiEntity> wrapper);

	List<GangweiView> selectListView(Pagination page,@Param("ew") Wrapper<GangweiEntity> wrapper);
	
	GangweiView selectView(@Param("ew") Wrapper<GangweiEntity> wrapper);
	

}
