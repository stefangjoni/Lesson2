
public class CircleTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
Circle c = new Circle();
c.setRadius(3);
int r=c.getRadius();
System.out.println(r);
//instruksionet 9 dhe 10 mund te shkruhen te dyja keshtu
System.out.println(c.getRadius());
Circle c1 = new Circle(5);
System.out.println(c1.getRadius());
System.out.println(c1.getPerimeter());
	}

}
