import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test11 
{

	public static void main(String[] args) throws IOException 
	{

		FileReader fw = new FileReader("abc.txt");
		BufferedReader bw = new BufferedReader(fw);
		
		String line = bw.readLine();
		
		while(line!=null)
		{
			System.out.println(line);
			line=bw.readLine();
		}
		
		bw.close();

	}

}
