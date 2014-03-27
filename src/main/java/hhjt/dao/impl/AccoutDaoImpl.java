package hhjt.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import hhjt.bean.Account;
import hhjt.dao.AccountDao;

@Repository(value="accountDao")
public class AccoutDaoImpl implements AccountDao {

	@Resource
	private SessionFactory sf;
	@Override
	public Account addAccount(Account account) {
		// TODO Auto-generated method stub
		Session session=sf.getCurrentSession();
		session.persist(account);
		return account;
	}

	@Override
	public Account findAccoutByName(Account account) {
		// TODO Auto-generated method stub
		Session session=sf.getCurrentSession();
		return (Account) session.createQuery("from Account ac where ac.name=?").setParameter(0, account.getName()).uniqueResult();
	}

	@Override
	public Account updateAccout(Account account) {
		// TODO Auto-generated method stub
		Session session=sf.getCurrentSession();
		session.merge(account);
		return account;
	}

	@Override
	public Account findAccoutByNameAndPassword(Account account) {
		// TODO Auto-generated method stub
		Session session=sf.getCurrentSession();
		return (Account) session.createQuery("from Account ac where ac.name=? and ac.password=?").setParameter(0, account.getName()).setParameter(1, account.getPassword()).uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method 
		Session session=sf.getCurrentSession();
		return session.createQuery("from Account").list();
	}
}
