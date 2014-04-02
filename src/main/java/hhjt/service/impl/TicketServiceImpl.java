package hhjt.service.impl;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hhjt.bean.Ticket;
import hhjt.dao.TicketDao;
import hhjt.entity.QueryClass;
import hhjt.service.TicketService;
@Service
@Transactional
public class TicketServiceImpl implements TicketService {
	
	List<QueryClass> queryList = new ArrayList<>();
	
	@Autowired
	TicketDao ticketDao;
	@Override
	public boolean addTicket(Ticket instance) {
		if(ticketDao.save(instance))
			return true;		
		return false;
	}

	@Override
	public boolean deleteTicket(Ticket instance) {
		if(ticketDao.delete(instance))
			return true;
		return false;
	}

	@Override
	public Ticket alterTicket(Ticket instance) {
		if(ticketDao.saveOrUpdate(instance))
			return instance;
		return null;
	}

	@Override
	public Ticket findTicketById(Integer id) {		
		return ticketDao.findById(id);
	}

	@Override
	public List<Ticket> findTicketByPrice(Double price) {
		QueryClass q = new QueryClass();
		queryList.clear();
		q.setName("price");
		q.setValue(price);
		queryList.add(q);
		return ticketDao.findByProperty(queryList);
	}

	@Override
	public List<Ticket> findTicketByType(String ticketType) {
		QueryClass q = new QueryClass();
		queryList.clear();
		q.setName("class_name");
		q.setValue(ticketType);
		queryList.add(q);
		return ticketDao.findByProperty(queryList);
	}

	@Override
	public List<Ticket> findTicketByBeginTime(String dateTime) {
		QueryClass q = new QueryClass();
		queryList.clear();
		q.setName("begin_time");
		q.setValue(dateTime);
		queryList.add(q);
		return ticketDao.findByProperty(queryList);
	}

	@Override
	public List<Ticket> findTicketByDeadline(String dateTime) {
		QueryClass q = new QueryClass();
		queryList.clear();
		q.setName("end_time");
		q.setValue(dateTime);
		queryList.add(q);
		return ticketDao.findByProperty(queryList);
	}

	@Override
	public List<Ticket> findTicketByPriceAndBeginTime(Double price, String begin) {		
		QueryClass q1 = new QueryClass(),q2 = new QueryClass();
		queryList.clear();
		q1.setName("price");
		q1.setValue(price);
		q2.setName("begin_time");
		q2.setValue(begin);
		queryList.add(q1);
		queryList.add(q2);
		return ticketDao.findByProperty(queryList);
	}

	@Override
	public List<Ticket> findTicketByPriceAndDeadline(Double price, String deadline) {
		QueryClass q1 = new QueryClass(),q2 = new QueryClass();
		queryList.clear();
		q1.setName("price");
		q1.setValue(price);
		q2.setName("end_time");
		q2.setValue(deadline);
		queryList.add(q1);
		queryList.add(q2);
		return ticketDao.findByProperty(queryList);
	}

	@Override
	public List<Ticket> findTicketByBeginTimeAndDeadline(String begin,
			String deadline) {
		QueryClass q1 = new QueryClass(),q2 = new QueryClass();
		queryList.clear();		
		q1.setName("begin_time");
		q1.setValue(begin);
		q2.setName("end_time");
		q2.setValue(deadline);
		queryList.add(q1);
		queryList.add(q2);
		return ticketDao.findByProperty(queryList);
	}

	@Override
	public List<Ticket> findTicketByPriceAndTime(Double price, String begin,
			String deadline) {
		QueryClass q1 = new QueryClass(),q2 = new QueryClass(),q3 = new QueryClass();
		queryList.clear();
		q1.setName("price");
		q1.setValue(price);
		q2.setName("begin_time");
		q2.setValue(begin);
		q3.setName("end_time");
		q3.setValue(deadline);
		queryList.add(q1);
		queryList.add(q2);
		queryList.add(q3);
		return ticketDao.findByProperty(queryList);
	}

	@Override
	public List<Ticket> findTicketByTypeAndTime(String ticketType, String begin,
			String deadline) {
		QueryClass q1 = new QueryClass(),q2 = new QueryClass(),q3 = new QueryClass();
		queryList.clear();
		q1.setName("class_name");
		q1.setValue(ticketType);
		q2.setName("begin_time");
		q2.setValue(begin);
		q3.setName("end_time");
		q3.setValue(deadline);
		queryList.add(q1);
		queryList.add(q2);
		queryList.add(q3);
		return ticketDao.findByProperty(queryList);
	}
	
	public List<Ticket> findTicketByTime(String dateTime){
		return ticketDao.findByTime(dateTime);
	}

}
