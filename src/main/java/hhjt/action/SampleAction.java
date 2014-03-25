package hhjt.action;

import hhjt.bean.Account;
import hhjt.service.SampleService;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import com.opensymphony.xwork2.ActionSupport;

@Controller
@Scope(value="prototype")
public class SampleAction extends ActionSupport {

	@Resource
	private SampleService service;
	
	private String accout;
	private String passwd;
	
	public String execute(){
		Account act=new Account();
		
		service.insert(act);
		return SUCCESS;
	}

	public SampleService getService() {
		return service;
	}

	public void setService(SampleService service) {
		this.service = service;
	}

	public String getAccout() {
		return accout;
	}

	public void setAccout(String accout) {
		this.accout = accout;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	
	
}
