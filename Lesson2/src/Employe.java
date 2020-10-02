
public class Employe {
private String name;
private int salary;
static String departmentname="It";

public Employe() {
	
}
public Employe(String name, int salary){
	this.name=name;
	this.salary= salary;
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;}
	public void Print() {
		System.out.println(name);
		System.out.println(salary);
	}
}


