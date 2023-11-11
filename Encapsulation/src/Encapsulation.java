class Student
{
	private int age;      //instance variable//Data Member//Fields
	private String name;   //properties
	private String city;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}	
}
//


public class Encapsulation {

	public static void main(String[] args) {
		
		Student st=new Student();
		/*
		 * st.age=-28; st.name="Xp12XP"; st.city="Bengaluru";
		 */
		//st.age=-28; error bcz age is private 
		st.setAge(28);
		int age=st.getAge();
		System.out.println(age);
		
		st.setName("Hyder");
		System.out.println(st.getName());
		
	}

}
