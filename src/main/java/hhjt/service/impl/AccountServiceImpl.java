package hhjt.service.impl;

import hhjt.bean.Account;
import hhjt.dao.BaseDao;
import hhjt.service.AccountService;
import hhjt.util.ValidateUtil;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author cl
 *	extends BaseServiceImpl的情况只适合注入一种Dao的Service，
 *	如果一个Service需要多种Dao时，不能extends BaseServiceImpl，
 *
 */

@Service("accountService")
@Transactional(rollbackFor = Exception.class)
public class AccountServiceImpl extends BaseServiceImpl<Account> implements
		AccountService {

//	@Resource(name="accountDao")
//	private BaseDao<Account> dao;
	@Resource(name="accountDao")
	public void setDao(BaseDao<Account> dao) {
		super.setDao(dao);
	}
	public boolean isRegisted(String name) {
		String hql = "from Account u where u.name=?";
		List<Account> list = this.findEntityByHQL(hql, name);
		return ValidateUtil.isValid(list);
	}

	/**
	 * 检查登陆信息是否正确
	 */
	public Account checkInfo(String name, String password) {
		String hql = "from Account u where u.name = ? and u.password = ?";
		List<Account> list = this.findEntityByHQL(hql, name, password);
		return ValidateUtil.isValid(list) ? list.get(0) : null;
	}
}
