import java.io.File;
import java.io.IOException;

public class Test5 
{

	public static void main(String[] args) throws IOException
	{
		
		String location = "D:\\PWSkills";
		File f = new File(location);
		f.mkdir();
		
		File f1 = new File(location,"Rahul.java");
		f1.createNewFile();
		
	}

}
