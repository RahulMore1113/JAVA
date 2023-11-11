import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Receiver {

	public static void main(String[] args) throws Exception {

		String fileName = "Rahul.ser";

		System.out.println("De-serialization Started...");
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		DemoDog d = (DemoDog) ois.readObject();
		System.out.println(d.i + " :: " + d.j);
		System.out.println("De-serialization Ended...");

	}

}
