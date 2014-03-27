package hhjt.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import hhjt.bean.Account;
import hhjt.dao.AccountDao;
import hhjt.service.AccountService;

@Service(value="actService")
@Transactional
public class AccountServiceImpl implements AccountService {

	@Resource
	private AccountDao accountDao;
	@Override
	public Account login(Account account) {
		// TODO Auto-generated method stub
		return accountDao.findAccoutByNameAndPassword(account);
	}

	@Override
	public boolean checkName(Account account) {
		// TODO Auto-generated method stub
		Account act=accountDao.findAccoutByName(account);
		if(act==null) return true;
		return false;
	}

	@Override
	public Account registe(Account account) {
		// TODO Auto-generated method stub
		return accountDao.addAccount(account);
	}

	@Override
	public Account setLevel(Account account) {
		// TODO Auto-generated method stub
		return accountDao.updateAccout(account);
	}

	@Override
	public List<Account> listAllAccounts() {
		// TODO Auto-generated method stub
		return accountDao.getAllAccounts();
	}

}