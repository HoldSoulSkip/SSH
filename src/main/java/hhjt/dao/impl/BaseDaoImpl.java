package hhjt.dao.impl;

import hhjt.dao.BaseDao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

/**
 * �����dao����,ר�����ڼ̳�
 */
public abstract class BaseDaoImpl<T> implements BaseDao<T> {
	
	private Class clazz ;
	
	/* ע��Ự���� */
	@Resource
	private SessionFactory sessionFactory ;
	
	/**
	 * 
	 */
	public BaseDaoImpl(){
		
		ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
		clazz = (Class) type.getActualTypeArguments()[0];
	}
	
	
	public void saveEntity(T t) {
		sessionFactory.getCurrentSession().save(t);
	}

	public void updateEntity(T t) {
		sessionFactory.getCurrentSession().update(t);
	}
	
	public void saveOrUpdateEntity(T t) {
		sessionFactory.getCurrentSession().saveOrUpdate(t);
	}

	public void deleteEntity(T t) {
		sessionFactory.getCurrentSession().delete(t);
	}

	/**
	 * ��������
	 */
	public void batchEntityByHQL(String hql, Object... objects) {
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		for(int i = 0 ; i < objects.length ; i ++){
			q.setParameter(i, objects[i]);
		}
		q.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	public T loadEntity(Integer id) {
		return (T) sessionFactory.getCurrentSession().load(clazz, id);
	}

	@SuppressWarnings("unchecked")
	public T getEntity(Integer id) {
		return (T) sessionFactory.getCurrentSession().get(clazz, id);
	}

	@SuppressWarnings("unchecked")
	public List<T> findEntityByHQL(String hql, Object... objects) {
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		for(int i = 0 ; i < objects.length ; i ++){
			q.setParameter(i, objects[i]);
		}
		return q.list();
	}
	
	//��ֵ����,ȷ����ѯ������ҽ���һ����¼
	public Object uniqueResult(String hql,Object...objects){
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		for(int i = 0 ; i < objects.length ; i ++){
			q.setParameter(i, objects[i]);
		}
		return q.uniqueResult();
	}
}
