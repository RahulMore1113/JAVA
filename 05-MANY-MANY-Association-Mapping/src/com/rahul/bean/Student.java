package com.rahul.bean;

import java.util.Arrays;

public class Student {
	
	private String sid;
	private String sname;
	private String saddr;
	
	private Course[] course;

	public Student(String sid, String sname, String saddr, Course[] course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddr = saddr;
		this.course = course;
	}
	
	public void getStudentDetails() {
		System.out.println("STUDENT DETAILS ARE :: ");
		System.out.println("SID is :: " + sid);
		System.out.println("SNAME is :: " + sname);
		System.out.println("SADDR is :: " + saddr);
		System.out.println("COURSE DETAILS ARE :: ");
		for (Course c : course) {
			System.out.println("CID IS :: " + c.cid);
			System.out.println("CNAME IS :: " + c.cname);
			System.out.println("COST IS :: " + c.ccost);
		}
		System.out.println("--------------------------------------");
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddr=" + saddr + ", course=" + Arrays.toString(course)
				+ "]";
	}
	
	

}
