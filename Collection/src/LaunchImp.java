import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;

public class LaunchImp {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(10);
		al.add(10.5);
		al.add('c');
		al.add(10.5f);
		System.out.println(al);

		ArrayList al2 = new ArrayList();
		al2.add(10);
		al2.add(20);
		al2.add(30);
		al2.add(40);
		al2.add(50);
		System.out.println(al2);

		System.out.println(al2.size());
		for (int i = 0; i < al2.size(); i++) {
			System.out.println(al2.get(i) + " ");
		}

		System.out.println();

		for (Object obj : al2) {
			System.out.println(obj + " ");
		}

		System.out.println();

		Iterator itr = al2.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Reverse");

		ListIterator litr = al2.listIterator(al2.size());

		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}

		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		Iterator it = ts.iterator();
		while (it.hasNext() == true) {
			System.out.println("Array De " + it.next());
		}

		System.out.println("Added Linked List");
		LinkedList ll = new LinkedList();
		ll.addAll(ts);

		System.out.println(ll);

		ListIterator litr2 = ll.listIterator(ll.size());
		System.out.println("Accessing treeset data in reverse");
		while (litr2.hasPrevious()) {
			System.out.println(litr2.previous());
		}

		LinkedList ll2 = new LinkedList();
		ll2.add(100);
		ll2.add(200);
		ll2.add(300);
		ll2.add(400);
		ll2.add(500);
		System.out.println(ll2);

		Iterator ditr = ll2.descendingIterator();

		while (ditr.hasNext()) {
			System.out.println(ditr.next() + " ");
		}

	}

}
