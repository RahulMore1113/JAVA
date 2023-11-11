import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(0);
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		
		System.out.println(al);
		
		//till jdk 1.7v
		ArrayList<Integer> evenList= new ArrayList<Integer>();
		
		for (Integer i1:al)
			if(i1%2==0)
				evenList.add(i1);
		
		System.out.println(evenList);
		
		//From JDK1.8V we use Streams
		//1. Configuration
		//2. Processing
		List<Integer> streamList = al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(streamList);
		streamList.forEach(System.out::println);
		
	}

}
