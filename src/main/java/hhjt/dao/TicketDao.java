package hhjt.dao;

import java.util.Date;
import java.util.List;

import hhjt.bean.Ticket;
import hhjt.entity.QueryClass;

public interface TicketDao {	
	public boolean save(Ticket instance);
	public boolean update(Ticket instance);
	public boolean saveOrUpdate(Ticket instance);
	public boolean delete(Ticket instance);
	public Ticket findById(Integer id);
	public List<Ticket> findByProperty(List<QueryClass> queryList );
	public List<Ticket> findByTime(Date time);
}

