package com.ezen.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.spring.service.UserService;
import com.ezen.spring.vo.UserVO;


@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	UserDAO userDAO;
	
	@Override
	public UserVO getUser(UserVO userVO) {
		return userDAO.getUser(userVO);
	}
	
	@Override
	public void join(UserVO userVO) {
		userDAO.join(userVO);
	}
	
	
	
}
