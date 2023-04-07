package model;

public class Counter {
	public void execute(CountBean cb) {
		int count = cb.getCount();
		cb.setCount(count * 3);
	}
}
