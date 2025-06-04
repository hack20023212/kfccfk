package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.XiaoyuanjuanzengEntity;
import com.entity.view.XiaoyuanjuanzengView;
import com.entity.vo.XiaoyuanjuanzengVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 校园捐赠
 * 
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
@Repository
public interface XiaoyuanjuanzengDao extends BaseMapper<XiaoyuanjuanzengEntity> {
	
	List<XiaoyuanjuanzengVO> selectListVO(@Param("ew") Wrapper<XiaoyuanjuanzengEntity> wrapper);
	
	XiaoyuanjuanzengVO selectVO(@Param("ew") Wrapper<XiaoyuanjuanzengEntity> wrapper);
	
	List<XiaoyuanjuanzengView> selectListView(@Param("ew") Wrapper<XiaoyuanjuanzengEntity> wrapper);

	List<XiaoyuanjuanzengView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoyuanjuanzengEntity> wrapper);
	
	XiaoyuanjuanzengView selectView(@Param("ew") Wrapper<XiaoyuanjuanzengEntity> wrapper);
	

}
