package cn.springtest.service;

import java.util.List;

import cn.springtest.entity.Book;

public interface BookService {

	
	/**
	 * ��ʾ����ͼ����Ϣ
	 */
	List<Book> allBookInfo();
	
	/**
	 * ����ͼ��
	 * @param book
	 * @return
	 */
	Boolean addBook(Book book);
}
