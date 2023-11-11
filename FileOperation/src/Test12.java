import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test12 
{

	public static void main(String[] args) throws IOException 
	{

		FileWriter fw = new FileWriter("abc.txt");
		PrintWriter br = new PrintWriter(fw);
		
		br.write(100);
		br.write("\n");
		
		br.println(100);
		
		br.println(true);
		
		br.println('c');
		br.println("DenisRitchie");
		
		br.flush();
		br.close();

	}

}
