
class Student
{
	private int sID;
	private int sAge;
	private String sName;
	
	public Student(int sID, int sAge, String sName) 
	{
		super();
		this.sID = sID;
		this.sAge = sAge;
		this.sName = sName;
	}
	@Override
	public String toString() 
	{
		return "Student [sID=" + sID + ", sAge=" + sAge + ", sName=" + sName + "]";
	}
	
}

public class Test1 
{

	public static void main(String[] args) 
	{
		
		Student s1 = new Student(11, 22, "More");
		System.out.println(s1);
		
		System.out.println();
		
		Student s2 = new Student(12, 23, "Rahul");
		System.out.println(s2);
		
	}

}
