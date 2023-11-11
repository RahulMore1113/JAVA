import java.util.ArrayList;

public class LaunchALIM {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(11);
		al.add(22);
		al.add(33);
		al.add(44);
		System.out.println(al);

		System.out.println(al.contains(44));

		System.out.println(al.indexOf(22));

		System.out.println(al.isEmpty());
		al.ensureCapacity(10);
		System.out.println(al.size());
		al.trimToSize();
		System.out.println(al.getClass());

		al.clear();
		System.out.println(al);
		System.out.println(al.size());

	}

}
