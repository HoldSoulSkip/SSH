package hhjt.service.impl;

import hhjt.dao.BaseDao;
import hhjt.service.BaseService;

import java.util.List;

import javax.annotation.Resource;

public class BaseServiceImpl<T> implements BaseService<T> {

	
	private BaseDao<T> dao;
	public BaseDao<T> getDao() {
		return dao;
	}
	
	@Resource
	public void setDao(BaseDao<T> dao) {
		this.dao = dao;
	}

	public void batchEntityByHQL(String hql, Object... objects) {
		dao.batchEntityByHQL(hql, objects);
	}

	public void deleteEntity(T t) {
		dao.deleteEntity(t);
	}

	public List<T> findEntityByHQL(String hql, Object... objects) {
		return dao.findEntityByHQL(hql, objects);
	}

	public T getEntity(Integer id) {
		return dao.getEntity(id);
	}

	public T loadEntity(Integer id) {
		return dao.loadEntity(id);
	}

	public void saveEntity(T t) {
		dao.saveEntity(t);
	}

	public void saveOrUpdateEntity(T t) {
		dao.saveOrUpdateEntity(t);
	}

	public void updateEntity(T t) {
		dao.updateEntity(t);
	}

}
