package hhjt.service;

import hhjt.bean.Account;
import hhjt.bean.Message;

import java.util.List;

public interface MessageService {

	public List<Message> getSendMsg(Account account);
	
	public List<Message> getRecvMsg(Account account);
	
	public void removeMsg(Message msg);
	
	public void sendMsg(Message msg);
}
