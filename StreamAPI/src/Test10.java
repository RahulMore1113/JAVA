import java.util.function.*;

public class Test10 
{

	public static void main(String[] args) 
	{

		Predicate<Integer> p = i -> i<20;
		System.out.println(p.test(10));
		
		Predicate<String> p2 = name -> name.length() >=4;
		System.out.println(p2.test("Rahul"));
		
		Function<String, Integer> f = name -> name.length();
		System.out.println(f.apply("Rahul"));

	}

}
