package hhjt.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="t_order")
public class Order implements Serializable {

	private static final long serialVersionUID = -8211201344369020722L;

	@Id
	@GeneratedValue
	private Integer id;

	private Integer order_id;
	@ManyToOne(fetch=FetchType.EAGER,optional=false)
	@JoinColumn(name="tic_type")
	private Ticket ticket;
	
	@ManyToOne(fetch=FetchType.EAGER,optional=false)
	@JoinColumn(name="account_id")
	private Account account;
	private Date order_time;
	private Date tic_use_time;
	private int order_state;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Date getOrder_time() {
		return order_time;
	}

	public void setOrder_time(Date order_time) {
		this.order_time = order_time;
	}

	public Date getTic_use_time() {
		return tic_use_time;
	}

	public void setTic_use_time(Date tic_use_time) {
		this.tic_use_time = tic_use_time;
	}

	public int getOrder_state() {
		return order_state;
	}

	public void setOrder_state(int order_state) {
		this.order_state = order_state;
	}
	
}
