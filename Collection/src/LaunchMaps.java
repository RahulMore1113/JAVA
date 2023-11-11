import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LaunchMaps {

	public static void main(String[] args) {

		HashMap hm = new HashMap();
		hm.put(10, "Sachin");
		hm.put(7, "MSD");
		hm.put(18, "Kohli");
		System.out.println(hm);

		System.out.println(hm.get(10) + " after this");
		System.out.println("************************");

		Collection c = hm.values();
		Iterator itr = c.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("************************");

		Set s = hm.keySet();
		Iterator itr2 = s.iterator();
		while (itr2.hasNext()) {
			System.out.println("Key : " + itr2.next());
		}
		System.out.println("************************");

		Set es = hm.entrySet();
		Iterator itr3 = es.iterator();
		while (itr3.hasNext()) {
			Map.Entry data = (Entry) itr3.next();
			System.out.println(data.getKey() + " : " + data.getValue());
		}
		System.out.println("************************");

		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put(10, "Sachin");
		lhm.put(7, "MSD");
		lhm.put(18, "Kohli");
		System.out.println(lhm);

	}

}
