package model;

import java.io.Serializable;

public class CountBean implements Serializable {
	private int count;
	
	public CountBean() {}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
