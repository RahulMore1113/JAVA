import java.io.*;

class Student1 implements Serializable
{
	String Name = "Rahul";
	int Age = 23;
	
}

public class Test18 
{

	public static void main(String[] args) throws Exception
	{
		
		Student1 s = new Student1();
		
		System.out.println("Serialization Started...");
		String fileName = "Student.ser";
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		System.out.println("Student Object Reference is :: "+s);
		System.out.println("Serialization Stopped...");
		
		System.out.println("De-Serialization Started...");
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student1 s1 = (Student1) ois.readObject();
		System.out.println("Student Object Reference is :: "+s1);
		System.out.println("De-Serialization Stopped...");
		
	}

}
