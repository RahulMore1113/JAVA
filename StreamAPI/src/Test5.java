import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test5 
{

	public static void main(String[] args) 
	{
		ArrayList<String> AL = new ArrayList<>();
		AL.add("Rahul");
		AL.add("Sanjay");
		AL.add("More");
		
		System.out.println(AL);
		System.out.println();
		
		//till JDK 1.7V
		ArrayList<String> uppreCaseName= new ArrayList<>();
		for(String name:AL)
			uppreCaseName.add(name.toUpperCase());
		
		System.out.println(uppreCaseName);
		System.out.println();
		
		//From JDK 1.8V using streams
		List<String> streamList=AL.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println(streamList);
		
		streamList.forEach(name->System.out.println(name));
		System.out.println();
		
		streamList.forEach(System.out::println);
		
	}

}
