import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account1 implements Serializable
{
	String Name = "Rahul";
	transient String Password = "More";
	transient int Pin = 1113;
	
	private void writeObject(ObjectOutputStream oos) throws Exception
	{
		System.out.println("writeObject method is called...");
		oos.defaultWriteObject();
		String encypwd = Password+"123";
		oos.writeObject(encypwd);
		int encypin = Pin+111;
		oos.writeObject(encypin);
	}
	
	private void readObject(ObjectInputStream ois) throws Exception
	{
		System.out.println("readObject method is called...");
		ois.defaultReadObject();
		String encypwd = (String) ois.readObject();
		Password = encypwd.substring(3);
		int encypin = ois.readInt();
		Pin= encypin-1111;
	}
}

public class Test21
{

	public static void main(String[] args) throws Exception
	{
		
		Account1 a = new Account1();
		
		System.out.println("Serialization Started...");
		String fileName = "abc.ser";
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a);
		System.out.println("Serialization Ended...");
		
		System.in.read();
		
		System.out.println("De-Serialization Started...");
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account1 a1 = (Account1) ois.readObject();
		System.out.println("Name is :: "+a1.Name);
		System.out.println("Password is :: "+a1.Password);
		System.out.println("Pin is :: "+a1.Pin);
		System.out.println("De-Serialization Ended...");
		
	}

}
