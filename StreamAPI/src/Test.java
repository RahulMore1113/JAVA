class Sample
{
	private String s;
	Sample(String s)
	{
		this.s=s;
		System.out.println("Constructor executed... "+s);
	}
}

@FunctionalInterface
interface Interf
{
	public Sample get(String s);
}

public class Test 
{

	public static void main(String[] args) 
	{
		
		Interf i = s -> new Sample(s);
		i.get("from lambda expression..");
		
		System.out.println();
		
		//constructor reference
		Interf i2 = Sample::new;
		i2.get("from constructor reference...");

	}

}
