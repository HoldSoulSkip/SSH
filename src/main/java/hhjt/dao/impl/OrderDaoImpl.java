package hhjt.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import hhjt.bean.Account;
import hhjt.bean.Order;
import hhjt.dao.OrderDao;

@Repository(value="orderDao")
public class OrderDaoImpl implements OrderDao{

	
	@Resource
	private SessionFactory sf;
	@Override
	public void addOrder(Order order) {
		// TODO Auto-generated method stub
		Session session=sf.getCurrentSession();
		session.persist(order);
	}

	@Override
	public void delOrder(Order order) {
		// TODO Auto-generated method stub
		Session session=sf.getCurrentSession();
		session.delete(order);
	}

	@Override
	public Order uptOrder(Order order) {
		// TODO Auto-generated method stub
		Session session=sf.getCurrentSession();
		session.merge(order);
		return order;
	}

	@Override
	public List<Order> findAllOrder(Account account) {
		// TODO Auto-generated method stub
		Session session=sf.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Order> orders=session.createQuery("from Order odr where odr.account=?").setParameter(0, account).list();
		return orders;
	}

}
