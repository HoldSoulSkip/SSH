package hhjt.service;

import java.util.List;

import hhjt.bean.Account;
import hhjt.bean.Order;

public interface OrderService {

	public void addOrder(Order order);
	
	public void uptOrder(Order order);
	
	public void delOrder(Order order);
	
	public List<Order> listOrders(Account account);
	
	public void verifyOrder(Order order);
}
