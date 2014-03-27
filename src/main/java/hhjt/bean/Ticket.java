package hhjt.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_ticket")
public class Ticket implements Serializable {

	
	private static final long serialVersionUID = 3526699945755369777L;

	@Id
	@GeneratedValue
	private Integer id;
	
	private double price;
	private String class_name;
	
	private Date begin_time;
	private Date end_time;
	private int tic_limit;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public Date getBegin_time() {
		return begin_time;
	}
	public void setBegin_time(Date begin_time) {
		this.begin_time = begin_time;
	}
	public Date getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}
	public int getTic_limit() {
		return tic_limit;
	}
	public void setTic_limit(int tic_limit) {
		this.tic_limit = tic_limit;
	}
	
	
}
