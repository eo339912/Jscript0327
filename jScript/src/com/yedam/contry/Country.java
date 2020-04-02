package com.yedam.contry;

public class Country {

	String cId;
	String cName;
	int rId;
	
	
	
	public Country(String cId, String cName, int rId) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.rId = rId;
	}
	
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getrId() {
		return rId;
	}
	public void setrId(int rId) {
		this.rId = rId;
	}
	
	@Override
	public String toString() {
		return "contries [cId=" + cId + ", cName=" + cName + ", rId=" + rId + "]";
	}
	
	
	
}
