package cn.springtest.web;


import cn.springtest.entity.BookUser;
import cn.springtest.service.UserService;

import com.opensymphony.xwork2.ActionSupport;

public class UsersAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6481166592749753759L;

	
	
	/**
	 * µÇÂ½
	 * @return
	 */
	public String login(){
		
		user = usersService.getUsers(user);
		
		return "login_success";
	}
	
	
	private UserService usersService;
	private BookUser user = new BookUser();
	

	public BookUser getUser() {
		return user;
	}

	public void setUser(BookUser user) {
		this.user = user;
	}

	public void setUsersService(UserService usersService) {
		this.usersService = usersService;
	}
	
	
}
