
public class Circle {
private int radius;

//konstruktori behet pas variablave te instances dhe para metodave get dhe set
//konstruktori ka te njejten emer me klasen
//konstruktori nuk ka tip kthimi
//konstruktori perdoret per te inicializuar variablat e instance
public Circle() {
}
	public Circle(int r) {
		radius=r;
	}

public void setRadius(int radius) {
	this.radius=radius;
}
public int getRadius()
{
	return radius;
}
public double getPerimeter() {
	return 2*Math.PI*radius;
	
}
}
