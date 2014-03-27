package hhjt.service;

import java.util.List;

import hhjt.bean.Account;

public interface AccountService {
	
	public Account login(Account account);	
	public boolean checkName(Account account);
	public Account registe(Account account);
	public Account setLevel(Account account);
	public List<Account> listAllAccounts();
}
