import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class LaunchFFFS {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);

		Iterator itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		CopyOnWriteArrayList cal = new CopyOnWriteArrayList();
		cal.add(1000);
		cal.add(2000);
		cal.add(3000);
		cal.add(4000);

		Iterator itrr = cal.iterator();

		while (itrr.hasNext()) {
			System.out.println(itrr.next());
			cal.add(12345);
		}

	}

}
