package com.gitboy.febs.system.dao;

import com.gitboy.febs.system.domain.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface RoleMapper extends BaseMapper<Role> {

	List<Role> findUserRole(String userName);

}
