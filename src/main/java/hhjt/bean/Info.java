package hhjt.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_info")
public class Info {
	@Id
	@GeneratedValue
	private Integer id;
	private String title;

	private String content;
	private Date inof_time;
	@ManyToOne(fetch=FetchType.EAGER,optional=true)
	@JoinColumn(name="account_id")
	private Account account;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getInof_time() {
		return inof_time;
	}
	public void setInof_time(Date inof_time) {
		this.inof_time = inof_time;
	}
}
