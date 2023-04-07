package model;

public class Counter {
	public CountBean execute(CountBean cb) {
		int count = cb.getCount();
		cb.setCount(count * 3);
		return cb;
	}
}
