package hhjt.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import hhjt.bean.Account;
import hhjt.bean.Info;
import hhjt.service.InfoService;

import javax.annotation.Resource;

import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
@Controller("infoAction")
@Scope(value = "prototype")
public class InfoAction extends ActionSupport implements Preparable ,SessionAware {

	private static final long serialVersionUID = 1673934214676555443L;
	
	private Info info;
	
	private Account account;
	
	@Resource(name="infoService")
	private InfoService ifs;
	
	
	private List<Info> infos;
	private Integer sid;
	//接收session的map
	private Map<String,Object> sessionMap;
	
	
	public String toInfoList() {
		
		String auth = hasAuthorization();
		if(!"ok".equalsIgnoreCase(auth))
		return auth;
		
		 infos = ifs.getAllInfos();
		return "infoListPage";
	}
	
	public String toEditInfo() {
//		System.out.println("edit page");
//		System.out.println(sid);
//		if(null != sid) {
//			this.info = ifs.getInfo(sid);
//			System.out.println(info.getTitle());
//		}
		String auth = hasAuthorization();
		if(!"ok".equalsIgnoreCase(auth))
		return auth;
		
		if(sid != null)
		this.info = ifs.getInfo(sid);
		return "toEditInfoPage";
	}
	
	public String hasAuthorization() {
		if(sessionMap.get("account") != null) {
			//addActionError(anErrorMessage);
			account = (Account) sessionMap.get("account");
			if(!ifs.isHasAuthorization(account)) return "noAuthorizationPage";
		} else {
			return "toLoginPage";
		}
		return "ok";
	}
	
	public String saveOrUpdate() {
		
		String auth = hasAuthorization();
		if(!"ok".equalsIgnoreCase(auth))
		return auth;
		
		//Account account = new Account();
	///	account.setId(2);
		
		info.setAccount(account);
		info.setInfo_time(new Date());
		ifs.saveOrUpdate(info);	
		
		return "infoListAction";
	}
	
	public String deleteInfo() {
		
		String auth = hasAuthorization();
		if(!"ok".equalsIgnoreCase(auth))
		return auth;
		
		ifs.deleteInfo(sid);
		return "infoListAction";
	}
	
	public String lookInfo() {
		 info = ifs.getInfo(sid);
		 return "lookInfoPage";
	}
	
	public InfoService getIfs() {
		return ifs;
	}

	public void setIfs(InfoService ifs) {
		this.ifs = ifs;
	}

	public List<Info> getInfos() {
		return infos;
	}

	public void setInfos(List<Info> infos) {
		this.infos = infos;
	}

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}
	
	public void prepareToEditInfo() throws  Exception{
		
		
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
	//	System.out.println(sid);
	//	System.out.println("pre");
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		sessionMap = arg0;
//		 account = new Account();
//			account.setId(2);
//			account.setLevel(0);
//		sessionMap.put("account",account );
	}

	public Account getAccount() {
		return account;
	}
	//set account
	public void setAccount(Account account) {
		this.account = account;
	}
	
}
