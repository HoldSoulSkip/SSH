package hhjt.dao;

import java.util.List;

import hhjt.bean.Account;
import hhjt.bean.Order;

public interface OrderDao {

	public void addOrder(Order order);
	
	public void delOrder(Order order);
	
	public Order uptOrder(Order order);
	
	public List<Order> findAllOrder(Account account);
}
