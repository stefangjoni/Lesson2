
public class Makina {
private String ngjyra;
private String lloji;
private int viti;
static String percaktimi="automjete";

public Makina() {
	
}

public Makina(String ngjyra,String lloji, int vi) {
	this.ngjyra = ngjyra;
	this.lloji=lloji;
	viti=vi;
}
public Makina(int v) {
	viti=v;
}
 public void setNgjyra(String ngjyra) {
	 this.ngjyra=ngjyra;
	
 }
public String getNgjyra() {
	return ngjyra;
}
public void setLloji(String lloji) {
	this.lloji=lloji;
}
public String getLloji() {
	return lloji;
}
public void setViti(int v) {
	viti=v;
}
public int getViti() {
	return viti;
}

public void Shfaq() {
	System.out.println("ngjyra eshte " +ngjyra+  " dhe lloji i makines "+lloji+" e vitit "+viti);
}

}
