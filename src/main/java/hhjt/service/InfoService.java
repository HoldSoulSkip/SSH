package hhjt.service;

import java.util.List;

import hhjt.bean.Info;

public interface InfoService {

	public List<Info> getAllInfos() ;
	public void saveOrUpdate(Info info);
	public Info getInfo(Integer sId);
	public void deleteInfo(Integer sid);
}
