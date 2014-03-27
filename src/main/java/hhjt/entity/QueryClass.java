package hhjt.entity;

import java.io.Serializable;

public class QueryClass implements Serializable {
	private static final long serialVersionUID = 176959234347494410L;
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
