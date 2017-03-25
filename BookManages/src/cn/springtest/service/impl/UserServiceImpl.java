package cn.springtest.service.impl;

import cn.springtest.dao.UserDao;
import cn.springtest.entity.BookUser;
import cn.springtest.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	@Override
	public BookUser getUsers(BookUser user) {
		// TODO Auto-generated method stub
		return userDao.getUsers(user);
	}

}
