package hhjt.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import hhjt.bean.Account;
import hhjt.bean.Order;
import hhjt.service.OrderService;
import hhjt.dao.OrderDao;

@Service(value="orderService")
@Transactional
public class OrderServiceImpl implements OrderService {

	@Resource
	private OrderDao orderDao;
	@Override
	public void addOrder(Order order) {
		// TODO Auto-generated method stub
		orderDao.addOrder(order);
	}

	@Override
	public void uptOrder(Order order) {
		// TODO Auto-generated method stub
		order=orderDao.uptOrder(order);
	}

	@Override
	public void delOrder(Order order) {
		// TODO Auto-generated method stub
		orderDao.delOrder(order);
	}

	@Override
	public List<Order> listOrders(Account account) {
		return orderDao.findAllOrder(account);
	}

	@Override
	public void verifyOrder(Order order) {
		// TODO Auto-generated method stub
		orderDao.uptOrder(order);
	}

}
