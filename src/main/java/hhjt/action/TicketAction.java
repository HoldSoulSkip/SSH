package hhjt.action;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope(value="prototype")
public class TicketAction {

	private Date begin_time;
	private Date deadline;
	private String tic_type;
	private double price;
	
	
	
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
	
}
