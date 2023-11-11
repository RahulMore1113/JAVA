import java.util.HashMap;

class Employee {
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

public class LaunchGC {

	public static void main(String[] args) throws Exception {

		Employee e = new Employee();
		HashMap hm = new HashMap();
		hm.put(e, "Rahul");
		e = null;
		System.gc();

		Thread.sleep(4000);
		System.out.println(hm);

	}

}
