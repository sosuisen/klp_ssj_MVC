package model;

import java.io.Serializable;

public class FormulaBean implements Serializable {
	private String x = "";
	private String y = "";
	private String addResult = "";
	private String subResult = "";
	private String mulResult = "";
	private String divResult = "";
	
	public FormulaBean() {}

	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
	public String getAddResult() {
		return addResult;
	}

	public void setAddResult(String addResult) {
		this.addResult = addResult;
	}

	public String getSubResult() {
		return subResult;
	}

	public void setSubResult(String subResult) {
		this.subResult = subResult;
	}

	public String getMulResult() {
		return mulResult;
	}

	public void setMulResult(String mulResult) {
		this.mulResult = mulResult;
	}

	public String getDivResult() {
		return divResult;
	}

	public void setDivResult(String divResult) {
		this.divResult = divResult;
	}
}
