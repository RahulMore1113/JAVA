import java.util.Hashtable;

class Ineuron
{
	int i;
	public Ineuron(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return i + "";
	}
}

public class LaunchHT {

	public static void main(String[] args) {
		
		Hashtable ht = new Hashtable();
		ht.put(11, "Rahul");
		ht.put(12, "More");
		System.out.println(ht);
		
		Hashtable ht2 = new Hashtable();
		ht2.put(new Ineuron(11), "Rahul");
		ht2.put(new Ineuron(12), "Sanjay");
		ht2.put(new Ineuron(13), "More");
		System.out.println(ht2);
		
	}
	
}
