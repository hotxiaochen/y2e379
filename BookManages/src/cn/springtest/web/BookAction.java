package cn.springtest.web;




import java.util.List;

import cn.springtest.entity.Book;
import cn.springtest.service.BookService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BookAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6481166592749753759L;

	private BookService bookService;
	private Book book = new Book();

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	
	/**
	 * 显示所有图书信息
	 * @return
	 */
	String showBookInfo(){
		List<Book> list = bookService.allBookInfo();
		ActionContext.getContext().getSession().put("BookInfo", list);
		return "all_success";
	}
	
	/**
	 * 新增图书
	 * @return
	 */
	String add(){
		
		if(bookService.addBook(book)){
			return "add_success";
		}
		return "error";
	}

}
