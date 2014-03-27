package hhjt.dao;

import hhjt.bean.Account;
import hhjt.bean.Message;

import java.util.List;

public interface MessageDao {

	public List<Message> findMsgsBySendAccount(Account account);
	
	public List<Message> findMsgByRecvAccount(Account account);
	
	public void delMsg(Message msg);
	
	public void addMsg(Message msg);
}
