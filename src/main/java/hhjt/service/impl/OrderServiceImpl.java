package hhjt.service.impl;

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
	public void delOrder(Order order) {
		// TODO Auto-generated method stub
		orderDao.deleteEntity(order);
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

}
