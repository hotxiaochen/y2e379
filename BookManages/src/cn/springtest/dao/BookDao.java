package cn.springtest.dao;

import java.util.List;

import cn.springtest.entity.Book;

public interface BookDao {

	/**
	 * 所有图书信息
	 * @return
	 */
	List<Book> allBookInfo();
	
	/**
	 * 新增图书
	 * @return
	 */
	Boolean addBook(Book book);
}
