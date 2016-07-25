package pkg.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import pkg.model.User;

public class LogInDao extends HibernateDaoSupport{
	
	public LogInDao(){
		super();
	}
	 public User insertUser(User user){
		 
		 getHibernateTemplate().save(user);
			return user;
	 }

}
