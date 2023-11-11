import java.io.FileReader;
import java.io.IOException;

public class Test8 
{

	public static void main(String[] args) throws IOException 
	{

		FileReader f1 = new FileReader("Rahul.txt");
		int i = f1.read();
		System.out.println(i);
		System.out.println();
		
		while(i!=-1)
		{
			System.out.print(i+"---");
			System.out.println((char) i);
			i=f1.read();
		}
		
	}

}
