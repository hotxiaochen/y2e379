package cn.springtest.dao.impl;

import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.springtest.dao.UserDao;
import cn.springtest.entity.BookUser;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	/**
	 * µÇÂ½
	 */
	@Override
	public BookUser getUsers(final BookUser user) {
		
		return getHibernateTemplate().execute(
				new HibernateCallback<BookUser>() {

					@Override
					public BookUser doInHibernate(Session session)
							throws HibernateException, SQLException {
						BookUser u = new BookUser();
						if(user != null && user.getName() != null && user.getPassword() != null ){
							
							u = (BookUser) session.createCriteria(BookUser.class)
							.add(Restrictions.eq("name", user.getName()))
							.add(Restrictions.eq("password", user.getPassword()))
							.uniqueResult();
							
						}
						
						return u;
					}
					
				}
		);
		
	}

}
