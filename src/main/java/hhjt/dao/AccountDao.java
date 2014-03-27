package hhjt.dao;

import java.util.List;

import hhjt.bean.Account;

public interface AccountDao {

	public Account addAccount(Account account);
	
	public Account findAccoutByName(Account account);
	
	public Account findAccoutByNameAndPassword(Account account);
	
	public Account updateAccout(Account account);
	
	public List<Account> getAllAccounts();

}
