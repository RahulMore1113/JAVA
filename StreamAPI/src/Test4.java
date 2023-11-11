import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 
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
		
		//till JDK1.7V
		ArrayList<Integer> doubleList = new ArrayList<>();
		
		for(Integer i1:al)
			doubleList.add(i1*2);
		
		System.out.println(doubleList);
		
		System.out.println();
		
		//From JDK1.8V
		//map-> for every object, if a new object has to be created
		List<Integer> streamList = al.stream().map(obj->obj*2).collect(Collectors.toList());
		System.out.println(streamList);
		
		System.out.println();
		
		streamList.forEach(i->System.out.println(i));
		
		System.out.println();
		streamList.forEach(System.out::println);
		
	}

}
