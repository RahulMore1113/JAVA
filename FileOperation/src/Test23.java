import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Demo implements Externalizable
{
	transient String Name;
	int i,j;
	public Demo()
	{
		System.out.println("public zero argument constructor called...");
	}
	public Demo(String Name, int i, int j) {
		super();
		this.Name = Name;
		this.i = i;
		this.j = j;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException
	{
		
		System.out.println("writeExternal() is called for Serialization...");
		
		out.writeObject(Name);
		out.writeInt(i);
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException 
	{
		
		System.out.println("readExternal() is called for De-Serialization...");
		Name = (String) in.readObject();
		i = in.readInt();
		
	}
	
}

public class Test23 
{

	public static void main(String[] args) throws Exception 
	{
		Demo d = new Demo("Rahul", 007, 1113);
		
		System.out.println("Serialization Started...");
		String fileName = "Rahul.ser";
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		System.out.println(d.Name+" :: "+d.i+" :: "+d.j);
		System.out.println("Serialization Ended...");
		
		System.in.read();
		
		System.out.println("De-Serialization Started...");
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Demo d1=(Demo) ois.readObject();
		System.out.println(d1.Name+" :: "+d1.i+" :: "+d1.j);
		System.out.println("De-Serialization Ended...");
	}

}
