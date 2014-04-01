package hhjt.entity;

/**
 * 
 * @author 炜
 *为t_ticket数据库的搜索语句设定t.name和t.value的数据结构
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
