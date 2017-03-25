package cn.springtest.dao;

import cn.springtest.entity.BookUser;

public interface UserDao {

	/**
	 * ��½
	 * @return
	 */
	BookUser getUsers(BookUser user);
}
