package hhjt.service;

import static org.junit.Assert.*;

import java.util.List;

import hhjt.bean.Account;
import hhjt.bean.Message;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountServiceTest {

	private AccountService actService;
	private Account act1;
	@Before
	public void startSpring(){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		actService=(AccountService)ctx.getBean("actService");
		act1=new Account();
		act1.setName("act1");
		act1.setPassword("123");
		act1.setLevel(1);
	}
	
	/*@Test
	public void testLogin(){	
		Account act=actService.login(act1);
		assertNotNull(act);
		act1.setPassword("456");
		act=actService.login(act1);
		assertNull(act);
	}*/
	
	/*@Test
	public void testCheckName(){
		assertFalse(actService.checkName(act1));
	}*/
	
	/*@Test
	public void testRegiste(){
		Account act=actService.registe(act1);
		assertEquals(act.getId(),new Integer(7));
	}*/
	
	/*@Test
	public void testSetLevel(){
		act1.setId(9);
		act1.setLevel(3);
		Account act=actService.setLevel(act1);
		assertEquals(act.getLevel(), new Integer(3));
	}*?
	
	/*@Test
	public void testListAllAccounts(){
		List<Account> acts=actService.listAllAccounts();
		for(Account act:acts)
			System.out.println(act.getId());
	}*/

}
