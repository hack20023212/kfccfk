
package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.TokenEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * token
 */
@Repository
public interface TokenDao extends BaseMapper<TokenEntity> {
	
	List<TokenEntity> selectListView(@Param("ew") Wrapper<TokenEntity> wrapper);

	List<TokenEntity> selectListView(Pagination page,@Param("ew") Wrapper<TokenEntity> wrapper);
	
}
