package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.WodejuanzengEntity;
import com.entity.view.WodejuanzengView;
import com.entity.vo.WodejuanzengVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 我的捐赠
 * 
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
@Repository
public interface WodejuanzengDao extends BaseMapper<WodejuanzengEntity> {
	
	List<WodejuanzengVO> selectListVO(@Param("ew") Wrapper<WodejuanzengEntity> wrapper);
	
	WodejuanzengVO selectVO(@Param("ew") Wrapper<WodejuanzengEntity> wrapper);
	
	List<WodejuanzengView> selectListView(@Param("ew") Wrapper<WodejuanzengEntity> wrapper);

	List<WodejuanzengView> selectListView(Pagination page,@Param("ew") Wrapper<WodejuanzengEntity> wrapper);
	
	WodejuanzengView selectView(@Param("ew") Wrapper<WodejuanzengEntity> wrapper);
	

}
