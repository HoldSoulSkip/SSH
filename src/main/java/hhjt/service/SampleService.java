package hhjt.service;

import hhjt.bean.Accout;
import hhjt.dao.AccoutDao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SampleService {

	@Autowired
	AccoutDao dao;
	public void insert(Accout accout){
		dao.addAccout(accout);
	}
}
