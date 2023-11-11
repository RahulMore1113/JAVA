package com.rahul.main;

import com.rahul.bean.Account;
import com.rahul.bean.Employee;

public class TestApp {

	public static void main(String[] args) {

		Account account = new Account("ABC123", "sachin", "Savings");

		Employee employee = new Employee("IND10", "sachin", "MI", account);
		employee.getEmployeeDetails();

	}

}
