package model;

public class Calculator {
	public void calc(FormulaBean bean) {
		int x = Integer.valueOf(bean.getX());
		int y = Integer.valueOf(bean.getY());
		bean.setAddResult(String.valueOf(x + y));
		bean.setSubResult(String.valueOf(x - y));
		bean.setMulResult(String.valueOf(x * y));
		bean.setDivResult(String.valueOf((double) x / (double) y));
	}
}
