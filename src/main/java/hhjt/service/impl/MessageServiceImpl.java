package hhjt.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import hhjt.bean.Account;
import hhjt.bean.Message;
import hhjt.dao.BaseDao;
import hhjt.dao.impl.MessageDao;
import hhjt.service.MessageService;

@Transactional
@Service(value="msgService")
public class MessageServiceImpl implements MessageService {

	@SuppressWarnings("rawtypes")
	@Resource
	private BaseDao msgDao;

	@SuppressWarnings("unchecked")
	@Override
	public List<Message> getSendMsg(int actId) {
		// TODO Auto-generated method stub
		String hql="from Message msg where msg.sendAccount.id=?";
		return msgDao.findEntityByHQL(hql,actId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Message> getRecvMsg(int actId) {
		// TODO Auto-generated method stub
		String hql="from Message msg where msg.recvAccount.id=?";
		return msgDao.findEntityByHQL(hql,actId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void removeMsg(int msgId) {
		// TODO Auto-generated method stub
		String hql="delete Message msg where msg.id=?";
		msgDao.batchEntityByHQL(hql, msgId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void sendMsg(int sourceId, int endId, String content) {
		// TODO Auto-generated method stub
		Account sourceAct=new Account();
		Account endAct=new Account();
		sourceAct.setId(sourceId);
		endAct.setId(endId);
		Message msg=new Message();
		msg.setSendAccount(sourceAct);
		msg.setRecvAccount(endAct);
		msg.setContent(content);
		msgDao.saveEntity(msg);
	}
}
