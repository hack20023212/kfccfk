package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.XiaoyouxiangqinEntity;
import com.entity.view.XiaoyouxiangqinView;
import com.entity.vo.XiaoyouxiangqinVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 校友相亲
 * 
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
@Repository
public interface XiaoyouxiangqinDao extends BaseMapper<XiaoyouxiangqinEntity> {
	
	List<XiaoyouxiangqinVO> selectListVO(@Param("ew") Wrapper<XiaoyouxiangqinEntity> wrapper);
	
	XiaoyouxiangqinVO selectVO(@Param("ew") Wrapper<XiaoyouxiangqinEntity> wrapper);
	
	List<XiaoyouxiangqinView> selectListView(@Param("ew") Wrapper<XiaoyouxiangqinEntity> wrapper);

	List<XiaoyouxiangqinView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoyouxiangqinEntity> wrapper);
	
	XiaoyouxiangqinView selectView(@Param("ew") Wrapper<XiaoyouxiangqinEntity> wrapper);
	

}
