import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class DemoDog implements Serializable {
	int i = 10, j = 20;
}

public class Sender {

	public static void main(String[] args) throws Exception {

		DemoDog d = new DemoDog();

		System.out.println("Serialization Started...");
		String fileName = "Rahul.ser";
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		System.out.println(d.i + " :: " + d.j);
		System.out.println("Serialization Ended...");

	}

}
