package com.spg.apidoc.dao;

import com.spg.apidoc.po.UserDO;

import java.util.List;

public interface UserDaoMapper {
	List<UserDO> findAll();
}
