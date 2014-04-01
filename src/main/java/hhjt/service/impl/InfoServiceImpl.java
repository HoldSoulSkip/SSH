package hhjt.service.impl;

import java.util.List;

import hhjt.bean.Account;
import hhjt.bean.Info;
import hhjt.dao.BaseDao;
import hhjt.service.InfoService;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("infoService")
@Transactional(rollbackFor = Exception.class)
public class InfoServiceImpl implements InfoService {

	@Resource(name = "infoDao")
	private BaseDao<Info> infoDao;

	@Override
	public List<Info> getAllInfos() {
		//String hql = "select info from Info info";
	//	return infoDao.findEntityByHQL(hql);
		return infoDao.getAllEntity();
	}

	@Override
	public void saveOrUpdate(Info info) {
		 infoDao.saveOrUpdateEntity(info);
	}

	@Override
	public Info getInfo(Integer sId) {
		return infoDao.getEntity(sId);
	}

	@Override
	public void deleteInfo(Integer sid) {
		infoDao.deleteEntity(infoDao.getEntity(sid));
	}

	@Override
	public boolean isHasAuthorization(Account account) {
		if (account.getLevel() != null) {
			if (account.getLevel() > 0)
				return true;
		}
		return false;

	}

}
