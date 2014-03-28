package hhjt.service;

import java.util.List;

import hhjt.bean.Account;
import hhjt.bean.Order;

public interface OrderService {

	public void addOrder(Order order,int ticketId,int actId);
	
	public void uptOrder(Order order);
	
	public void delOrder(Order order);
	
	public List<Order> listOrders(int actId);
	
	public void verifyOrder(int orderId);
}
