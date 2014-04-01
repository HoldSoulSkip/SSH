package hhjt.service;

import static org.junit.Assert.*;

import java.util.List;

import hhjt.bean.Account;
import hhjt.bean.Message;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageServiceTest {

	/*private MessageService msgService;
	private Account act1,act2;
	private Message msg1,msg2;
	@Before
	public void startSpring(){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		msgService=(MessageService)ctx.getBean("msgService");
		
		act1=new Account();
		act1.setId(1);
		
		act2=new Account();
		act2.setId(2);
		
		msg1=new Message();
		msg1.setContent("Hello1");
		msg1.setSendAccount(act1);
		msg1.setRecvAccount(act2);
		
		msg2=new Message();
		msg2.setContent("Hello2");
		msg2.setSendAccount(act2);
		msg2.setRecvAccount(act1);
	}
	
	@Test
	public void testSendMsg(){
		msgService.sendMsg(msg1);
		msgService.sendMsg(msg2);
	}
	
	@Test
	public void testRemoveMsg(){
		msg1.setId(1);
		msgService.removeMsg(msg1);
	}
	
	
	@Test
	public void testGetSendMsg() {
		List<Message> res=msgService.getSendMsg(act1);
		for(Message msg:res){
			System.out.println(msg.getId());
		}
	}
	
	@Test
	public void testGetRecvMsg(){
		List<Message> res=msgService.getRecvMsg(act1);
		for(Message msg:res){
			System.out.println(msg.getId());
		}
	}*/

}
