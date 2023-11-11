import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test10 
{

	public static void main(String[] args) throws IOException 
	{

		FileWriter fw = new FileWriter("abc.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(105);
		bw.write("Neuron");
		
		bw.newLine();
		
		char[] ch = {'P', 'W', 'S', 'K', 'I', 'L', 'L', 'S'};
		
		bw.write(ch);
		
		bw.newLine();
		
		bw.write("Unicorn");
		
		bw.flush();
		
		bw.close();

	}

}
