
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s= new Student();
s.setAge(25);
s.setName("Xhorxhina");
s.setSurname("Bushi");

String name=s.getName();
System.out.println(name);
//ose dy instruksionet 11 dhe 12 mund te shkruhen me nje te vetem si me poshte
System.out.println(s.getSurname());
System.out.println(s.getAge());
System.out.println("une quhem " + name + " " + s.getSurname() + " dhe jam " + s.getAge());
// le ta bejm me konstruktor tani
Student s1= new Student("Iris","Xhafa",22);
s1.print();
s1.email="xxx";
System.out.println(s1.email);
String course= s1.course;
//variablat static aksesohen me emrin e klases.variabli
System.out.println(Student.course);
	}
	

}
