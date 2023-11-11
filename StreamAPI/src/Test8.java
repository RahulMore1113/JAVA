import java.util.ArrayList;

public class Test8 
{
	public static void main(String []args)
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(38);
		al.add(01);
		al.add(23);
		al.add(98);
		al.add(22);
		
		System.out.println("Array List is :: "+al);
		System.out.println();
		
		Object [] abjArr = al.stream().toArray();
		for(Object obj:abjArr)
			System.out.println(obj);
		
		System.out.println();
		
		Integer [] abjArr2 = al.stream().toArray(Integer[] :: new);
		for(Integer obj:abjArr2)
			System.out.println(obj);
		
	}

}
