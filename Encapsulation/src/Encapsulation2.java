class Employee
{
	private int age;      //instance variable//Data Member//Fields
	private String name;   //properties
	private String city;
	private boolean married;
	
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
	public boolean isMarried()
	{
		return married;
	}	
}
public class Encapsulation2 {

	public static void main(String[] args) {
		
		Employee st=new Employee();
		st.setCity("Pune");
		System.out.println(st.getCity());
		
		Employee st2=new Employee();
		st2.setCity("Bengaluru");
		System.out.println(st.getCity());
		
	}

}
