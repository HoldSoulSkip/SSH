package hhjt.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
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

	@Column(name="order_id")
	private String orderId;
	@ManyToOne(fetch=FetchType.EAGER,optional=false)
	@JoinColumn(name="tic_type")
	private Ticket ticket;
	
	@ManyToOne(fetch=FetchType.EAGER,optional=false)
	@JoinColumn(name="account_id")
	private Account account;
	
	@Column(name="order_time")
	private Date orderTime;
	
	@Column(name="tic_use_time")
	private Date ticUseTime;
	
	@Column(name="order_state")
	private int orderState;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public Date getTicUseTime() {
		return ticUseTime;
	}

	public void setTicUseTime(Date ticUseTime) {
		this.ticUseTime = ticUseTime;
	}

	public int getOrderState() {
		return orderState;
	}

	public void setOrderState(int orderState) {
		this.orderState = orderState;
	}

	
	
}
