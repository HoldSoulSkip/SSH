package hhjt.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import hhjt.bean.Account;
import hhjt.bean.Message;
import hhjt.dao.MessageDao;

@Repository(value="msgDao")
public class MessageDaoImpl implements MessageDao {

	@Resource
	private SessionFactory sf;
	
	@SuppressWarnings("unchecked")
	public List<Message> findMsgsBySendAccount(Account account){
		
		Session session=sf.getCurrentSession();
		return session.createQuery("from Message mes where mes.sendAccount=?").setParameter(0,account).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Message> findMsgByRecvAccount(Account account){
		
		Session session=sf.getCurrentSession();
		return session.createQuery("from Message msg where msg.recvAccount=?").setParameter(0,account).list();
	}
	
	public void delMsg(Message msg){
		
		Session session=sf.getCurrentSession();
		session.delete(msg);
	}
	
	public void addMsg(Message msg){
		
		Session session=sf.getCurrentSession();
		session.persist(msg);
	}
	
}
