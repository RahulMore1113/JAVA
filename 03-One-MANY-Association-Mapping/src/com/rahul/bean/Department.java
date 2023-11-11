package com.rahul.bean;

public class Department {

	private String did;
	private String dname;

	private Employee[] emps;

	public Department(String did, String dname, Employee[] emps) {
		super();
		this.did = did;
		this.dname = dname;
		this.emps = emps;
	}

	public void getDepartmentDetails() {

		System.out.println("Department Details");
		System.out.println("--------------------");
		System.out.println("Department Id :" + did);
		System.out.println("Department Name:" + dname);
		System.out.println();
		System.out.println("Employee details are: ");
		System.out.println("--------------------");
		for (Employee employee : emps) {
			System.out.println("Employee id     :: " + employee.eid);
			System.out.println("Employee name   :: " + employee.ename);
			System.out.println("Employee address:: " + employee.eaddr);
			System.out.println();
		}

	}

}
