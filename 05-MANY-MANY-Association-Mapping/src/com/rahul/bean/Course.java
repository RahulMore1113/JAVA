package com.rahul.bean;

public class Course {

	String cid;
	String cname;
	int ccost;

	public Course(String cid, String cname, int ccost) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.ccost = ccost;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", ccost=" + ccost + "]";
	}

}
