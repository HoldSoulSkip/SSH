package hhjt.dao;

import hhjt.bean.Account;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccoutDao {

	@Resource
	private SessionFactory sessionFactory;
	
	public void addAccout(Account accout){
		sessionFactory.getCurrentSession().save(accout);
	}
	
}
