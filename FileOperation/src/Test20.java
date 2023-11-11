import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable
{
	String Name = "Rahul";
	transient String Password = "More";
}

public class Test20
{

	public static void main(String[] args) throws Exception
	{
		
		Account a = new Account();
		
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
		Account a1 = (Account ) ois.readObject();
		System.out.println("Name is :: "+a1.Name);
		System.out.println("PAssword is :: "+a1.Password);
		System.out.println("De-Serialization Ended...");
		
	}

}
