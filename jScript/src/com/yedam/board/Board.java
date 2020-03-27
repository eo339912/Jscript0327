package com.yedam.board;

public class Board {
	int bNo;
	String bContent;
	String bWriter;
	String bDate;
	
	@Override
	public String toString() {
		return "Board [bNo=" + bNo + ", bContent=" + bContent + ", bWriter=" + bWriter + ", bDate=" + bDate + "]";
	}
	public int getbNo() {
		return bNo;
	}
	public void setbNo(int bNo) {
		this.bNo = bNo;
	}
	public String getbContent() {
		return bContent;
	}
	public void setbContent(String bContent) {
		this.bContent = bContent;
	}
	public String getbWriter() {
		return bWriter;
	}
	public void setbWriter(String bWriter) {
		this.bWriter = bWriter;
	}
	public String getbDate() {
		return bDate;
	}
	public void setbDate(String bDate) {
		this.bDate = bDate;
	}
	
	
	
	
}
