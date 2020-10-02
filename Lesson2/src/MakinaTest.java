
public class MakinaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Makina s1= new Makina();
s1.setLloji("peugeot");
s1.setNgjyra("e kuqe");
s1.setViti(1990);
System.out.println(Makina.percaktimi);
s1.Shfaq();
System.out.println("Ngjyra e makines eshte " +s1.getNgjyra()+ " dhe lloji "+s1.getLloji()+" e vitit "+s1.getViti());
Makina s2= new Makina("e bardhe"," benz", 1989);
System.out.println("po pershkruajme percaktimin per klasen " +Makina.percaktimi);
s2.Shfaq();
Makina s3= new Makina(2000);

System.out.println("kjo makine e pa percaktuar eshte e vitit " +s3.getViti());

}
}