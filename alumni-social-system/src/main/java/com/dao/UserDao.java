
package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户
 */
@Repository
public interface UserDao extends BaseMapper<UserEntity> {
	
	List<UserEntity> selectListView(@Param("ew") Wrapper<UserEntity> wrapper);

	List<UserEntity> selectListView(Pagination page,@Param("ew") Wrapper<UserEntity> wrapper);
	
}
