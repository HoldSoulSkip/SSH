package hhjt.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import hhjt.bean.Account;
import hhjt.dao.BaseDao;
import hhjt.service.AccountService;

@Service(value="actService")
@Transactional
public class AccountServiceImpl implements AccountService {

	@SuppressWarnings("rawtypes")
	@Resource
	private BaseDao accountDao;
	
	@Override
	public Account login(String username,String password) {
		// TODO Auto-generated method stub
		String hql="from Account act where act.name=? and act.password=?";
		return (Account) accountDao.uniqueResult(hql, username,password);
	}

	@Override
	public boolean checkName(String username) {
		// TODO Auto-generated method stub
		String hql="from Account act where act.name=?";
		Account act= (Account) accountDao.uniqueResult(hql, username);
		if(act!=null) return false;
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void register(Account account) {
		// TODO Auto-generated method stub
		accountDao.saveEntity(account);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setLevel(int actId,int level) {
		// TODO Auto-generated method stub\
		String hql="update Account act set act.level=? where act.id=?";
		System.out.println("before");
		System.out.println(actId);
		accountDao.batchEntityByHQL(hql,level,actId);
		System.out.println("end");
		hql="update Message msg set msg.state=1 where msg.sendAccount.id=?";
		accountDao.batchEntityByHQL(hql,actId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Account> listAllAccounts() {
		// TODO Auto-generated method stub
		String hql="from Account";
		return accountDao.findEntityByHQL(hql);
	}

	@Override
	public void updateAccount(Account act) {
		// TODO Auto-generated method stub
		accountDao.updateEntity(act);
	}

}
