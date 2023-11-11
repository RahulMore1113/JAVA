import java.util.ArrayList;
import java.util.function.*;

class MyConsumer implements Consumer<String>
{
	@Override
	public void accept(String name)
	{
		System.out.println("accept method got called...");
		System.out.println(name);
	}
}

public class Test2
{

	public static void main(String[] args) 
	{
		ArrayList<String> AL = new ArrayList<>();
		AL.add("Rahul");
		AL.add("Sanjay");
		AL.add("More");
		
		System.out.println(AL);
		System.out.println();
		
		//Traditional approach
		Consumer<String> consumer = new MyConsumer();
		AL.forEach(consumer);
		System.out.println();
				
		//lambda expression 
		AL.forEach(name->System.out.println(name));
		System.out.println();
		
		//method reference
		AL.forEach(System.out::println);
		
			
	}

}
