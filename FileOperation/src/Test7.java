import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test7 
{

	public static void main(String[] args) throws IOException 
	{
		
		File f1 = new File("abc.txt");
		FileWriter f2 = new FileWriter(f1,true);
		
		f2.write("\n");
		f2.write(97);
		f2.write("\n");
		f2.write("Hello I am Rahul");
		f2.write("\n");
		
		char[] ch = {'R','A','H','U','L'};
		f2.write(ch);
		f2.write("\t");
		
		f2.flush();
		f2.close();
		
		System.out.println("Open the abc.txt file to read the data inside that file");
		
	}

}
