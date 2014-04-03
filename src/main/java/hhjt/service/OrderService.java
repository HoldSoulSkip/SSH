package hhjt.service;

import java.util.List;

import hhjt.bean.Account;
import hhjt.bean.Order;

public interface OrderService {

	public void addOrder(Order order,int ticketId,int actId);
	
	public Order findOrderById(int id);
	
	public void uptOrder(Order order);
	
	public void delOrder(int id);
	
	public List<Order> listOrders(int actId);
	
	public void verifyOrder(int orderId);
	
	public void upgradeOrder(int orderId);
	
	public void payOrder(int orderId);
}
