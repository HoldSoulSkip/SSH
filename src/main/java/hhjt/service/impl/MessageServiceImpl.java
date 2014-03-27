package hhjt.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import hhjt.bean.Account;
import hhjt.bean.Message;
import hhjt.dao.impl.MessageDaoImpl;
import hhjt.service.MessageService;

@Transactional
@Service(value="msgService")
public class MessageServiceImpl implements MessageService {

	@Resource
	private MessageDaoImpl msgDao;
	@Override
	public List<Message> getSendMsg(Account account) {
		// TODO Auto-generated method stub
		return msgDao.findMsgsBySendAccount(account);
	}

	@Override
	public List<Message> getRecvMsg(Account account) {
		// TODO Auto-generated method stub
		return msgDao.findMsgByRecvAccount(account);
	}

	@Override
	public void removeMsg(Message msg) {
		// TODO Auto-generated method stub
		msgDao.delMsg(msg);
	}

	@Override
	public void sendMsg(Message msg) {
		// TODO Auto-generated method stub
		msgDao.addMsg(msg);
	}

}
