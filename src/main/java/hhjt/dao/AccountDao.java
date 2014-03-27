package hhjt.dao;

import java.util.List;
import hhjt.bean.Account;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDao {	
	private SessionFactory sessionFactory;	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void addAccout(Account account){
		try{
			sessionFactory.getCurrentSession().save(account);
		}catch(RuntimeException re) {
			throw re;
		}
		
	}

	public void deleteAccount(Account account) {
		Session session = sessionFactory.openSession();
		try{
			session.delete(account);
			
			//sessionFactory.getCurrentSession().delete(account);
		}catch(RuntimeException re){
			throw re;
		}finally{
			session.close();
		}
		
	}
	
	public Account findById(Integer id) {
		sessionFactory.getCurrentSession();
		Session session = sessionFactory.openSession();
		try{
			String sqlString = "select account from Account as acc where acc.id = ?";
			Query query = session.createQuery(sqlString);
			query.setInteger(0, id);
			Account account = (Account) query.list().get(0);
			return account;
		}catch(RuntimeException re){
			throw re;
		}
	}
	
	public List<Account> findByExample(Account account) {
		Session session = sessionFactory.openSession();
		try{
			String queryString = "select account from Account as model where model = ?";
			Query query = session.createQuery(queryString);
			query.setParameter(0,account);
			
			return query.list();
		}catch(RuntimeException re){
			throw re;
		}
	}
	
	public List<?> findByProperty(String propertyName, Object value) {
		Session session = sessionFactory.openSession();
		try{
			String queryString = "select account from Account as model where model."
					+ propertyName + "= ?";
			Query query = session.createQuery(queryString);
			query.setParameter(0, value);
			return query.list();
		}catch(Exception re){
			System.out.println(re.getMessage());
			throw null;
		}
	}
	
}
