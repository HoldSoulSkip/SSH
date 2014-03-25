package hhjt.service;

import hhjt.bean.Account;

public interface AccountService extends BaseService<Account>{

	boolean isRegisted(String username);

	Account checkInfo(String username, String password);

}
