package com.rahul.bean;

public class Branch {

	String bid;
	String bname;

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	@Override
	public String toString() {
		return "Branch [bid=" + bid + ", bname=" + bname + "]";
	}

}
