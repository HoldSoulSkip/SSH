package hhjt.service;

import hhjt.bean.Account;
import hhjt.dao.AccoutDao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SampleService {

	@Autowired
	AccoutDao dao;
	public void insert(Account accout){
		dao.addAccout(accout);
	}
}
