package cn.springtest.service;

import java.util.List;

import cn.springtest.entity.Book;

public interface BookService {

	
	/**
	 * 显示所有图书信息
	 */
	List<Book> allBookInfo();
	
	/**
	 * 新增图书
	 * @param book
	 * @return
	 */
	Boolean addBook(Book book);
}
