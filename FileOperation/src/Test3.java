import java.io.File;

public class Test3 
{

	public static void main(String[] args) 
	{
		
		String directoryName = "IPLteams";
		File f = new File(directoryName);
		System.out.println(f.exists());
		
		
		f.mkdir();
		System.out.println(f.exists());
		
	}

}
