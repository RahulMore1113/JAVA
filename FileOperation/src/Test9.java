import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test9 
{

	public static void main(String[] args) throws IOException 
	{

		File f = new File("Rahul.txt");
		FileReader fr = new FileReader(f);
		
		char[] ch = new char[(int) f.length()];
		fr.read(ch);
		
		for(char data : ch)
			System.out.print(data);
		fr.close();

	}

}
