import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog1 implements Serializable
{
	Cat1 c = new Cat1();
}

class Cat1 implements Serializable
{
	Rat r = new Rat();
}

class Rat implements Serializable
{
	int j = 20;
}

public class Test19
{

	public static void main(String[] args) throws Exception
	{
		
		Dog1 d = new Dog1();
		
		System.out.println("Serialization Started...");
		String fileName = "abc.ser";
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		System.out.println("Serialization Object reference is :: "+d);
		System.out.println("Serialization Ended...");
		
		System.in.read();
		
		System.out.println("De-Serialization Started...");
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog1 d1 = (Dog1)ois.readObject();
		System.out.println(d1.c.r.j);
		System.out.println("De-Serialization Ended...");
		
	}

}
