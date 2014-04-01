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

	@SuppressWarnings("deprecation")
	@Test
	public void test() throws ParseException{
		//service测试时不能直接创建，要读取spring配置文件，否则会为空指针
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationcontext.xml");
		TicketServiceImpl service = (TicketServiceImpl) ac.getBean("ticketServiceImpl");
		Ticket t = new Ticket();
		Date time = new Date();
		Date time2 = new Date();
		
		time2.setMonth(time.getMonth()+7);
		t.setEnd_time(time2);
		t.setBegin_time(time);
		t.setClass_name("普通票");
		t.setPrice(90.0);
		String s = "2014-05-28"; 
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		//Date s_date =(Date)sdf.parse(s);
		//List<Ticket> tic = service.findTicketByPriceAndBeginTime(90.0, s_date);
		
		//List<Ticket> tic = service.findTicketByType("普通票");
		List<Ticket> tic = service.findTicketByTime(s);
		//service.addTicket(t);		
		System.out.println(tic.iterator().next().getClass_name());
	}
}
