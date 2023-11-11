import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class Test15 
{

	public static void main(String[] args) throws Exception
	{
		
		BufferedReader br = new BufferedReader(new FileReader("Input.txt"));
		PrintWriter pw = new PrintWriter("Output.txt");
		
		String target = br.readLine();
		
		while(target!=null)
		{
			boolean isAvailable = false;
			BufferedReader br1 = new BufferedReader(new FileReader("Output.txt"));
			String line = br1.readLine();
			
			while(line!=null)
			{
				if(line.equals(target))
				{
					isAvailable=true;
					break;
				}
				line=br1.readLine();
			}
			if(isAvailable==false)
			{
				pw.println(target);
				pw.flush();
			}
			target=br.readLine();
		}
		br.close();
		pw.close();

	}

}
