package com.rahul.main;

import com.rahul.bean.Course;
import com.rahul.bean.Student;

public class TestApp {
	
	public static void main(String[] args) {
		
		Course c1 = new Course("A11", "JAVA", 1000);
		Course c2 = new Course("B11", "PYTHON", 2000);
		Course c3 = new Course("C11", "BlockChain", 3000);
		
		Course[] course = new Course[3];
		course[0] = c1;
		course[1] = c2;
		course[2] = c3;
		
		Student s1 = new Student("IND10", "SACHIN", "MI", course);
		Student s2 = new Student("IND7", "DHONI", "CSK", course);
		Student s3 = new Student("IND18", "KOHLI", "RCB", course);
		
		s1.getStudentDetails();
		s2.getStudentDetails();
		s3.getStudentDetails();
		
	}

}
