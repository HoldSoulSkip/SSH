package hhjt.action;

import hhjt.bean.Accout;
import hhjt.service.SampleService;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

@Controller
@Scope(value="prototype")
public class SampleAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Resource
	private SampleService service;
	
	private String accout;
	private String passwd;
	
	public String execute(){
		Accout act=new Accout();
		act.setAccout(accout);
		act.setPasswd(passwd);
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
