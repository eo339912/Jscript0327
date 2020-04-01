package com.yedam.departments;

public class Departments {
	int dId;
	String dName;
	String dManagerId;
	String dLocationId;
	
	@Override
	public String toString() {
		return "Departments [dId=" + dId + ", dName=" + dName + ", dManagerId=" + dManagerId + ", dLocationId="
				+ dLocationId + "]";
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getdManagerId() {
		return dManagerId;
	}
	public void setdManagerId(String dManagerId) {
		this.dManagerId = dManagerId;
	}
	public String getdLocationId() {
		return dLocationId;
	}
	public void setdLocationId(String dLocationId) {
		this.dLocationId = dLocationId;
	}
	
	
}
