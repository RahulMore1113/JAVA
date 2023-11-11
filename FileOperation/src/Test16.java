import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class Test16
{

	public static void main(String[] args) throws Exception
	{
		
		BufferedReader br1 = new BufferedReader(new FileReader("Input1.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("Input2.txt"));
		PrintWriter pw = new PrintWriter("Output.txt");
		
		String target1 = br1.readLine();
		String target2 = br2.readLine();
		
		while(target1!=null || target2!=null)
		{
			boolean isAvailable = false;
			BufferedReader br11 = new BufferedReader(new FileReader("Output.txt"));
			BufferedReader br22 = new BufferedReader(new FileReader("Output.txt"));
			String line = br11.readLine();
			line = br22.readLine();
			
			while(line!=null)
			{
				if(line.equals(target1) || line.equals(target2))
				{
					isAvailable=true;
					break;
				}
				line=br11.readLine();
				line=br22.readLine();
			}
			if(isAvailable==false)
			{
				pw.println(target1);
				pw.println(target2);
				pw.flush();
			}
			target1=br1.readLine();
			target2=br2.readLine();
		}
		br1.close();
		br2.close();
		pw.close();

	}

}
