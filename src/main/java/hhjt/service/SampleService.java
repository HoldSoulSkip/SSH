package hhjt.service;

import hhjt.bean.Account;
import hhjt.dao.AccountDao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SampleService {

	@Autowired
	AccountDao dao;
	public void insert(Account account){
		dao.addAccout(account);;
	}
}
