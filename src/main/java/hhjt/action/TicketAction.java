package hhjt.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller(value="ticketAction")
@Scope(value="prototype")
public class TicketAction {

	private Date begin_time;
	private Date deadline;
	private String tic_type;
	private double price;
	private Date orderTime;
	private String showTime;
	
	private Date time = new Date();
	public String findTickets() {
		return "input";
	}
	
	public Date getBegin_time() {
		return begin_time;
	}
	public void setBegin_time(Date begin_time) {
		this.begin_time = begin_time;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public String getTic_type() {
		return tic_type;
	}
	public void setTic_type(String tic_type) {
		this.tic_type = tic_type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public Date getOrderTime() {
		return time;
	}

	public void setOrderTime(Date orderTime) {
		System.out.println(orderTime);
		this.orderTime = orderTime;
	}

	public String getShowTime() {
		SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(dateformat.format(time));
		return dateformat.format(time);
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	
}
