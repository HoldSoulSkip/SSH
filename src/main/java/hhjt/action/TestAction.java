package hhjt.action;


import javax.annotation.Resource;

import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import hhjt.bean.Account;
import hhjt.service.AccountService;
import hhjt.util.ValidateUtil;

import com.opensymphony.xwork2.ActionSupport;

@Controller("testAction")
@Scope(value = "prototype")
public class TestAction extends ActionSupport {

	private static final long serialVersionUID = 5304351963378896969L;
	private Account account;
	private String confirmPassword;

	@Resource(name = "accountService")
	private AccountService as;

	@SkipValidation
	public String toReg() {
		return "toreg";
	}
	
	public String doReg() {
		account.setLevel(1);
		as.saveEntity(account);
		return "welcome";
	}
	
	
	public void validate(){
		//1.非空
		if(!ValidateUtil.isValid(account.getName())){
			this.addFieldError("name", "name是必填项");
		}
		if(!ValidateUtil.isValid(account.getPassword())){
			this.addFieldError("password", "password是必填项");
		}
		
		if(hasErrors()){
			return ;
		}
		//密码一致性校验
		if(!account.getPassword().equals(confirmPassword)){
			addFieldError("password", "密码不一致");
			return ;
		}
		//name是否占用校验
		boolean b = as.isRegisted(account.getName());
		if(b){
			addFieldError("name", "用户名被占用");
		}
	}
	
	
	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public AccountService getAs() {
		return as;
	}

	public void setAs(AccountService as) {
		this.as = as;
	}
}


