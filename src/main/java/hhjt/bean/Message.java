package hhjt.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_message")
public class Message implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int id;
	
	@ManyToOne
	@JoinColumn(name="send_id")
	private Account sendAccount;
	
	@ManyToOne
	@JoinColumn(name="recv_id")
	private Account recvAccount;
	
	private String content;
	
	private int state;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	public Account getSendAccount() {
		return sendAccount;
	}
	public void setSendAccount(Account sendAccount) {
		this.sendAccount = sendAccount;
	}
	public Account getRecvAccount() {
		return recvAccount;
	}
	public void setRecvAccount(Account recvAccount) {
		this.recvAccount = recvAccount;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	

}
