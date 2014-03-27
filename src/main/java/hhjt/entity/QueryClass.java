package hhjt.entity;

/**
 * 
 * @author 炜
 * 为t_ticket数据库搜索语句中的t.name和t.value设定的数据结构
 *
 */
public class QueryClass {
	private String name;
	private Object value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
}
