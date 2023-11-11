import java.util.WeakHashMap;

class Employee1 {
	private int eid;
	private String name;
	private String eAddr;

	@Override
	public String toString() {
		return "Rahul";
	}

	@Override
	public void finalize() {
		System.out.println("Garbage collector collected the object");
	}
}

public class LaunchGC2 {

	public static void main(String[] args) throws Exception {

		Employee1 e = new Employee1();
		WeakHashMap hm = new WeakHashMap();
		hm.put(e, "Rahul");
		System.out.println(hm);
		e = null;
		System.gc();

		Thread.sleep(4000);
		System.out.println(hm);

	}

}
