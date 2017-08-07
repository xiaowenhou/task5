package com.putaoteng.task5.dao;

import org.springframework.stereotype.Service;

import com.putaoteng.task5.model.BasicVo;

@Service (value="userDao")
public interface UserDao extends BasicVoDao {
	public BasicVo findByUsername(String username);
}
