import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//class ComImpl implements Comparator<Integer>
//{
//
//	@Override
//	public int compare(Integer o1, Integer o2) 
//	{
//		if(o1>o2)
//			return 1;
//		return -1;
//	}
//
//}

public class ComparatorDemo {

	public static void main(String[] args) {

		List<Integer> values = new ArrayList<Integer>();
		values.add(305);
		values.add(998);
		values.add(774);
		values.add(236);
		values.add(881);

//		Comparator<Integer> c = (o1,o2) -> //using lambda expression
//		{
////			if(o1%10<o2%10)			//sort string depending no of length from last side
////				return 1;
////			return -1;
//			
//			return o1%10<o2%10?1:-1;  // ternary operator
//		};
//		
//		Comparator<Integer> c = new Comparator<Integer>() //using anonymous class 
//		{
//
//			@Override
//			public int compare(Integer o1, Integer o2) 
//			{
//				if(o1%10<o2%10)			//sort string depending no of length from last side
//					return 1;
//				return -1;
//			}
//
//		};

		Collections.sort(values, (o1, o2) -> {
			return o1 % 10 < o2 % 10 ? 1 : -1;
		});

//		values.forEach(System.out::println);

		for (int i : values) {
			System.out.println(i);
		}

		List<String> l = new ArrayList<>();
		l.add("Rahul");
		l.add("Sanjay");
		l.add("More");
		l.add("Science");
		l.add("Computer");
		l.add("Programing");

		System.out.println(l);

		Collections.sort(l);

		System.out.println(l);

	}

}
