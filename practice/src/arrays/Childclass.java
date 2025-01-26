package arrays;

import java.security.PublicKey;

public class Childclass {
	public void printme() {
		System.out.println("hello");
	}
  public static void main(String[] args) {
	Employye es=new Employye();
	es.setId(20);
	System.out.print(es.getId());
	es.setLocationString("Hyderabad");
	System.out.print(es.getLocationString());
	
	
	
}
}
