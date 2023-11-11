import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Using Comparator & Comparable

public class Test7 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(38);
		al.add(1);
		al.add(23);
		al.add(98);
		al.add(22);
		
		System.out.println("Before sorting :: "+al);
		System.out.println();
		
		//using stream API
		List<Object> resultList = al.stream().sorted().collect(Collectors.toList());
		System.out.println("After Sorting :: "+resultList);
		System.out.println();
		
		//REsult in reverse order
		List<Integer> resultSorted = al.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println("After Sorting Reverse Order :: "+resultSorted);
		System.out.println();
		
		// find min
		Integer min =  al.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Minimum ::"+min);
		System.out.println();
		
		// find max
		Integer max =  al.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Maximun ::"+max);
	}

}
