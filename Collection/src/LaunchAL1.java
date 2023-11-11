import java.util.ArrayList;

public class LaunchAL1 {

	public static void main(String[] args) {

		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		System.out.println(al1);
		System.out.println("*************");

		ArrayList al2 = new ArrayList();
		al2.add("iNeuron");
		al2.add(28);
		al2.add('b');
		al2.add(18.5);
		al2.add(18.5);
		System.out.println(al2);
		System.out.println("*************");

		ArrayList al3 = new ArrayList();
		al3.addAll(al2);
		System.out.println(al3);
		System.out.println("*************");

		ArrayList al4 = new ArrayList();
		al4.add(11);
		al4.add(22);
		al4.add(33);
		al4.add(44);
		System.out.println("Existing data " + al4);
		al4.add(2, 28);
		System.out.println("After adding in 2nd index " + al4);
		al4.add(0, 5);
		System.out.println("After adding in 0th index " + al4);
		al4.add(55);
		System.out.println("After adding in rear index " + al4);
		al4.addAll(1, al2);
		System.out.println(al4);
		System.out.println("*************");

	}

}
