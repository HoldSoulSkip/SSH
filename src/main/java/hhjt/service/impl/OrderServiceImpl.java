package hhjt.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import hhjt.bean.Account;
import hhjt.bean.Order;
import hhjt.bean.Ticket;
import hhjt.dao.impl.OrderDao;
import hhjt.service.OrderService;

@Service(value="orderService")
@Transactional
public class OrderServiceImpl implements OrderService {

	@Resource
	private OrderDao orderDao;
	@Override
	public void addOrder(Order order,int ticketId,int actId) {
		// TODO Auto-generated method stub
		Ticket ticket=new Ticket();
		ticket.setId(ticketId);
		Account act=new Account();
		act.setId(actId);
		order.setTicket(ticket);
		order.setAccount(act);
		orderDao.saveEntity(order);
	}

	@Override
	public void uptOrder(Order order) {
		// TODO Auto-generated method stub
		orderDao.updateEntity(order);
	}

	@Override
	public void delOrder(int id) {
		// TODO Auto-generated method stub
		String hql="delete Order ord where ord.id=?";
		orderDao.batchEntityByHQL(hql,id);
	}

	@Override
	public List<Order> listOrders(int actId) {
		String hql="from Order ord where ord.account.id=?";
		return orderDao.findEntityByHQL(hql,actId);
	}

	@Override
	public void verifyOrder(int orderId) {
		// TODO Auto-generated method stub
		String hql="Update Order ord set ord.level=2 where ord.accout.id=?";
		orderDao.batchEntityByHQL(hql, orderId);
	}

	@Override
	public Order findOrderById(int id) {
		// TODO Auto-generated method stub
		String hql="from Order ord where ord.id=?";
		return (Order) orderDao.uniqueResult(hql, id);
	}

	@Override
	public void upgradeOrder(int orderId) {
		// TODO Auto-generated method stub
		String hql="update Order odr set odr.orderState=1 where odr.id=?";
		orderDao.batchEntityByHQL(hql, orderId);
	}

	@Override
	public void payOrder(int orderId) {
		// TODO Auto-generated method stub
		String hql="update Order odr set odr.orderState=2 where odr.id=?";
		orderDao.batchEntityByHQL(hql, orderId);
	}

}
