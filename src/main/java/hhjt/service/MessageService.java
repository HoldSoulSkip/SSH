package hhjt.service;

import hhjt.bean.Account;
import hhjt.bean.Message;

import java.util.List;

public interface MessageService {

	public List<Message> getSendMsg(int actId);
	
	public List<Message> getRecvMsg(int actId);
	
	public void removeMsg(int msgId);
	
	public void sendMsg(int sourceId,int endId,String content);
	
}
