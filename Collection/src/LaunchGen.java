import java.util.ArrayList;

class Student {
	private int age;
	private int marks;
	private String name;

	public Student(int age, int marks, String name) {
		super();
		this.age = age;
		this.marks = marks;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public int getMarks() {
		return marks;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", marks=" + marks + ", name=" + name + "]";
	}

}

public class LaunchGen {

	public static void main(String[] args) {

		Student s1 = new Student(12, 75, "Rahul");
		Student s2 = new Student(14, 99, "Sharma Ji Ka Beta");
		Student s3 = new Student(12, 75, "Rohan");

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);

		System.out.println(al);

	}

}
