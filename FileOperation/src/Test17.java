import java.io.*;

class Dog implements Serializable
{
	static 
	{
		System.out.println("Static block executed...");
	}
	Dog()
	{
		System.out.println("Object is created...");
	}
	final transient int i = 10;
	static transient int j = 20;
}

class Cat implements Serializable
{
	static 
	{
		System.out.println("Cat Static block executed...");
	}
	Cat()
	{
		System.out.println("Cat Object is created...");
	}
	int i = 100;
	int j = 200;
}

public class Test17 
{

	public static void main(String[] args) throws Exception
	{
		
		Dog d = new Dog();
		Cat c = new Cat();
		
		System.out.println("Serialization Started...");
		String fileName = "abc.ser";
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		oos.writeObject(c);
		System.out.println("Serialization Object reference is :: "+d);
		System.out.println("Serialization Object reference is :: "+c);
		System.out.println("Serialization Ended...");
		
		System.in.read();
		
		System.out.println("De-Serialization Started...");
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d1 = (Dog)ois.readObject();
		Cat c1 = (Cat)ois.readObject();
		
//		Object obj = ois.readObject();
//		Dog d1 = (Dog)obj;
		System.out.println("De-Serialization Object reference of Dog is :: "+d1);
		System.out.println("Dog Object reference is "+d1.i+" :: "+d1.j);
		System.out.println("De-Serialization Object reference of Cat is :: "+c1);
		System.out.println("Cat Object reference is "+c1.i+" :: "+c1.j);
		System.out.println("De-Serialization Ended...");
		
	}

}
