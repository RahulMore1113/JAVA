import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test6 
{

	public static void main(String[] args) 
	{
		

		ArrayList<String> AL = new ArrayList<>();
		AL.add("Rahul");
		AL.add("Sanjay");
		AL.add("More");
		
		System.out.println(AL);
		System.out.println();
		// type 1
		List<String> result=AL.stream().filter(name->name.length()>4).collect(Collectors.toList());
		System.out.println(result.size());
		System.out.println();
		
		// type 2
		long count = AL.stream().filter(name->name.length()>4).count();
		System.out.println("The no of objects whose string length > 4 is ::"+count);
		
	}

}
