package hhjt.action;

import hhjt.bean.Ticket;
import hhjt.service.TicketService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

@Controller(value="ticketAction")
@Scope(value="prototype")
public class TicketAction {

	@Autowired
	private TicketService ticService;
	
	private String use_time;
	private List<Ticket> tickets;
	
	public String findTickets() throws Exception {
		SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd");
		Date dateTime = dateformat.parse(use_time);
		tickets = ticService.findTicketByTime(dateTime);
		return "success";
	}
	
	public void setUse_time(String use_time) {
		this.use_time = use_time;
	}

	public String getUse_time() {
		return use_time;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

}
