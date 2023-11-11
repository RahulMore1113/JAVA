import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Test14 
{

	public static void main(String[] args) throws IOException
	{
		
		PrintWriter pw = new PrintWriter("File3.txt");
		
		//reading from first file and writing to file3.txt
		BufferedReader br = new BufferedReader(new  FileReader("File1.txt"));
		String line = br.readLine();
		
		BufferedReader br1 = new BufferedReader(new  FileReader("File2.txt"));
		String line1 = br1.readLine();
		
		while(line!=null || line1!=null)
		{
			if(line!=null)
			{
				pw.println(line);
				line=br.readLine();
			}
			
			if(line1!=null)
			{
				pw.println(line1);
				line1=br1.readLine();
			}
			
		}
		
		
		pw.flush();
		
		br.close();
		pw.close();
		
		System.out.println("Open the File3.txt to see the merge data");

	}

}
