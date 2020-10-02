
public class EmployeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe t1 = new Employe();
		t1.setName("Stefan");
		t1.setSalary(450);
		
		System.out.println(t1.getName());
		System.out.println(t1.getSalary());
		Employe t2 = new Employe("Tedi" , 234);
		t2.Print();
System.out.println(Employe.departmentname);
	}

}
