package cn.springtest.service.impl;

import java.util.List;

import cn.springtest.dao.BookDao;
import cn.springtest.entity.Book;
import cn.springtest.service.BookService;

public class BookServiceImpl implements BookService {

	public BookDao bookDao;
	
	public void setBookdao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	/**
	 * ��ʾ����ͼ����Ϣ
	 */
	@Override
	public List<Book> allBookInfo() {
		// TODO Auto-generated method stub
		return bookDao.allBookInfo();
	}
	
	/**
	 * ����ͼ��
	 */
	@Override
	public Boolean addBook(Book book) {
		// TODO Auto-generated method stub
		return bookDao.addBook(book);
	}

	

}
