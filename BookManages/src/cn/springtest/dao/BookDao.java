package cn.springtest.dao;

import java.util.List;

import cn.springtest.entity.Book;

public interface BookDao {

	/**
	 * ����ͼ����Ϣ
	 * @return
	 */
	List<Book> allBookInfo();
	
	/**
	 * ����ͼ��
	 * @return
	 */
	Boolean addBook(Book book);
}
