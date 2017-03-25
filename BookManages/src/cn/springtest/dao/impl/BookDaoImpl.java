package cn.springtest.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.springtest.dao.BookDao;
import cn.springtest.entity.Book;

public class BookDaoImpl extends HibernateDaoSupport implements BookDao {

	
	/**
	 * 显示所有图书信息
	 */
	@Override
	public List<Book> allBookInfo() {
		// TODO Auto-generated method stub
		
		return getHibernateTemplate().execute(
				
				new HibernateCallback<List<Book>>() {

					@Override
					public List<Book> doInHibernate(Session session)
							throws HibernateException, SQLException {
						
						List<Book> list = new ArrayList<Book>();
						list = session.createCriteria(Book.class).list();
						
						return list;
					}
				}
				
			);
	}
	
	/**
	 * 新增图书
	 */
	@Override
	public Boolean addBook( final Book book) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().execute(
				new HibernateCallback<Boolean>() {

					@Override
					public Boolean doInHibernate(Session session)
							throws HibernateException, SQLException {
						
						Boolean  flay = false;
						try {
							
							session.save(book);
							flay = true;
						} catch (Exception e) {
							e.printStackTrace();
							flay = false;
						}
						
						
						return flay;
					}
				}
				);
	}


				
	

}
