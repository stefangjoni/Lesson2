
public class Student {
	private String name;
	private String surname;
	private int age;
	static String course= "Java";
	public String email;
	public Student() {
		
	}
	
	public Student(String  n, String s, int a) {
		name=n;
		surname=s;
		age=a;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSurname(String s) {

		surname=s;

	}
	public void setAge(int age) {
		this.age=age;
	}

	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public int getAge() {
		return age;
	}
	public void print() {
		System.out.println(name);
		System.out.println(surname);
		System.out.println(age);
	}
}
