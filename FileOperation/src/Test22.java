import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal11
{
	int i = 10;
	Animal11() 
	{
		System.out.println("Animal constructor called...");
	}
}

class Dog11 extends Animal11 implements Serializable
{
	int j = 20;
	Dog11()
	{
		System.out.println("Dog constructor called...");
	}
}

public class Test22 
{

	public static void main(String[] args) throws Exception 
	{
		Dog11 d = new Dog11();
		d.i=100;
		d.j=200;
		
		System.out.println("Serialization Started...");
		String fileName = "Rahul.ser";
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		System.out.println(d.i+" :: "+d.j);
		System.out.println("Serialization Ended...");
		
		System.in.read();
		
		System.out.println("De-Serialization Started...");
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog11 d1=(Dog11) ois.readObject();
		System.out.println(d1.i+" :: "+d1.j);
		System.out.println("De-Serialization Ended...");
	}

}
