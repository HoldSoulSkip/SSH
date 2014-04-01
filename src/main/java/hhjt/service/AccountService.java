package hhjt.service;

import java.util.List;

import hhjt.bean.Account;

public interface AccountService {
	
	public Account login(String username,String password);	
	public boolean checkName(String username);
	public void register(Account account);
	public void setLevel(int actId,int level);
	public List<Account> listAllAccounts();
	public void updateAccount(Account act);
}
