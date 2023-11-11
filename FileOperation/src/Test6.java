import java.io.File;

public class Test6 
{

	public static void main(String[] args) 
	{
		
		int fileCount = 0;
		int txtCount = 0;
		int jpgCount = 0;
		int javaCount = 0;
		int zipCount = 0;
		int dirCount = 0;
		String location = "D:\\";
		File f = new File(location);
		
		String [] names = f.list();
		
		for (String name : names)
		{
			File f1 = new File(f,name);
			if(f1.isDirectory())
				dirCount++;
			
			if(f1.isFile())
			{
				if(name.endsWith(".txt"))
					txtCount++;
				
				if(name.endsWith(".jpg"))
					jpgCount++;
				
				if(name.endsWith(".java"))
					javaCount++;
				
				if(name.endsWith(".zip"))
					zipCount++;
				
				fileCount++;
			}
			
			System.out.println(name+"::"+name.length());
		}
		
		System.out.println(" Total No of TXT files :: "+txtCount);
		System.out.println(" Total No of JPG files :: "+jpgCount);
		System.out.println(" Total No of JAVA files :: "+javaCount);
		System.out.println(" Total No of ZIP files :: "+zipCount);
		System.out.println(" Total No of files :: "+fileCount);
		System.out.println(" Total No of Directory :: "+dirCount);
		
	}

}
