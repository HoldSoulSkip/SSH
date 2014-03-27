package ser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import hhjt.bean.Ticket;
import hhjt.service.impl.TicketServiceImpl;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService {

	@Test
	public void test() throws ParseException{
		//service 不能new 要从spring里读取，否则会是空指针
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationcontext.xml");
		TicketServiceImpl service = (TicketServiceImpl) ac.getBean("ticketServiceImpl");
		Ticket t = new Ticket();
		Date time = new Date();
		t.setBegin_time(time);
		t.setClass_name("优惠票");
		t.setPrice(90.0);
		String s = "2014-03-26 17:17:35"; 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		Date s_date =(Date)sdf.parse(s);
		List<Ticket> tic = service.findTicketByPriceAndBeginTime(90.0, s_date);
		//List<Ticket> tic = service.findTicketByPrice(20.0);
		//service.addTicket(t);		
		System.out.println(tic.size());
	}
}
