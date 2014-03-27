package hhjt.dao;

import java.util.List;

import hhjt.bean.Ticket;
import hhjt.entity.QueryClass;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDao {
	
	@Autowired
	private SessionFactory sessionFactory;		
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public boolean save(Ticket instance) {
		try{
			sessionFactory.getCurrentSession().save(instance);
			return true;
		}catch(RuntimeException re) {
			throw re;
		}		
	}
	
	public boolean update(Ticket instance) {
		try{
			sessionFactory.getCurrentSession().update(instance);
			return true;
		}catch(RuntimeException re) {
			throw re;
		}
	}
	
	public boolean saveOrUpdate(Ticket instance) {
		try{
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			return true;
		}catch(RuntimeException re) {
			throw re;
		}		
	}
	
	public boolean delete(Ticket instance) {
		try{
			sessionFactory.getCurrentSession().delete(instance);
			return true;
		}catch(RuntimeException re) {
			throw re;
		}
	}
		
	public Ticket findById(Integer id){
		try{
			return (Ticket) sessionFactory.getCurrentSession().get(Ticket.class,id);
		}catch(RuntimeException re) {
			throw re;
		}
	}
		
	public List<Ticket> findByProperty(List<QueryClass> queryList ){
		int length = queryList.size();
		String sqlString = "from Ticket t where t."+queryList.get(0).getName()+"=?";
		for(int i=1; i<length; i++){
			sqlString += "and t."+queryList.get(i).getName()+"=?";
		}
		System.out.println(sqlString);
		try{
			Query q =sessionFactory.getCurrentSession().createQuery(sqlString);
			for(int i=0;i<length;i++){
				q.setParameter(i, queryList.get(i).getValue());
			}
			return q.list();
		}catch(RuntimeException re) {
			throw re;
		}
	}
	
}
