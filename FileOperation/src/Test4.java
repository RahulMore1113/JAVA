import java.io.File;
import java.io.IOException;

public class Test4 
{

	public static void main(String[] args) throws IOException 
	{
		
		File f = new File("iNeuron");
		f.mkdir();
		System.out.println("Is f directed to a directory :: "+f.isDirectory());
		
		File f1 = new File(f, "abc.txt");
		f1.createNewFile();
		System.out.println("Is f1 pointing to a file :: "+f1.isFile());
		
		System.out.println(f1.length());
		
	}

}
