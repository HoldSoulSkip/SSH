package hhjt.service;

import static org.junit.Assert.*;

import java.util.List;

import hhjt.bean.Account;
import hhjt.bean.Order;
import hhjt.bean.Ticket;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderServiceTest {

	/*private OrderService ods;
	private Account act1;
	private Ticket tic1;
	private Order odr1,odr2;
	@Before
	public void startSpring(){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		ods=(OrderService) ctx.getBean("orderService");
		/*act1=new Account();
		act1.setId(3);
		tic1=new Ticket();
		tic1.setId(1);
		odr1=new Order();
		odr1.setAccount(act1);
		//odr1.setOrder_state(0);
		odr1.setTicket(tic1);
		
		odr2=new Order();
		odr2.setAccount(act1);
		//odr2.setOrder_state(0);
		odr2.setTicket(tic1);
	}

	/*@Test
	public void testAddOrder(){
		//ods.addOrder(odr1);
		//ods.addOrder(odr2);
		assertEquals(new Integer(5),odr1.getId());
		assertEquals(new Integer(7),odr2.getId());
	}
	
	@Test
	public void testUptOrder(){
		odr1.setId(5);
		//odr1.setOrder_id(123);
		ods.uptOrder(odr1);
		//assertEquals(new Integer(123),odr1.getOrder_id());
	}
	
	@Test
	public void testDelOrder(){
		odr2.setId(6);
		ods.delOrder(odr2);
	}
	
	@Test
	public void testListOrders(){
	//	List<Order> odrs=ods.listOrders(act1);
//		for(Order od:odrs)
//			System.out.println(od.getId());
	}
	
	@Test
	public void verifyOrder(){
		odr1.setId(5);
		odr1.setOrder_state(1);
		ods.verifyOrder(odr1);
		assertEquals(1, odr1.getOrder_state());
	}*/
}
