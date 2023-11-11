import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class LaunchCollections {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		System.out.println(ts);

		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		System.out.println(al);

		Collections.sort(al);
		System.out.println(al);
		
		ArrayList<String> al2 = new ArrayList<>();
		al2.add("Rahul");
		al2.add("Sanjay");
		al2.add("More");
		Collections.sort(al2);
		System.out.println(al2);
		
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al3.add(1000);
		al3.add(200);
		Collections.sort(al3);
		System.out.println(al3);
		
		ArrayList al4 = new ArrayList();
		al4.add(10);
		al4.add(20);
		al4.add(30);
		al4.add(40);
		al4.add(50);
		int index = Collections.binarySearch(al4, 40);
		System.out.println("Index " + index);
		
		Collections.shuffle(al4);
		System.out.println(al4);
		
		System.out.println(Collections.frequency(al4, 40));

	}

}
